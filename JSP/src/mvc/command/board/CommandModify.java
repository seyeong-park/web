package mvc.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.board.BoardDao;
import mvc.model.board.BoardException;
import mvc.model.board.BoardRec;

public class CommandModify implements Command {
	private String next;
	
	public CommandModify(String _next) {
		next = _next;
	}

	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
		BoardRec msg = new BoardRec();//제목, 패스워드, 내용
		msg.setTitle(request.getParameter("TITLE"));
		msg.setPassword(request.getParameter("PASSWORD"));
		msg.setContent(request.getParameter("CONTENT"));
		
		
			BoardDao.getInstance().update(msg);
		} catch (BoardException e) {
			
			e.printStackTrace();
		}
		return next;
	}

}
