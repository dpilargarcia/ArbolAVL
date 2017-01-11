package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Árboles AVL</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#0A2A1B\">\n");
      out.write("        <form method=\"post\" action=\"SvMochila\">\n");
      out.write("            <center>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td  colspan=\"10\" align=\"center\">\n");
      out.write("                            <font color=\"white\"><p><big><big><big><b>ÁRBOLES AVL</b></big></big></big></p>\n");
      out.write("                    <p><big>Ingrese los números en los espacios</big></p></font>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n1\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n2\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n3\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n4\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n5\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n1\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n2\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n3\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n4\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n5\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n6\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n7\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n8\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n9\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n10\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n11\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n12\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n13\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n14\"></td>\n");
      out.write("                        <td><input type=\"text\" size=\"5\" name=\"n15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td  colspan=\"10\" align=\"center\" width=\"100\">\n");
      out.write("                            <input type=\"submit\" style=\"background: cadetblue\" value=\"Calcular\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("            <p><center><canvas id=\"canvas\" width=\"1200\" height=\"500\" style=\"background-color: darkcyan\"></canvas></center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
