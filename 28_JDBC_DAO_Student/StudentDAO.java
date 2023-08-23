package com.mystudy.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mystudy.student.vo.StudentVO;

// XxxxDAO, XxxxDao : Data Access Object
// 데이터베이스(Database)와 연동해서 CRUD를 구현하는 클래스
// 또는 데이터베이스(Database)와 연동해서 CRUD 작업을 할 수 있는 기능을 제공하는 클래스
public class StudentDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "mystudy";
	private static final String PASSWORD = "mystudypw";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// static 초기화 구문
	static {
		//1. JDBC 드라이버 로딩
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("::[예외발생] JDBC 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	//SELECT : 데이터 1개 조회(ID) - selectOne : StudentVO 타입으로 리턴
	public StudentVO selectOne(String id) {
		StudentVO vo = null;
		
		//(할일) DB연결하고 SQL문 실행해서 결과값을 vo 변수에 저장하고 리턴한다
		
		
		try {
			//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, NAME, KOR, ENG, MATH, AVG, TOT");
			sb.append("  FROM STUDENT ");
			sb.append(" WHERE ID = ? ");
			
			pstmt = conn.prepareStatement(sb.toString()); 
			//괄호에 sb만 넣으면 타입 불일치
			//prepareStatement 타입으로 리턴하니까 담을 변수 만들어줌
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			if (rs.next()) {
				vo = new StudentVO(
						rs.getString("ID"),
						rs.getString("Name"),
						rs.getInt("KOR"),
						rs.getInt("ENG"),
						rs.getInt("MATH")
						//, rs.getInt("tot") //쓰면 DB데이터랑 같은 데이터를 가져온다 (계산 됐고 안됐고 알 수 있음)
						//, rs.getDouble("avg")
						);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	//SELECT : 데이터 1개 조회(VO) - selectOne : StudentVO 타입으로 리턴
	public StudentVO selectOne(StudentVO student) {
			return selectOne(student.getId());
	}

	private void close(Connection conn, PreparedStatement pstmt,
					   ResultSet rs) {
			try {
				if (rs != null) rs.close(); //null이 아니면 닫늗다
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null) pstmt.close(); //null이 아니면 닫늗다
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) conn.close(); //null이 아니면 닫늗다
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	private void close(Connection conn, PreparedStatement pstmt) {
	try {
		if (pstmt != null) pstmt.close(); 
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		if (conn != null) conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	//---------------------------------
	//SELECT : 테이블 전체 데이터 조회 - selectAll : List<StudentVO>
	public List<StudentVO> selectAll() {
		List<StudentVO> list = null;
		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		//필드에 선언해서 여기에 계속 안 갖고 와도 됨
		
		//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, NAME, KOR, ENG, MATH, AVG, TOT");
			sb.append("  FROM STUDENT ");
			sb.append(" ORDER BY ID 	");
			
			pstmt = conn.prepareStatement(sb.toString()); 
			
			rs = pstmt.executeQuery(); // ResultSet을 리턴함 > rs에 담아주기
			
			list = new ArrayList<StudentVO>();
			
			while (rs.next()) {
				StudentVO vo = new StudentVO(
						rs.getString("ID"),
						rs.getString("Name"),
						rs.getInt("KOR"),
						rs.getInt("ENG"),
						rs.getInt("MATH"));
				//데이터 하나를 vo에 담고
				list.add(vo); 
				//리스트에 추가
			}
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	//SELECT : 이름으로 검색 - select : List<StudentVO> - 똑같은 이름은 여러명 있을 수 있으니까
	public List<StudentVO> select() {
		List<StudentVO> list = null;
		
		return list;
	}
	
	//INSERT : VO 데이터를 받아서 입력 - insert : int
	public int insert(StudentVO vo) {
		int result = 0;
		
		try {
			//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO STUDENT ");
			sql.append("       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ");
			sql.append("VALUES (?, ?, ?, ?, ?, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());

			// ?에 값 설정
//			pstmt.setString(1, vo.getId());
//			pstmt.setString(2, vo.getName());
//			pstmt.setInt(3, vo.getKor());
//			pstmt.setInt(4, vo.getEng());
//			pstmt.setInt(5, vo.getMath());
//			pstmt.setInt(6, vo.getTot());
//			pstmt.setDouble(7, vo.getAvg());
			
			int i = 1;
			pstmt.setString(i++, vo.getId());
			pstmt.setString(i++, vo.getName());
			pstmt.setInt(i++, vo.getKor());
			pstmt.setInt(i++, vo.getEng());
			pstmt.setInt(i++, vo.getMath());
			pstmt.setInt(i++, vo.getTot());
			pstmt.setDouble(i++, vo.getAvg());
			
			result = pstmt.executeUpdate(); //쿼리가 아니고 업데이트
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			close(conn, pstmt);
		}
		
		return result;
	}
	
	//UPDATE : VO 데이터를 받아서 수정 - update : int 
	//성명, 국어, 영어, 수학, 총점, 평균
	public int update(StudentVO vo) {
		int result = 0;
		
		//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE STUDENT ");
			sql.append("  SET NAME = ? ");
			sql.append("    , KOR = ? ");
			sql.append("    , ENG = ? ");
			sql.append("    , MATH = ? ");
			sql.append("    , AVG = ? ");
			sql.append("    , TOT = ? ");
			sql.append("WHERE ID = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());

			int i = 1;
			pstmt.setString(i++, vo.getName());
			pstmt.setInt(i++, vo.getKor());
			pstmt.setInt(i++, vo.getEng());
			pstmt.setInt(i++, vo.getMath());
			pstmt.setDouble(i++, vo.getAvg());
			pstmt.setInt(i++, vo.getTot());
			pstmt.setString(i++, vo.getId());
			
			result = pstmt.executeUpdate(); //쿼리가 아니고 업데이트
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			close(conn, pstmt);
		}
		
		return result;
	
	}
	
	
	//DELETE : VO 객체를 받아서 삭제 - delete : int
	
	//(실습) DELETE : 키값(ID)을 받아서 삭제 - delete : int
	public int delete(String id) {
		int result = 0;
		try {
			//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//3. Statement 문 실행(SQL 문 실행)
			String sql = "DELETE FROM STUDENT WHERE ID = ? ";
		
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			System.out.println("처리건수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt);
		}
		return result;
	}
	
	//- UPDATE : 이름(name) 받아서 수정 - updateName : int 
		//문자만 받을뿐만 아니라 대상을 찾을 수 있는 유니크한 ID값도 필요하다.
		//id, name 두개를 전달받거나 두개를 담은 VO를 전달받을 수도 있다.
	public int updateName (String id, String name) {
		int result = 0;
		try {
			//2. DB연결(MYSTUDY) - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE STUDENT ");
			sql.append("   SET name = ?");
			sql.append("     , KOR = ?");
			sql.append("     , ENG = ?");
			sql.append("     , math = ?");
			sql.append(" WHERE ID = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.executeUpdate();
			
			//4. SQL 실행 결과에 대한 처리
			//   - INSERT, UPDATE, DELETE : int 값(건수) 처리 
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		//5. 클로징 처리에 의한 자원 반납
		return result;
	}
	
	//- UPDATE : 국어점수(kor) 수정 - updateKor : int
	//- UPDATE : 총점, 평균 계산처리 - updateTotAvg : int

}
	
	
	

