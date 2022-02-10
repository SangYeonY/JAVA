package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.vo.Custom;

public class VOClassTest {
// SelectTest3.java 를  vo 이용하여 자바변수에 저장하는 연습입니다.
	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Custom> customs = new ArrayList<>();
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// select 조회 결과를 한행씩 가져와서 List 에 추가합니다.
				customs.add(new Custom(rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getDate(5)));
			
			}
			System.out.println("List 에 저장된 값 확인 ---------------");
			System.out.println(customs);
			System.out.println("List 의 데이터를 1개씩 출력 ----------");
			for (int i = 0; i < customs.size(); i++) {
				System.out.print(String.format("i : %-3s", i+1));
				System.out.println(customs.get(i));	// toString 생략됨
			}
			
			pstmt.close();
			
		}catch(SQLException e){
			
		}
		OracleConnectUtil.close(conn);
	}

}
