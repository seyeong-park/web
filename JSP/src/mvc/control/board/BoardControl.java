package mvc.control.board;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.board.Command;
import mvc.command.board.CommandDelete;
import mvc.command.board.CommandException;
import mvc.command.board.CommandInput;
import mvc.command.board.CommandList;
import mvc.command.board.CommandNull;
import mvc.command.board.CommandView;
import mvc.command.board.CommandModify;

public class BoardControl extends HttpServlet {
	
	private HashMap commandMap;
	private String	jspDir = "/04_board_class_cmd/";
	private String  error = "error.jsp";
	

    public BoardControl() {
        super();       
		initCommand();
	}

	private void initCommand(){
		commandMap = new HashMap();
//Null-Daox db접근x
		commandMap.put("main-page",	new CommandNull("main.jsp") );
		//수정
		commandMap.put("modify-form",new CommandModify("BoardModifyForm.jsp") );
		//입력
		commandMap.put("input-form", new CommandInput("BoardInputForm.jsp"));
		//목록-o
		commandMap.put("input-page", new CommandList("BoardList.jsp"));
		//뷰
		commandMap.put("list-page", new CommandView("BoardView.jsp"));
		//삭제
		commandMap.put("delete-form", new CommandNull("BoardDelete.jsp"));
		//삭제확인
		commandMap.put("delete-page", new CommandDelete("deleteConfirm.jsp"));
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String nextPage = "";//xxx?cmd=
		String cmdKey	= request.getParameter("cmd");
		if( cmdKey == null ){
			cmdKey = "main-page";
		}

		
		Command cmd = null;

		try{
			
			if( commandMap.containsKey( cmdKey ) ){
				cmd = (Command)commandMap.get( cmdKey);
			}else{
				throw new CommandException("지정할 명령어가 존재하지 않음");
			}

			nextPage = cmd.execute( request, response  );

		}catch( CommandException e ){
			request.setAttribute("javax.servlet.jsp.jspException", e );
			nextPage = error;
			System.out.println("오류 : " + e.getMessage());
		}

		RequestDispatcher reqDp = getServletContext().getRequestDispatcher( jspDir + nextPage );
		reqDp.forward( request, response );
		
	}

}