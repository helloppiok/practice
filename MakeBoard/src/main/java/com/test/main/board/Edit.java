package com.test.main.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board/edit.do")
public class Edit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String seq = req.getParameter("seq");
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.get(seq);
		
		
		HttpSession session = req.getSession();
		
		if (session.getAttribute("id") == null 
				|| !session.getAttribute("id").toString().equals(dto.getId())) {
			resp.sendRedirect("/makeboard/member/member.do");
			return;
		}
		
		
		req.setAttribute("dto", dto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/board/edit.jsp");

		dispatcher.forward(req, resp);

	}
}
