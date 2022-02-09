package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {		// 오라클 idev 스키마 custom# 테이블에 고객을 추가하는 연습
								// SQL insert 실행
	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		System.out.println("main메소드 확인용 : " + conn);
		
		String sql = "INSERT INTO TBL_CUSTOM#" + 
				"(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)" + 
				"VALUES('sana', '최사나', 'unknown', 22, sysdate)" ;
		
		// sql 을 실행할 객체 생성
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		
	}

}
