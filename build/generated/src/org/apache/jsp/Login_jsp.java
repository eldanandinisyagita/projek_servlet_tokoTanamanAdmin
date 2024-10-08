package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Page</title>\n");
      out.write("         <style>\n");
      out.write("             *{\n");
      out.write("                 font-family: monospace;\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("            .login {\n");
      out.write("                width: 47%;\n");
      out.write("                float: right;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("              /* Set a style for all buttons */\n");
      out.write("            button {\n");
      out.write("                background-color: #146356;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                padding-right: 15px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                font-size: 50px;\n");
      out.write("                letter-spacing: 5px;\n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                letter-spacing: 5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"photo/bg.jpg\" \n");
      out.write("          style=\"background-position: left;\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-size: 50% 100%;\n");
      out.write("          height: 705px;width: auto;\">\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <h1>Login</h1>\n");
      out.write("            <h3>Welcome back! Please Login to your account.</h3><br>\n");
      out.write("                <form action=\"http://localhost:8080/ProjekUas_TokoTanaman/Olahlogin\" method=\"POST\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <label for=\"username\"><b>Username</b></label> \n");
      out.write("                        <input type=\"text\" placeholder=\"Enter username\" name=\"username\" required>\n");
      out.write("                        \n");
      out.write("                        <label for=\"pass\"><b>Password</b></label>\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required>\n");
      out.write("                        \n");
      out.write("                        <label>\n");
      out.write("                          <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("                        </label>\n");
      out.write("                        \n");
      out.write("                        <button type=\"submit\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
