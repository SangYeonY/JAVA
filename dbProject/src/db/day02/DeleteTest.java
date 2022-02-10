package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

public class DeleteTest {

	private static Connection conn = OracleConnectUtil.connect();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_CUSTOM# WHERE CUSTOM_ID=?";
		String custom_id = null;
		while (true) {
			System.out.print("삭제할 고객ID를 입력하세요. -> ");
			custom_id = sc.nextLine();
			if (!idCheck(custom_id)) {
				System.out.println("존재하는 ID입니다. ID를 삭제합니다.");
				break;
			} else {
				System.out.println("존재하지 않는 ID입니다. 다시 입력하세요");
			}
		}
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, custom_id);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 회원 탈퇴되었습니다.");
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
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (!rs.next())
				result = true;
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		return result;
	}
}
