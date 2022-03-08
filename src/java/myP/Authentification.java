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
import java.sql.ResultSet;
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
@WebServlet(name = "Authentification", urlPatterns = {"/Authentification"})
public class Authentification extends HttpServlet {

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
            out.println("<title>Servlet Authentification</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Authentification at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
ResultSet res;
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
       
                
                try {
                    Connection con=utilConnection.seConnecter();
                    PreparedStatement ps=con.prepareStatement("select * from employee where email=? and mdp=? ");
                    ps.setString(1, request.getParameter("fieldEmail"));
                    ps.setString(2, request.getParameter("fieldMdp"));
                    
                    res=ps.executeQuery();
                    if(res.next()){
                        
                        RequestDispatcher rd=request.getRequestDispatcher("/jsp/formListEmp.jsp");
                        
                      HttpSession session=request.getSession();
                      session.setAttribute("paraId", res.getInt(1));
                      session.setAttribute("nom", res.getString(2));
                      session.setAttribute("prenom", res.getString(3));
                      session.setAttribute("email", res.getString(4));
                      session.setAttribute("mdp", res.getString(5));
                      session.setAttribute("deparetement", res.getString(6));
                      rd.forward(request, response);
                        
                    }else{
                        RequestDispatcher rd=request.getRequestDispatcher("/jsp/formLogin.jsp");
                        request.setAttribute("error", "le mot de passe est incorect !");
                        rd.forward(request, response);
                    }
                    res.close();
                    ps.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
           
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
