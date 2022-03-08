/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author khaoula ouifaya
 */
@WebServlet(name = "marquerPresenceDebut", urlPatterns = {"/marquerPresenceDebut"})
public class marquerPresenceDebut extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet marquerPresenceDebut</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet marquerPresenceDebut at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        if(request.getParameter("btnPresence")!=null){
        try {
        Connection con=utilConnection.seConnecter();
        PreparedStatement  ps=con.prepareStatement("insert into pointageEmpDebut(idp ,idemp,typep,message,position) values(seq_point.nextval,?,?,?,?)");
        ps.setInt(1, (int) session.getAttribute("paraId"));
        ps.setString(2, request.getParameter("typep"));
        ps.setString(3, request.getParameter("msg"));
        ps.setString(4, request.getParameter("pos"));
        ps.executeUpdate();
        
       RequestDispatcher rd=request.getRequestDispatcher("/jsp/formListEmp.jsp");
       request.setAttribute("scc", "votre presence a été marquer avec succées");
       rd.forward(request, response);
      
        } catch (SQLException ex) {
            Logger.getLogger(marquerPresenceDebut.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
