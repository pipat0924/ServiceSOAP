package epis.mnp.model;

public class Request_M1 {
	private String orderId;
	private String mdn;
	private String customerName;
	private String customerSurname;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getMdn() {
		return mdn;
	}
	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	@Override
	public String toString() {
		return "Request_M1 [orderId=" + orderId + ", mdn=" + mdn + ", customerName=" + customerName
				+ ", customerSurname=" + customerSurname + "]";
	}
	
	
	
	
}
