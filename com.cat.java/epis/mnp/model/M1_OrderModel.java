package epis.mnp.model;

public class M1_OrderModel {
	private String orderId;
	private String customerName;
	private String customerSurname;
	private String title;
	private String address;
	private String categoryName;
	
	
	
	public M1_OrderModel() {
		super();
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "M1_OrderModel [orderId=" + orderId + ", customerName=" + customerName + ", customerSurname="
				+ customerSurname + ", title=" + title + ", address=" + address + ", categoryName=" + categoryName
				+ "]";
	}

	
}
