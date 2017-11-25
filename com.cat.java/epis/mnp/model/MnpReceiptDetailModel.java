package epis.mnp.model;

public class MnpReceiptDetailModel {
	private String receiptId;
	private String receiptNo;
	private String paymentId;
	private String reverseType;
	private String paymentType;
	private String paymentShop;
	private String orderId;
	private String accountName;
	private String accountCategory;
	private String accountAddress;
	private String vatRate;
	private String amountTex;
	private String vatAmount;
	private String wtAmount;
	private String discountAmount;
	private String totalAmount;
	private String texTotalAmount;
	private String payDate;
	private String receiptDate;
	private String repeatOrder;
	private String repeatOrderID;
	private String officerName;
	public String getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getReverseType() {
		return reverseType;
	}
	public void setReverseType(String reverseType) {
		this.reverseType = reverseType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentShop() {
		return paymentShop;
	}
	public void setPaymentShop(String paymentShop) {
		this.paymentShop = paymentShop;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountCategory() {
		return accountCategory;
	}
	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}
	public String getAccountAddress() {
		return accountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}
	public String getVatRate() {
		return vatRate;
	}
	public void setVatRate(String vatRate) {
		this.vatRate = vatRate;
	}
	public String getAmountTex() {
		return amountTex;
	}
	public void setAmountTex(String amountTex) {
		this.amountTex = amountTex;
	}
	public String getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(String vatAmount) {
		this.vatAmount = vatAmount;
	}
	public String getWtAmount() {
		return wtAmount;
	}
	public void setWtAmount(String wtAmount) {
		this.wtAmount = wtAmount;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTexTotalAmount() {
		return texTotalAmount;
	}
	public void setTexTotalAmount(String texTotalAmount) {
		this.texTotalAmount = texTotalAmount;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public String getRepeatOrder() {
		return repeatOrder;
	}
	public void setRepeatOrder(String repeatOrder) {
		this.repeatOrder = repeatOrder;
	}
	public String getRepeatOrderID() {
		return repeatOrderID;
	}
	public void setRepeatOrderID(String repeatOrderID) {
		this.repeatOrderID = repeatOrderID;
	}
	public String getOfficerName() {
		return officerName;
	}
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	@Override
	public String toString() {
		return "MnpReceiptDetailModel [receiptId=" + receiptId + ", receiptNo=" + receiptNo + ", paymentId=" + paymentId
				+ ", reverseType=" + reverseType + ", paymentType=" + paymentType + ", paymentShop=" + paymentShop
				+ ", orderId=" + orderId + ", accountName=" + accountName + ", accountCategory=" + accountCategory
				+ ", accountAddress=" + accountAddress + ", vatRate=" + vatRate + ", amountTex=" + amountTex
				+ ", vatAmount=" + vatAmount + ", wtAmount=" + wtAmount + ", discountAmount=" + discountAmount
				+ ", totalAmount=" + totalAmount + ", texTotalAmount=" + texTotalAmount + ", payDate=" + payDate
				+ ", receiptDate=" + receiptDate + ", repeatOrder=" + repeatOrder + ", repeatOrderID=" + repeatOrderID
				+ ", officerName=" + officerName + "]";
	}
	
	
}
