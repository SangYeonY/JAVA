package db.day06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.vo.Cafe;
import db.vo.Orders;

public class OrdersDao {
	
	private static OrdersDao ordersdao = new OrdersDao();
	private OrdersDao() {}
	public static OrdersDao getOrderDao() {
		return ordersdao;
	} 
	public List<Orders> selectAll(){
		Connection conn = OracleConnectUtil.connect();
		String sql = "SELECT * FROM ORDERS o";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Orders> orders = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				orders.add(new Orders(rs.getInt(1),
					rs.getString(2),
					rs.getInt(3),
					rs.getDate(4)));
			}
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		return orders;
		
	}
	
	// insert 쿼리
	
	public void insert(Orders vo) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "INSERT INTO IDEV.ORDERS" +
				"(ORD_SEQ, PNAME, CNT, ORDERTIME)" +
				"VALUES(?, ?, ?, ?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, vo.getOrd_seq());
			pstmt.setString(2, vo.getPname());
			pstmt.setInt(3, vo.getCnt());
			pstmt.setDate(4, vo.getOrdertime());
			
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		
	}
	
	
}
