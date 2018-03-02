/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Elliot
 */
public class WebsiteGeneratorController extends HttpServlet  {
    
    String val3;
    
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String val1=request.getParameter("val1");
        String val2=request.getParameter("val2");
        if(val1 != null && val2 != null)
        val3=""+(Integer.parseInt(val1)+Integer.parseInt(val2));
        else
        val3="";
        request.setAttribute("val3",val3);
        request.getRequestDispatcher("index.jsp").forward(request, response); 

        try {
        } finally {            
            out.close();
        }
     }
    
    public String RetrieveDoorBellLink(int ID){
        String link = "";
        
        return link;
    }
}
