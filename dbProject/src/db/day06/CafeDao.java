package db.day06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.vo.Cafe;

public class CafeDao {
 
	private static CafeDao cafedao = new CafeDao();
	private CafeDao() {}
	public static CafeDao getCafeDao() {
		return cafedao;
	}
	
	// select 쿼리
	public List<Cafe> selectAll(){
		Connection conn = OracleConnectUtil.connect();
		String sql = "SELECT * FROM product p";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Cafe> cafe = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				cafe.add(new Cafe(rs.getString(1),
					rs.getInt(2)));
			}
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		return cafe;
		
	}
	
	// insert 쿼리
	public void insert(Cafe vo) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "INSERT INTO PRODUCT" +
					"(PNAME,PRICE)" +
					"VALUES (?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getPname());
			pstmt.setInt(2, vo.getPrice());
			
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		
	}
	
	
	
	
	
	
	
	
}
