package db.day04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.day3.SingletonObj;
import db.vo.Product;
import db.vo.SaleByCustom;

public class SaleByDao {

	// v_by_custno view 에서 select 쿼리 실행하는 메소드 정의
	
		// 싱글턴 객체 생성코드
		private static SaleByDao saleDao = new SaleByDao();
		private SaleByDao() {}
		public static SaleByDao getSaleByDao() {
			return saleDao;
		}
	
	
			public List<SaleByCustom> selectByCustnoAll() {
				// select * from V_BY_CUSTNO 쿼리 실행하는 코드
				      Connection conn = OracleConnectUtil.connect();
				      String sql="SELECT * FROM V_BY_CUSTNO vbc";
				      PreparedStatement pstmt = null;
				      ResultSet rs= null;      
				      List<SaleByCustom> list = new ArrayList<>();
				      try {
				         pstmt = conn.prepareStatement(sql);
				         rs=pstmt.executeQuery();   
				         
				         while(rs.next()) {
				            SaleByCustom vo = new SaleByCustom();
				            list.add(vo);
				            vo.setCustno(rs.getInt(1));
				            vo.setCustname(rs.getNString(2));
				            vo.setAgrade(rs.getString(3));
				            vo.setAsum(rs.getInt(4));
				         }
				         
				         pstmt.close();
				         
				      }catch (SQLException e) {
				         System.out.println("SQL 실행 오류 : " + e.getMessage());
				      
				      }
				      
				      OracleConnectUtil.close(conn);
				      
				      return list;
				   }
			
		
		
		
	
}
