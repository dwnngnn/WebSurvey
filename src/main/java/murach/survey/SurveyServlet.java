package murach.survey;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.Survey;
import murach.business.User;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setEmail(request.getParameter("email"));
        user.setDateOfBirth(request.getParameter("dateOfBirth"));

        Survey survey = new Survey();
        survey.setHeardFrom(request.getParameter("heardFrom"));
        survey.setAnnouncements(request.getParameter("announcements") != null);
        survey.setEmailAnnouncements(request.getParameter("emailAnnouncements") != null);
        survey.setContactVia(request.getParameter("contactVia"));

        request.setAttribute("user", user);
        request.setAttribute("survey", survey);
        getServletContext().getRequestDispatcher("/thanks.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.sendRedirect("index.html");
    }
}