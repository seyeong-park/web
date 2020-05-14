/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-13 05:19:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._01_005fbasic_005fclass._5_005fsession._02_005fcart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import shop.cart.Goods;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("shop.cart.Goods");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write(" \r\n");

	String id="";
	String name ="";
	int price=0;

	ArrayList<Goods> glist = null;

	request.setCharacterEncoding("utf-8");
	
	// 1. Form의 값(hidden값) 넘겨받기 ( id, name, price )
	id = request.getParameter("id");
	name = request.getParameter("name");
	price =(Integer.parseInt(request.getParameter("price")));
	// 2. 세션의 cart 속성을 얻어온다.(생성)
	Object obj = session.getAttribute("cart");
	// 3. 만일 null이면 ArrayList 객체 새로 생성하고 그렇지 않으면 ArrayList 변수(glist)에 지정
	if(obj==null){
		glist = new ArrayList<Goods>();//장바구니 없을 때
	}else{
		glist = (ArrayList<Goods>)obj;//장바구니 추가 되었을 때
	}
	// 4. 1번의 값들을 Goods 객체로 생성후 ArrayList 에 추가
	Goods gs = new Goods(id,name,price);
	glist.add(gs);
	
	// 5. 세션에 cart 라는 이름에 ArrayList를 저장
	session.setAttribute("cart", glist);

      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("<html> \r\n");
      out.write("<body bgcolor=white>\r\n");
      out.print( name );
      out.write(" 을 구입하셨습니다.\r\n");
      out.write(" \r\n");
      out.write("<br><br><br>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr bgcolor=\"#e7a068\"><th>상품명</th>\r\n");
      out.write("<th>가격</th></tr>\r\n");
      out.write("\r\n");

		int n = glist.size(); 
		int sum = 0; 
		for(int i=0; i < n; i++) { 
			Goods goods = (Goods) glist.get(i); 
			int gp = goods.getPrice(); 
			sum += gp; 

      out.write("\r\n");
      out.write("\t\t\t<tr><td align=\"center\"> ");
      out.print( goods.getName() );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td align=\"right\"> ");
      out.print( gp );
      out.write(" </td></tr>\r\n");

		} 		 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#e7a068\"><td colspan=\"2\" align=\"right\"> 총액 : ");
      out.print( sum  );
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br/><br/>\r\n");
      out.write("[<a href=\"wshop.jsp\">쇼핑하러 가기</a>]\r\n");
      out.write("[<a href=\"Buy.jsp\">구입하기</a>]\r\n");
      out.write("\r\n");
      out.write("</body></html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}