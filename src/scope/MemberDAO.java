package scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {	// ~DAO(Data Access Object : DB 작업 담)
	// JDBC(Java DataBase Connection)
	/*
	 *  1. 클래스 드라이버 로드
	 *  2. DB 서버와 커넥션(DB서버 IP주소 / userid / userpwd)
	 *  3. Statement 객체 생성 → SQl 구문 전송하기 위해 필요
	 *  4. SQL 처리 결과 받기(Int - update/delete/insert, ResultSet - select)
	 *  5. SQL 처리 결과에 따라 자바 코드 실행
	 */
	
	// 1번
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 2번
	public static Connection getConnection() {
		try {
			String url = "";
			String user = "";
			String password = "";
			return DriverManager.getConnection(url, user, password);	
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 3번
	// selectOne
	public MemberVO getUser(int no) {
		
		String sql = "select * from memberTBL where no = ?";
		MemberVO vo = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1,  no);;
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}
}
