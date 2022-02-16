package db.day06;

import java.util.List;

import db.day06.OrdersDao;
import db.vo.Orders;



public class CafeMain {

	public static void main(String[] args) {
	
		OrdersDao ordersdao = OrdersDao.getOrderDao();
		
		List<Orders> list = ordersdao.selectAll();
		System.out.println(String.format("%-10s %-15s\t %-10s\t\t%-15s", 
				"주문번호","메뉴이름","수량","주문날짜"));
		
		for(Orders vo : list)
			System.out.println(vo);
	
	

	}

}
