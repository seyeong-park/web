/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-13 03:11:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._01_005fbasic_005fclass._5_005fsession._02_005fcart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ref_002dlg_002d2072_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("    \r\n");
      out.write("<html> \r\n");
      out.write("<head><title>우리 쇼핑몰 </title></head> \r\n");
      out.write("<body> \r\n");
      out.write(" \r\n");
      out.write("<table><tr><td><img src='imgs/2072.gif' width='180'> \r\n");
      out.write(" \r\n");
      out.write("</td><td> \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("문을 자주 열어도, 음식을 많이 채워도, \r\n");
      out.write("역시 LG 싱싱특급~ \r\n");
      out.write("- 용량 : 500L (냉장 : 360L, 냉동 : 140L) \r\n");
      out.write("- 신감각 가죽 무늬 \r\n");
      out.write("- 더욱 효율적인 내부 공간 \r\n");
      out.write("- 얼듯 말듯 싱싱고 \r\n");
      out.write("- 유러피안 아치 디자인 \r\n");
      out.write("- 레일 부착 분리형 생생 야채실 \r\n");
      out.write("- CFC-FREE 환경 친화 설계 \r\n");
      out.write("- 안전 강화 유리 선반 \r\n");
      out.write("- 광촉매 파워 탈취 \r\n");
      out.write("- 인체 공학적 설계 \r\n");
      out.write("- 방음 보강으로 저소음 설계 \r\n");
      out.write("- 초절전 설계 \r\n");
      out.write("- 360。 이동용 회전 바퀴 \r\n");
      out.write("- 색상 : 진미색 \r\n");
      out.write("- 에너지 소비 효율 : 1등급 \r\n");
      out.write("- 소비 전력 : 55 kwh/월 \r\n");
      out.write("- 크기 : 831 x 1,785 x 699mm \r\n");
      out.write(" \r\n");
      out.write("</table> \r\n");
      out.write(" \r\n");
      out.write("663,600 원 \r\n");
      out.write("<form action='Cart.jsp' method='post'> \r\n");
      out.write("<input type='hidden' name='id' value=\"2072\"> \r\n");
      out.write("<input type='hidden' name='name' value=\"LG 냉장고 R-B50CF\"> \r\n");
      out.write("<input type='hidden' name='price' value=\"663600\"> \r\n");
      out.write("<input type='submit' value=\"장바구니\"> \r\n");
      out.write("</form> \r\n");
      out.write("</body> \r\n");
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
