package db.vo;

import java.sql.Date;

public class Orders {
	private int ord_seq;
	private String pname;
	private int cnt;
	private Date ordertime;
	
	
	
	public Orders(int ord_seq, String pname, int cnt, Date ordertime) {
		super();
		this.ord_seq = ord_seq;
		this.pname = pname;
		this.cnt = cnt;
		this.ordertime = ordertime;
	}



	public int getOrd_seq() {
		return ord_seq;
	}



	public void setOrd_seq(int ord_seq) {
		this.ord_seq = ord_seq;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getCnt() {
		return cnt;
	}



	public void setCnt(int cnt) {
		this.cnt = cnt;
	}



	public Date getOrdertime() {
		return ordertime;
	}



	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}



	@Override
	public String toString() {
		return String.format("%-15s %-15s\t%-15s\t%-10s",ord_seq,pname,cnt,ordertime);
		}
	
	
	
	
	
	
}
