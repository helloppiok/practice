package com.test.main.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/delok.do")
public class DELOk extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

				String seq = req.getParameter("seq");
				
				BoardDAO dao = new BoardDAO();
				
				int result = dao.del(seq); //1,0
				
				req.setAttribute("result", result);

		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/board/delok.jsp");

		dispatcher.forward(req, resp);

	}
}
