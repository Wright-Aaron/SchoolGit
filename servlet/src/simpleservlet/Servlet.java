package simpleservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "Servlet", urlPatterns={"/Servlet"})
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first;
        float second;

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><link rel=\"stylesheet\" href=\"style.css\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Baskervville&display=swap\" rel=\"stylesheet\"></head><body><main><div>");
        String firstNumber = request.getParameter("firstnumber");
        String operator = request.getParameter("operator");
        String secondNumber = request.getParameter("secondnumber");
        if (operator.equals("+")) {
            first = Float.valueOf(firstNumber);
            second = Float.valueOf(secondNumber);
            String answer = Float.toString(first + second);
            out.println("<h2>The answer to your problem is </h2>");
            out.println("<p>" + firstNumber + operator + secondNumber + "=" + answer);
            out.println("</div></main></body></html>");
        } else if (operator.equals("-")) {
            first = Float.valueOf(firstNumber);
            second = Float.valueOf(secondNumber);
            String answer = Float.toString(first - second);
            out.println("<h2>The answer to your problem is </h2>");
            out.println("<p>" + firstNumber + operator + secondNumber + "=" + answer);
            out.println("</div></main></body></html>");
        } else if (operator.equals("*")) {
            first = Float.valueOf(firstNumber);
            second = Float.valueOf(secondNumber);
            String answer = Float.toString(first * second);
            out.println("<h2>The answer to your problem is </h2>");
            out.println("<p>" + firstNumber + operator + secondNumber + "=" + answer);
            out.println("</div></main></body></html>");
        } else {
            first = Float.valueOf(firstNumber);
            second = Float.valueOf(secondNumber);
            String answer = Float.toString(first / second);
            out.println("<h2>The answer to your problem is </h2>");
            out.println("<p>" + firstNumber + operator + secondNumber + "=" + answer);
            out.println("</div></main></body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Random rand = new Random();
        int randInt = rand.nextInt(1000);

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><link rel=\"stylesheet\" href=\"style.css\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Baskervville&display=swap\" rel=\"stylesheet\"></head><body><main><div>");
        out.println("<h2>Here is your random number: </h2>");
        out.println("<p>" + randInt + "</p>");
        out.println("</div></main></body></html>");
    }

}
