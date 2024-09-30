package com.example.ex1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet", value = "calculator-servlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double discountPercent = Double.parseDouble(req.getParameter("discountPercent"));

        double discountAmount = price * discountPercent * 0.01;
        double discountPrice = price - discountAmount;

        req.setAttribute("description", description);
        req.setAttribute("price", price);
        req.setAttribute("discountPercent", discountPercent);
        req.setAttribute("discountAmount", discountAmount);
        req.setAttribute("discountPrice", discountPrice);
        req.getRequestDispatcher("display.jsp").forward(req, resp);

    }
}
