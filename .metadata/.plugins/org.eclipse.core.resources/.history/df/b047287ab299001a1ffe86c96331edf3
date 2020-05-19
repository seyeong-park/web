package mvc.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.board.BoardDao;
import mvc.model.board.BoardException;
import mvc.model.board.BoardRec;

public class CommandView implements Command {
	private String next;

	public CommandView( String _next ){
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response  ) throws CommandException {
		try{
			int article_id = 0;
			BoardRec msg = new BoardRec();
			msg.setArticleId(Integer.parseInt(request.getParameter("ARTICLE_ID")));
			
			int result = BoardDao.getInstance().selectById();
			
		}catch( BoardException ex ){
			throw new CommandException("CommandInput.java < 입력시 > " + ex.toString() ); 
		}
		return next;
	}

}
