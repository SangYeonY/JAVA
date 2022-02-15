package db.vo;

public class SaleByCustom {
	// v_by_custno view 에 있는 4개의 컬럼과 매핑될 필드 선언
	
	private int custno;
	private String custname;
	private String agrade;
	private int asum;
	
	
	
	public SaleByCustom(int custno, String custname, String agrade, int asum) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.agrade = agrade;
		this.asum = asum;
	}
	
	public SaleByCustom() {
	}

	// 커스텀생성자, getter/setter,toString
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAgrade() {
		return agrade;
	}
	public void setAgrade(String agrade) {
		this.agrade = agrade;
	}
	public int getAsum() {
		return asum;
	}
	public void setAsum(int asum) {
		this.asum = asum;
	}

	@Override
	public String toString() {	// String.format()으로 출력형식 정하세요
		return String.format("%-10s %-10s %-10s\t%-10s",custno,custname,agrade,asum);
		// 한글과 영문이 혼합되면 출력칸수가 생각대로 안됩니다. (\t 사용)
	}

	
	
	
	
}
