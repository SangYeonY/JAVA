package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest3 {
// select 쿼리를 조건식으로 조회하는 연습입니다. 조건컬럼 custom_id 이며 기본키 컬럼입니다.
//	-> 조회결과는 0 또는 1 개입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom# where custom_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		
		System.out.print("조회할 고객 id 입력하세요. ->");
		String custom_id = sc.nextLine();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,custom_id);	// 쿼리 실행에 필요한 매개변수(?) 전달합니다.
			rs = pstmt.executeQuery();		// select


			int i = 1;
			if(rs.next()) {
				System.out.print(i++ + "행 데이터 보기 ---------------------------");
				System.out.print(String.format("%-20s", rs.getString("custom_id")));	// 문자열 오른쪽정렬이 기본
				System.out.print(String.format("%-20s", rs.getString("name")));		// ㄴ - 기호는 왼쪽 정렬
				System.out.print(String.format("%-20s", rs.getString("email")));
				System.out.print(String.format("%-5d", rs.getInt("age")));
				System.out.println(rs.getTimestamp("reg_date"));
			}else {
				System.out.println("조회한 id는 없는 고객입니다.");
			}
	
			pstmt.close();
			
			
			
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
		
		
	}

}
