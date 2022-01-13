package com.test.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/template.do") // 1. OOO에 소속된 페이지구나~ 알아보도록하는 가상주소임, 외부에 공개되는 경로의 슬래쉬
public class Template extends HttpServlet { // 2. 상속받기

	//3. doGet 오버라이드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//4. 디스패쳐 넣기
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/template.jsp");
		// 서블릿이 jsp를 찾아가야되는 경로이다. 그래서 슬래쉬 '/' = webapp

		dispatcher.forward(req, resp);
		//이걸 매번 치기 그러니 코드조각으로 만든다.
	}

}