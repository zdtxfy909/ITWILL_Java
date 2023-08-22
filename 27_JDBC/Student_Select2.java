package com.mystudy.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Select2 {

	public static void main(String[] args) {
		//JDBC 이용한 DB 연동 프로그래밍 작성 절차
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL 문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			 // 데이터를 조회 > DB에 있는 데이터를 SELECT해서 가져옴. 
			 // 요청한 데이터가 넘어옴. 반드시 전달받은 리턴값을 가지고 사용. 
		//   - INSERT, UPDATE, DELETE : int 값(건수) 처리 
			 // 실행결과가 DB에서 실질적으로 이루어짐
		//5. 클로징 처리에 의한 자원 반납
		//--------------------------------
		//정리
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
		
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
						,"mystudy", "mystudypw");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(">> DB 연결 성공 : " + conn);
			
			//3. Statement 문 실행(SQL 문 실행)
			// Connection 객체로 부터 Statement 객체를 생성한다.
			stmt = conn.createStatement();
			String id = "2023001";
			
			String sql = ""
					+ "SELECT ID, NAME, KOR, ENG, MATH, TOTAL, AVG "
					+ "FROM STUDENT "
					+ "WHERE ID = '" + id + "' "
					+ "ORDER BY ID";
			System.out.println("sql : " + sql);
			rs = stmt.executeQuery(sql);
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			while (rs.next()) {
				System.out.print(rs.getString("ID") + "\t");
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getInt("KOR") + "\t");
				System.out.print(rs.getInt("ENG") + "\t");
				System.out.print(rs.getInt("MATH") + "\t");
				System.out.print(rs.getInt("TOTAL") + "\t");
				System.out.println(rs.getDouble("AVG") + "\t");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			try {
				if (rs != null) rs.close(); //null이 아니면 닫늗다
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null) stmt.close(); //null이 아니면 닫늗다
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) conn.close(); //null이 아니면 닫늗다
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
