/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 795347
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
         int first = 0;
        int second = 0;
        Boolean intCheck = true;
        try{
        first = Integer.parseInt(firstString);
        second = Integer.parseInt(secondString);
        }
        catch(NumberFormatException e){
            intCheck = false;
        }
        
        if(firstString == "" || firstString.equals("") || secondString == "" || secondString.equals("") || intCheck == false){
            request.setAttribute("result", "Invalid"); 
             //getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }else{
            
       
       
        int result = 0;
        
      String button1 = request.getParameter("add");
      String button2 = request.getParameter("subtract");
      String button3 = request.getParameter("multiply");
      String button4 = request.getParameter("modulus");
      
      if(button1 != null){
          result = first + second;
      }
      else if (button2 != null){
          result = first - second;
      }
      else if (button3 != null){
          result = first * second;
      }
      else if (button4 != null){
          result = first % second;
      }
        request.setAttribute("result", result); 
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        // to view log statements see the Output window -> Apache Tomcat Log tab
        //log(age2);
        
       
        //request.setAttribute("lastn", lastname);

}
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    
    }
}
