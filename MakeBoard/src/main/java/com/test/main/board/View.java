package com.test.main.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board/view.do")
public class View extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String seq = req.getParameter("seq");
		
		BoardDAO dao = new BoardDAO();
		
		HttpSession session = req.getSession();
		
		if (session.getAttribute("readcount") != null
				&& session.getAttribute("readcount").toString().equals("n")) {
			dao.addReadCount(seq);
			session.setAttribute("readcount", "y");
		}
		
		BoardDTO dto = dao.get(seq);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/board/view.jsp");
		dispatcher.forward(req, resp);

	}
}
