package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import myP.utilConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class espaceAdmine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Deparetement Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          <div class=\"container\">\n");
      out.write("        <div style=\"background-color: #55efc4;color: black; padding: 2%;\">\n");
      out.write("            \n");
      out.write("            <a style=\"background-color: #55efc4;color: black; text-decoration: none; \" href=\"/applicationPointage/jsp/formAddDept.jsp\"> \n");
      out.write("                <i class=\"fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("                <b>ajouter un deparetement </b>  \n");
      out.write("            </a>\n");
      out.write("             <a style=\"background-color: #55efc4;color: black; text-decoration: none;padding-left: 20%; \" href=\"/applicationPointage/jsp/formAddEmp.jsp\"> \n");
      out.write("                <i class=\"fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("                <b>ajouter un employee</b>  \n");
      out.write("            </a>\n");
      out.write("            <a style=\"float: right; background-color: #55efc4;color: black; text-decoration: none; \" href=\"/applicationPointage/jsp/pricipal.jsp\"> \n");
      out.write("                <i class=\"fa fa-arrow-left\" aria-hidden=\"true\"></i> \n");
      out.write("                <b>retour a la page principal</b>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("            <br>\n");
      out.write("            <div style=\"padding-left: 5%\">\n");
      out.write("          <a  style=\"color: green;padding: 3%;font-size: 30px;\n");
      out.write("              \" href=\"/applicationPointage/jsp/tableauxDept.jsp\"><i class=\"fa fa-list\" aria-hidden=\"true\"  style=\"padding-right:  2%;\"></i>afficher la list des deparetements :</a>\n");
      out.write("            <br><br>\n");
      out.write("          <a  style=\"color: green;padding: 3%;font-size: 30px;\" href=\"/applicationPointage/jsp/tableauxEmp.jsp\">\n");
      out.write("              <i class=\"fa fa-list\" aria-hidden=\"true\"  style=\"padding-right:  2%;\"></i>\n");
      out.write("              afficher la list des employee :\n");
      out.write("          </a>\n");
      out.write("            <br><br>\n");
      out.write("            <a  style=\"color: green;padding: 3%;font-size: 30px;\" href=\"/applicationPointage/jsp/listPointage.jsp\">\n");
      out.write("              <i class=\"fa fa-list\" aria-hidden=\"true\"  style=\"padding-right:  2%;\"></i>\n");
      out.write("              pointer sur les employes  :\n");
      out.write("            </a>\n");
      out.write("         </div>\n");
      out.write("            <br><br>\n");
      out.write("            <h2 style=\"text-decoration: underline\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i>   rechercher tout les employées :</h2>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"/applicationPointage/rechercheParPrenom\"  method=\"POST\">\n");
      out.write("            Rechercher par prénom :                                     \n");
      out.write("            <input type=\"text\" name=\"txtPrenom\" style=\"margin-left: 3%;\">\n");
      out.write("            <input id=\"id1\" type=\"submit\" name=\"reprenom\" value=\"rechercher\">   \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <br><br> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"/applicationPointage/rechercheParId\" method=\"POST\">\n");
      out.write("                \n");
      out.write("            <span style=\"margin-left: 3%;\">\n");
      out.write("                Rechercher par id :</span>  \n");
      out.write("                <input type=\"text\" name=\"txtId\" style=\"margin-left: 3%;\">\n");
      out.write("                <input  type=\"submit\" name=\"reid\" checked=\"faulse\" value=\"rechercher\">  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("            <br><br>\n");
      out.write("            ");

            if(session.getAttribute("idemp")!=null){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <table class=\"table\">  \n");
      out.write("    <thead class=\"thead-dark\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">id</th>\n");
      out.write("      <th scope=\"col\">nom</th>\n");
      out.write("      <th scope=\"col\">prenom</th>\n");
      out.write("      <th scope=\"col\">email</th>\n");
      out.write("     </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("        \n");
      out.write("          <td>");
      out.print(session.getAttribute("idemp") );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(session.getAttribute("nom") );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(session.getAttribute("prenom") );
      out.write("</td>\n");
      out.write("       <td>");
      out.print(session.getAttribute("mail") );
      out.write("</td>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            ");

           }
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

           if(request.getAttribute("noEmp")!=null){
            
      out.write("\n");
      out.write("            <h2 style=\"color: red\">");
      out.print(request.getAttribute("noEmp") );
      out.write("</h2>\n");
      out.write("            \n");
      out.write("             ");

           }
            
      out.write("\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>  \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js\" integrity=\"sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF\" crossorigin=\"anonymous\"></script>\n");
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
