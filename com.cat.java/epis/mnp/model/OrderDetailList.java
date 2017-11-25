package epis.mnp.model;

public class OrderDetailList {
	private String mnd;
	private String iccd;
	private String totalAmount;
	
	
	public OrderDetailList() {
		super();
	}
	public String getMnd() {
		return mnd;
	}
	public void setMnd(String mnd) {
		this.mnd = mnd;
	}
	public String getIccd() {
		return iccd;
	}
	public void setIccd(String iccd) {
		this.iccd = iccd;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "OrderDetailList [mnd=" + mnd + ", iccd=" + iccd + ", totalAmount=" + totalAmount + "]";
	}
	
	
}
