package mvc.command.board;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.board.*;

public class CommandInput implements Command {
	private String next;

	public CommandInput( String _next ){
		next = _next;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response  ) throws CommandException {
		try{

			BoardRec msg = new BoardRec();
			msg.setWriterName( request.getParameter("WRITERNAME"));
			msg.setTitle(request.getParameter("TITLE"));
			msg.setContent( request.getParameter("CONTENT"));
			msg.setPassword(request.getParameter("PASSWORD"));
			
			BoardDao.getInstance().insert(msg);
			
		}catch( BoardException ex ){
			throw new CommandException("CommandInput.java < 입력시 > " + ex.toString() ); 
		}
		return next;
	}

}
