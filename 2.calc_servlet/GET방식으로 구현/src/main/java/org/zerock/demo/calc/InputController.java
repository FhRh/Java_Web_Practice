package org.zerock.demo.calc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "inputController", value = "/calc/input")
public class InputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //doGet 오버라이딩

        System.out.println("InputController...doGet...");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");
        //RequestDispatcher는 서블릿에 전달된 요청(Request)를 다른 쪽으로 전달하는 객체
        //InputController는 WEB-INF/calc/input.jsp로 가는 경유지가 된다.

        dispatcher.forward(req,resp);
    }
}
