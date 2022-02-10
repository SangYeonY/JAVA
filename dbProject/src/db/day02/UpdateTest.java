package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

public class UpdateTest {

	private static Connection conn = OracleConnectUtil.connect();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "UPDATE TBL_CUSTOM# SET email = ? WHERE CUSTOM_ID = ?";
		String custom_id = null;
		
		while(true) {
			System.out.println("email 변경을 원하는 고객 ID 를 입력하세요 :");
			custom_id = sc.nextLine();
			if(!idCheck(custom_id)) {
				System.out.println("존재하는 ID입니다.");
				break;
			}else {
				System.out.println("존재하지 않는 ID 입니다. 다시 입력하세요.");
			}
		}
		System.out.println("원하는 email을 입력하세요 : ");
		String email = sc.nextLine();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);				// 1, 2 는 물음표 매개 변수 순서
			pstmt.setString(2, custom_id);
			
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("email 변경 완료.");
		OracleConnectUtil.close(conn);
		sc.close();
		
	}
	
	private static boolean idCheck(String id) {
		boolean result = false;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from tbl_custom# where custom_id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(!rs.next()) {
				result = true;
			}
			pstmt.close();
		}catch(SQLException e) {
			System.out.println("SQL 실행오류" + e.getMessage());
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
