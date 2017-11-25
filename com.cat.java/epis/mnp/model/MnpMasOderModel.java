package epis.mnp.model;

import java.util.List;

public class MnpMasOderModel {
	
	private String orderId;
	private String name;
	private String surname;
	private String ttile;
	private String address;
	private String categoryId;
	private String categoryName;
	private String zipcode;
	private String vatRate;
	private String portFee;
	private String qtyPort;
	private String totalFeeAmount;
	private String vatAddress1;
	private String vatAddress2;
	private String vatAddress3;
	private String taxId;
	private String mdn;
	private String iccd;
	private String branchName;
	private String branchCode;
	private String orderIdRef;
	
	public MnpMasOderModel() {
		super();
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTtile() {
		return ttile;
	}
	public void setTtile(String ttile) {
		this.ttile = ttile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getVatRate() {
		return vatRate;
	}
	public void setVatRate(String vatRate) {
		this.vatRate = vatRate;
	}
	public String getPortFee() {
		return portFee;
	}
	public void setPortFee(String portFee) {
		this.portFee = portFee;
	}
	public String getQtyPort() {
		return qtyPort;
	}
	public void setQtyPort(String qtyPort) {
		this.qtyPort = qtyPort;
	}
	public String getTotalFeeAmount() {
		return totalFeeAmount;
	}
	public void setTotalFeeAmount(String totalFeeAmount) {
		this.totalFeeAmount = totalFeeAmount;
	}
	public String getVatAddress1() {
		return vatAddress1;
	}
	public void setVatAddress1(String vatAddress1) {
		this.vatAddress1 = vatAddress1;
	}
	public String getVatAddress2() {
		return vatAddress2;
	}
	public void setVatAddress2(String vatAddress2) {
		this.vatAddress2 = vatAddress2;
	}
	public String getVatAddress3() {
		return vatAddress3;
	}
	public void setVatAddress3(String vatAddress3) {
		this.vatAddress3 = vatAddress3;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getMdn() {
		return mdn;
	}
	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
	public String getIccd() {
		return iccd;
	}
	public void setIccd(String iccd) {
		this.iccd = iccd;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getOrderIdRef() {
		return orderIdRef;
	}
	public void setOrderIdRef(String orderIdRef) {
		this.orderIdRef = orderIdRef;
	}
	@Override
	public String toString() {
		return "MnpMasOderModel [orderId=" + orderId + ", name=" + name + ", surname=" + surname + ", ttile=" + ttile
				+ ", address=" + address + ", categoryId=" + categoryId + ", categoryName=" + categoryName
				+ ", zipcode=" + zipcode + ", vatRate=" + vatRate + ", portFee=" + portFee + ", qtyPort=" + qtyPort
				+ ", totalFeeAmount=" + totalFeeAmount + ", vatAddress1=" + vatAddress1 + ", vatAddress2=" + vatAddress2
				+ ", vatAddress3=" + vatAddress3 + ", taxId=" + taxId + ", mdn=" + mdn + ", iccd=" + iccd
				+ ", branchName=" + branchName + ", branchCode=" + branchCode + ", orderIdRef=" + orderIdRef + "]";
	}
	
	
	
}
