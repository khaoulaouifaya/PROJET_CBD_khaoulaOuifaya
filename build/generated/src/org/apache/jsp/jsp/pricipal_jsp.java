package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pricipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/applicationPointage/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("       <title>home Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo03\" aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <a class=\"navbar-brand\" href=\"/applicationPointage/jsp/pricipal.jsp\"> pointageEnligne  </a>\n");
      out.write("      \n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n");
      out.write("      <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"/applicationPointage/jsp/pricipal.jsp\"> HOME   <span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"form-inline my-2 my-lg-0\" >\n");
      out.write("          <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"rechercher\" aria-label=\"Search\" disabled=\"true\">\n");
      out.write("        <button class=\"btn btn-outline-dark my-2 my-sm-0\" type=\"submit\">rechercher</button>\n");
      out.write("      </form>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("         \n");
      out.write("            ");
if(request.getAttribute("msg")!=null){  
      out.write("\n");
      out.write("\n");
      out.write("            <div  style=\"margin-left: 2%;margin-right:  2%;margin-top:  2%\" class=\"alert alert-success alert-dismissible\"> \n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("                <strong> <i class=\"fa fa-check\" aria-hidden=\"true\"></i>");
      out.print(request.getAttribute("msg") );
      out.write("</strong>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"d1\">\n");
      out.write("            <a href=\"/applicationPointage/jsp/formLoginAdmine.jsp\" class=\"mya\">  <b>espace administrateur </b>  </a>  \n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("        <div class=\"di2\">\n");
      out.write("            <a href=\"/applicationPointage/jsp/formLogin.jsp\" class=\"mya\"> <b>espace employer</b>  </a>  \n");
      out.write("        </div>\n");
      out.write("            <div  class=\"di5\">\n");
      out.write("                <a href=\"formPlaning.jsp\" class=\"mya\"> <b>voir le planing des employee </b></a>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <div>\n");
      out.write("                <img src=\"/applicationPointage/image/mm.jpeg\" class=\"mytof\" >\n");
      out.write("            </div> \n");
      out.write("             \n");
      out.write("       \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>  \n");
      out.write("    </div>\n");
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
