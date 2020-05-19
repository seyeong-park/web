package mvc.simple;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleControl2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	String jspDir="/05_mvc_class/1_mvcSimple/";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 사용자 요청 분석
		String type = request.getParameter("type");
		//2. 사용자 요청에 따라 알맞을 기능 수행
		String value = "";
		if(type==null)value = "처음 뵙겠습니다.";
		else value ="안녕하세요";
		//3. request session에 결과를 저장
		request.setAttribute("param", value);
		//4. forwarding
		//<jsp:foward> -> 자바변환필요
		RequestDispatcher disp = request.getRequestDispatcher(jspDir+"simpleView.jsp");
		disp.forward(request, response);
	}	
}
