/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-14 01:00:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._02_005fbeans_005fclass._0_005factionTags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _03_005fparamBody_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title> 액션태그 param </title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<!-- ########  -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "03_paramImage.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lang", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("sp", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width='50%'>안용복은 조선의 어부로 숙종실록의 기록에 의하면 숙종 19년(1693)\r\n");
      out.write("박어둔 이하 십여 명과 함께 울릉도에서 어로 및 농사 활동을 하던 중\r\n");
      out.write("일본의 오오야(大谷) 집안의 어부들과 충돌하여 일본 오키섬까지 납치\r\n");
      out.write("당하게 된다. 오키도주는 안용복 일행을 돗토리성(鳥取城)의\r\n");
      out.write("호키슈(伯耆州) 태수에게 이송하게 되며, 안용복은 호키슈 태수 앞에서 \r\n");
      out.write("울릉도가 조선의 영토임을 강조하며 일본인들의 출어를 금지하여 줄 것을 요구하였다. 이에 호키슈 태수는 이를 에도막부에 보고하고 \"울릉도는 일본의 영토가 아니다(鬱陵島非日本界)\"라는 서계를 써주어 안용복 일행을 나가사키ㆍ대마도를 거쳐 조선으로 돌려보냈던 것이다.  그러나 안용복이 대마도에 이르자 대마도주는 에도막부의 관백(집정관)이 안용복에게 써준 서계를 빼앗고, 조선의 동래부에 인계하였다.\t안용복 캐릭터\r\n");
      out.write(" </td>\r\n");
      out.write("\t\t<td><img src=\"./imgs/안용복_1.gif\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><img src=\"./imgs/안용복_2.gif\"></td>\r\n");
      out.write("\t\t<td>\t\r\n");
      out.write("이후 안용복이 숙종 22년(1696) 봄에 해산물 채취를 나갔다가 또다시\r\n");
      out.write("일본어선들이 울릉도에서 어로 활동을 하고 있는 것을 보고 즉시 그들을 \r\n");
      out.write("쫓아 내고, 울릉도가 조선의 영토임을 항의하기 위하여 재차 돗토리번으로 건너갔다. 다시 돗토리번주 앞에 선 안용복은 울릉도와 독도가 조선땅임을 명확히 하고, 일본인들의 계속되는 침범을 근절하여 줄 것을 요구하였던\r\n");
      out.write("것이다. 이에 돗토리번주는 \"두 섬이 이미 당신네 나라에 속한\r\n");
      out.write("이상(兩島旣屬國), 만일 다시 국경을 넘어 침범하는 자가 있으면 국서를 작성하고 역관을 정하여 무겁게 처벌할 것이다.\" 라고 하여, 에도막부의\r\n");
      out.write("결정사항을 전했다.\r\n");
      out.write("\r\n");
      out.write("이와 같은 안용복의 활동을 계기로 일본의 에도 막부는 울릉도 도해 금지\r\n");
      out.write("명령을 내렸는데, 이는 울릉도와 독도가 조선의 영토임을 확인시킨\r\n");
      out.write("결과이다. 또한 이 사실(史實)을 근거로 일본의 메이지 정부도 1877년\r\n");
      out.write("울릉도와 독도가 일본과는 관계가 없는 조선의 영토라는 것을 재확인했다.\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
