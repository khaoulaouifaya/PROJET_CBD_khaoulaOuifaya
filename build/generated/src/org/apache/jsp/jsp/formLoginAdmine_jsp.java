package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import myP.utilConnection;

public final class formLoginAdmine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/applicationPointage/css/styleLogin.css\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"mybody\">\n");
      out.write("          ");
if(request.getAttribute("msg")!=null){  
      out.write("\n");
      out.write("            \n");
      out.write("            <div  style=\"margin-left: 2%;margin-right:  2%;margin-top:4px;\" class=\"alert alert-danger alert-dismissible\"> \n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("                <strong> <i class=\"fa fa-check\" aria-hidden=\"true\"></i>");
      out.print(request.getAttribute("msg") );
      out.write("</strong>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        <form action=\"/applicationPointage/AuthentificationAdmine\"  method=\"post\">\n");
      out.write("            \n");
      out.write("    <div class=\"myDiv1\">\n");
      out.write("        <b style=\"padding-left: 14%\">    bienvenue en espace admine</b>\n");
      out.write("    <img src=\"/pffNetbeans/image/signin.png\"  class=\"avatar\">\n");
      out.write("    <br>\n");
      out.write("     <label id=\"lbl1\"  > <b>email:</b>    </label>\n");
      out.write("     <input type=\"text\" id=\"input1\" name=\"email\"><br><br>\n");
      out.write("    \n");
      out.write("      <label    id=\"lbl2\"> <b>password :</b>    </label>\n");
      out.write("      <input type=\"password\"  id=\"input2\" name=\"mdp\"><br><br>\n");
      out.write("       \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <button   class=\"myBtn\" >  connection </a></button>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("      <br>\n");
      out.write("      ");
if(request.getAttribute("msg")!=null){ 
      out.write("\n");
      out.write("      <p style=\"color: red;padding-left: 30px\">   ");
      out.print(request.getAttribute("msg"));
      out.write("   </p>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("       </form>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>  \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js\" integrity=\"sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF\" crossorigin=\"anonymous\"></script>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
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
