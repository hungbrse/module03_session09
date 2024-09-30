package com.example.ex3;

import com.example.ex3.entity.UserData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebServlet(name="userData" ,value = "/user-data")
public class UserDataServlet extends HttpServlet {

    private static List<UserData> userDataList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        userDataList.add(new UserData("nguyenphuonghung1002@gmail.com", "anhhung1"));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Optional<UserData> optionalUserData = userDataList.stream().filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password)).findFirst();

        if (optionalUserData.isPresent()) {
            req.setAttribute("userData", optionalUserData.get());
            req.getRequestDispatcher("/thank.jsp").forward(req, resp);
        }



    }
}
