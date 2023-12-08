/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import SimpleBean.MonHoc;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebServlet(urlPatterns = {"/ListCours"})
public class ListCours extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListCours</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Danh sach mon hoc</h1>");
            
            String html;
            html = "<form action='./Register' method='POST'>";
            MonHoc mh1 = new MonHoc("CT173");
            out.println(html);
            html="<table>"
                    +"<tr>"
                    
                    +"<td>"
                    +mh1.getID()
                    + "</td>"
                    +"<td>"
                    +mh1.getName()
                    + "</td>"
                    +"<td>"
                    +"<input type='checkbox' name='MH1' value ='"
                    +mh1.getID()
                    + "'"
                    + "</td>"
                    + "</tr>"
                    +"<tr>"
                    +"<td>"
                    +"CT176"
                    + "</td>"
                    +"<td>"
                    +"Lap trinh Huong Doi tuong"
                    + "</td>"
                    +"<td>"
                    +"<input type='checkbox' name='MH2' value ='CT176'"
                    + "</td>"
                    + "</tr>"
                    +"<tr>"
                    +"<td>"
                    +"CT428"
                    + "</td>"
                    +"<td>"
                    +"Lap trinh WEB"
                    + "</td>"
                    +"<td>"
                    +"<input type='checkbox' name='MH3' value ='CT428'"
                    + "</td>"
                    + "</tr>"
                    +"<tr>"
                    +"<td>"
                    +"<input type='submit' value='Dang Ky'>"
                    + "</td>"
                    +"<td>"
                    
                    + "</td>"
                    +"<td>"
                    
                    + "</td>"
                    + "</tr>"
                    + "</table>";
            out.println(html);
            
            html = "</form>";
            out.println(html);
            
            
            html = "<div border = 1>";
            out.println(html);
            RequestDispatcher dispatch = request.getRequestDispatcher("Calendar");
            dispatch.include(request, response);
            html = "</div>";
            out.println(html);
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
        processRequest(request, response);
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
