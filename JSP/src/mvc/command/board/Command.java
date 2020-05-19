package mvc.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	public String execute( HttpServletRequest request, HttpServletResponse response  ) throws CommandException;
}