package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import myP.utilConnection;

public final class formListEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                 <link rel=\"stylesheet\" href=\"/applicationPointage/css/style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("        <title>add employee Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div style=\"background-color: #55efc4;color: black; padding: 2%;\">\n");
      out.write("            \n");
      out.write("       \n");
      out.write("            \n");
      out.write("            <img src=\"/applicationPointage/image/signin.png\" class=\"pic1\">\n");
      out.write("            <p style=\"display: inline;font-weight: bold;\" class=\"link1\" >");
      out.print( session.getAttribute("nom") );
      out.write("</p>\n");
      out.write("            <a style=\"color: black ;text-decoration: underline;padding-left: 4px;\" href=\"/applicationPointage/jsp/formModifier.jsp\">\n");
      out.write("                <i class=\"fa fa-cog\" aria-hidden=\"true\"></i> <b> modifier le compte</b> \n");
      out.write("            </a>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        \n");
      out.write("            <a style=\"float: right; background-color: #55efc4;color: black; text-decoration: none; \" href=\"/applicationPointage/jsp/pricipal.jsp\"> \n");
      out.write("                <i class=\"fa fa-arrow-left\" aria-hidden=\"true\"></i> \n");
      out.write("                <b>retour a la page principal</b>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("             ");

            if(request.getAttribute("scc")!=null){
            
            
      out.write("\n");
      out.write("            <div class=\"alert alert-success\">\n");
      out.write("      ");
      out.print(request.getAttribute("scc") );
      out.write("\n");
      out.write("           </div>\n");
      out.write("           ");

           
            }
            
      out.write(" \n");
      out.write("            <br>\n");
      out.write("            <h3  style=\"float: left;padding-right:42%;\"> <i class=\"fa fa-check\" aria-hidden=\"true\"></i>la list des employee :</h3> \n");
      out.write("            \n");
      out.write("            <div style=\"\">\n");
      out.write("             <a style=\"color: green ;text-decoration: underline;font-family: cursive;font-size: 20px;\" href=\"/applicationPointage/jsp/pointageDubut.jsp\">\n");
      out.write("                 <i class=\"fa fa-calendar\" aria-hidden=\"true\"></i> <b>valider votre presence quotidien </b> \n");
      out.write("            </a></div>\n");
      out.write("            <br><br>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("     <table class=\"table\">  \n");
      out.write("    <thead class=\"thead-dark\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">nom</th>\n");
      out.write("      <th scope=\"col\">prenom</th>\n");
      out.write("     \n");
      out.write("       <th scope=\"col\">email</th> \n");
      out.write("       <th scope=\"col\">deparetement</th>\n");
      out.write("     </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("        ");
 
             Connection con=utilConnection.seConnecter();
             Statement s=con.createStatement();
             ResultSet res=s.executeQuery("select distinct * from employee");
             while(res.next()){
            
      out.write("\n");
      out.write("      <th scope=\"row\">");
      out.print(res.getInt(1));
      out.write("</th>\n");
      out.write("      <td>");
      out.print(res.getString(2));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(res.getString(3));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(res.getString(4));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(res.getString(6));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("  </tbody> \n");
      out.write("  ");
 
            }
  
      out.write("\n");
      out.write("</table>\n");
      out.write("          \n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("            \n");
      out.write("       \n");
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
