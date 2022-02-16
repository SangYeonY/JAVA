package db.vo;

public class Cafe {
	private String pname;
	private int price;
	
	
	
	public Cafe(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}
