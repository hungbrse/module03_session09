package com.example.ex2;

import com.example.ex2.model.entity.UserData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "userDataServlet", value = "/userData-Servlet")
public class UserDataServlet extends HttpServlet {
      private static final List<UserData> userDataList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
              userDataList.add(new UserData(1,"hung","anhyeuem321@gmail,com",16));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("userDataList", userDataList);
        req.getRequestDispatcher("showData.jsp").forward(req, resp);
    }

}
