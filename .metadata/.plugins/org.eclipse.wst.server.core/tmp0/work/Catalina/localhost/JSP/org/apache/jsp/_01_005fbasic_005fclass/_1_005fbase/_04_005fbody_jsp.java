/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-12 01:38:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._01_005fbasic_005fclass._1_005fbase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _04_005fbody_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/01_basic_class/1_base/04_header.jsp", Long.valueOf(1589167969097L));
    _jspx_dependants.put("/01_basic_class/1_base/04_footer.jsp", Long.valueOf(1589167969096L));
  }

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
      out.write("<title> header와 footer 삽입하기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!-- <!DOCTYPE html> -->\r\n");
      out.write("<!-- 윗단 시작 -->\r\n");
      out.write("<table width=800 cellpadding=0 cellspacing=0 border=0>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=800 align=center><img src=./imgs/headImg.jpg></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- 윗단 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<hr><hr>\r\n");
      out.write("\t\t<!-- 메인 내용 시작  -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"location\">\r\n");
      out.write("\t\t\t\t<h3><img src=\"./imgs/tit_0103.gif\" alt=\"한 &#183 일간 울릉도쟁계와 우리의 독도 영유권 확인\" /></h3>\r\n");
      out.write("\t\t\t\t<p> <strong> 일본의 독도 인식</strong></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"content_view\">\r\n");
      out.write("\t\t\t\t<div class=\"cont_box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\t<h4><img src=\"./imgs/txt_0301.gif\" alt=\"가. 17세기 한 &#183 일 양국 정부간 교섭(울릉도쟁계) 과정을 통해 울릉도와 그 부속섬 독도가 우리나라 영토임이\r\n");
      out.write(" 확인되었습니다.\" /></h4>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>17세기 일본 돗토리번(鳥取藩)의 오야(大谷) 및 무라카와(村川) 양가는 조선 영토인 울릉도에서 불법 어로행위를 하다가 1693년 울릉도에서 <a href=\"#\" onclick=\"goto_page('0020105')\"><strong>안용복</strong></a>을 비롯한 조선인들과 만나게 되었습니다. </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>양가는 일본 정부(에도 막부)에 조선인들의 울릉도 도해(渡海)를 금지해달라고 청원하였고, 막부가 <span class=\"let02\">쓰시마번(對馬藩)에</span> 조선 정부와의 교섭을 지시함에 따라 양국간 교섭이 개시되는데, 이를 ‘울릉도쟁계’라 합니다.</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>에도 막부는 1695년 12월 25일 돗토리번에 대한 조회를 통해 “울릉도(죽도)와 독도(송도) 모두 돗토리번에 속하지 않는다”는 사실을 확인한 후(<a href=\"#\" onclick=\"goto_page('0020104')\"><strong>「돗토리번 답변서」</strong></a>), 1696년 1월 28일 일본인들의 울릉도 방면 도해를 금지하도록 지시하였습니다. </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>이로써 한&#183;일 양국간 분쟁은 마무리되었고, 울릉도쟁계 과정에서 <span class=\"let02\">울릉도와 독도가 우리나라 영토임이 확인되었습니다.</span></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<h4><img src=\"./imgs/txt_0302.gif\" alt=\"나. 1905년 시마네현 고시에 의한 독도 편입 시도 이전까지 일본 정부는 독도가 자국 영토가 아니라는 인식을 유지하고 있었으며, 이는 1877년『태정관지령』을 비롯한 일본 정부의 공식 문서를 통해 확인됩니다.\" /></h4>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>한 &#183; 일간 ‘울릉도쟁계’를 통해 독도가 한국 영토임이 확인된 이래, 근대 메이지 정부에 이르기까지 일본 정부는 독도가 자국 영토가 아니라는 인식을 유지하고 있었습니다. </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>이는 1905년 시마네현 고시에 의한 일본의 독도 편입 시도 이전까지 독도가 일본 영토라고 기록한 일본 정부의 문헌이 없고, 오히려 일본 정부의 공식 문서들이 독도가 일본의 영토가 아니라고 명백히 기록하고 있는 사실을 통해 잘 알 수 있습니다.</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>대표적으로, 1877년 메이지 시대 일본의 최고행정기관이었던 태정관(太政官)은 에도 막부와 조선 정부간 교섭(울릉도쟁계) 결과 울릉도와 독도가 일본 소속이 아님이 확인되었다고 판단하고, <span class=\"let02\">“죽도(울릉도) 외 일도(一嶋: 독도)는 일</span>본과 관계가 없다는 것을 명심할 것을 내무성에 지시하였습니다. <a href=\"#\" onclick=\"goto_page('0020107')\"><strong>(『태정관지령』)</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>내무성이 태정관에 질의할 때 첨부하였던 지도인「기죽도약도(磯竹島略圖, 기죽도는 울릉도의 옛 일본 명칭)」에 죽도(울릉도)와 함께 송도(독도)가 그려져 있는 점 등에서 위에서 언급된 ‘죽도 외 일도(一嶋)’의 일도(一嶋)가 독도임은 명백합니다.</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"./imgs/img_06.gif\" alt=\"태정관지령\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"./imgs/img_07.gif\" alt=\"기죽도약도\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 메인 내용 끝  -->\r\n");
      out.write("\t\t<hr><hr>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!-- <!DOCTYPE html> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 아랫단 시작 -->\r\n");
      out.write("<table width=900 cellpadding=0 cellspacing=0 border=0>\r\n");
      out.write("<td width=200 align=center><img src=./imgs/logo.jpg></td>\r\n");
      out.write("<td valign=top width=700>\r\n");
      out.write("<font class=minih>\r\n");
      out.write("<font class=\"e11 darkred\"><b><font class=p11>삼순이네</font></b></font>\r\n");
      out.write(" | 한국 울릉도 울릉읍 독도리   | 사업자등록번호 : <font class=e11>132-22-55236</font> <br>\r\n");
      out.write(" | 고객문의 <a href=/customer><b>[전화전확인]</b></a> <font class=e11>033-333-3333</font>\r\n");
      out.write(" | 문의메일 <font class=e11>help@dokdo.co.kr</font> <br>\r\n");
      out.write("<font class=\"p11 darkred\">본 싸이트의 모든 저작물의 저작권은 <font class=e11>dokdo.co.kr</font></b>에 있으며, <br>\r\n");
      out.write("무단복제나 도용은 저작권법(제<font class=e11>97</font>조 <font class=e11>5</font>항)에 의해 금지하고 있습니다.<br></font>\r\n");
      out.write("<br>\r\n");
      out.write("</td></table>\r\n");
      out.write("<!-- 아랫단 끝 -->");
      out.write("\r\n");
      out.write("\t\t\r\n");
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
