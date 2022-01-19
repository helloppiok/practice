package com.test.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {
	public static void main(String[] args) {
	       String url ="jdbc:oracle:thin:@oracle_high?TNS_ADMIN=D:\\0. 이정현\\8. 취업\\1. 포토폴리오\\1. 팀프로젝트\\4. 4조(erp)\\오라클클라우드\\Wallet_oracle";
	       String userid="admin";
	       String pwd ="Webproject4$";
	       
	     
	       //드라이버 로딩 
	       try {
	    	    //oracle DB연결 드라이버 로딩
	    	    Class.forName("oracle.jdbc.OracleDriver");//
	    	    System.out.println("드라이버 로딩 성공");
	       }catch(Exception e) {
	    	    e.printStackTrace();
	       }
	       
	       //DBMS와 연결
	       try {
	    	       System.out.println("데이터베이스 연결 준비......");
	    	       Connection con =DriverManager.getConnection(url, userid, pwd);
	    	       if(con!=null) {
	    	    	   System.out.println("데이터베이스 연결 성공...");
	    	       }
	       }catch(Exception e) {
	    	   e.printStackTrace();
	       }
		}
}
