/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hikisuu.newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryo
 */
@WebServlet(name = "Method8", urlPatterns = {"/Method8"})
public class Method8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     String[] userProfile(int num){
    String [][] userProfile_list={
        {"1","技育太郎","東京","男","プログラマー"},
        {"2","技育花子","北海道","女","システムエンジニア"},
        {"3","技育三郎","大阪","男","Webエンジニア"}
        
    };
       int i;
    for(i = 0; i <= 3; i++){
    int intValue = Integer.parseInt(userProfile_list[i][0]);
        if(num == intValue){
            //どの配列を戻したいか指定する。
        return userProfile_list[i];
    }
    }
       return null;
   } 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            //引数が指定されている。
            int num = 1 ;
           for (int i = 1; i < userProfile(num).length; i++){
                out.print(userProfile(num)[i]);
        }out.print("<br>");
           for (int i = 1; i < userProfile(num).length; i++){
                out.print(userProfile(num + 1)[i]);
        }out.print("<br>");
           for (int i = 1; i < userProfile(num).length; i++){
                out.print(userProfile(num + 2)[i]);
           }
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
