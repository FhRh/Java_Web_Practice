package org.zerock.demo.calc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CalcController", value = "/calc/makeResult") //value는 urlPatters 속성, 브라우저에서 value호출시 아래 코드를 실행
public class CalcController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.printf("num1 : %s", num1);
        System.out.printf("num2 : %s", num2);

        resp.sendRedirect("/index");    //POST방식으로 처리한후엔 다른 경로로 이동하게 하는것이 일반적이고, 이때 사용하는 메소드
    }
}
