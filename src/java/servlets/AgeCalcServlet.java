package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 795347
 */
public class AgeCalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalc.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        Boolean numberCheck = true;
        int age2 = 0;

        if (age == null || age.equals("")) {
            request.setAttribute("age", "You must enter a number");

        } else {
            try {
                age2 = Integer.parseInt(age);
            } catch (NumberFormatException e) {
                numberCheck = false;
            }
            if (numberCheck) {
                age2++;
                request.setAttribute("age", age2);
            } else {
                request.setAttribute("age", "You must enter a number");
            }

        }

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalc.jsp").forward(request, response);
    }
}
