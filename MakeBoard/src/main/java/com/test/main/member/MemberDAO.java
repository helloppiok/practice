package com.test.main.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.test.jdbc.DBUtil;

public class MemberDAO {
	
	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;
	private ResultSet rs;
	
	public MemberDAO() {

		try {

			conn = DBUtil.open();
			stat = conn.createStatement();
			
		} catch (Exception e) {
			System.out.println("BoardDAO.BoardDAO()");
			e.printStackTrace();
		}
	}
	
	
	
	//LoginOk 서블릿이 아이디와 암호를 줄테니 개인 정보를 돌려주세요. > 로그인 처리
	public MemberDTO login(MemberDTO dto) {

		try {
			
			//쿼리작업에 스트링포맷은 비권장한다.
			// ? = 오라클 매개변수 => %s 역할 
			String sql = "select * from tblLogin where id = ? and pw = ?";
			
			//차이점임(아래와 비교, 여기서 실행 코드 아님 비교하려고 적은 것)
//			stat = conn.createStatement();
//			stat.executeQuery(sql);
			
			
			//대신 이 방법 추천
			pstat = conn.prepareStatement(sql);
			
			//상자 포장 풀러서 내용물 꺼내기 dto.어쩌구저쩌구
			pstat.setString(1, dto.getId()); //첫번째 ?
			pstat.setString(2, dto.getPw());	//두번째 ?
			
			rs = pstat.executeQuery();
			
			if (rs.next()) {
				MemberDTO result = new MemberDTO();
				
				result.setId(rs.getString("id"));
				result.setName(rs.getString("name"));
				result.setLv(rs.getString("lv"));
				
				return result;
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
}






