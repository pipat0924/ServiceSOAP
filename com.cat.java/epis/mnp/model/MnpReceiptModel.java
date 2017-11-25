package epis.mnp.model;

public class MnpReceiptModel {
	//M4

	    private String receiptId;
	    private String receiptNo;
	    private String officerName;
	    private String cancelDate;
	    private String cancelReasonId;
	    private String cancelReason;
	    private String cancelNote;
	    private String cancelApprove;
	    private String accountNo;
	    private String accountName;
	    private String bankName;
	    private String branch;
	    private String serviceNo;
	    private String reverseType;
	    
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
		public String getOfficerName() {
			return officerName;
		}
		public void setOfficerName(String officerName) {
			this.officerName = officerName;
		}
		public String getCancelDate() {
			return cancelDate;
		}
		public void setCancelDate(String cancelDate) {
			this.cancelDate = cancelDate;
		}
		public String getCancelReasonId() {
			return cancelReasonId;
		}
		public void setCancelReasonId(String cancelReasonId) {
			this.cancelReasonId = cancelReasonId;
		}
		public String getCancelReason() {
			return cancelReason;
		}
		public void setCancelReason(String cancelReason) {
			this.cancelReason = cancelReason;
		}
		public String getCancelNote() {
			return cancelNote;
		}
		public void setCancelNote(String cancelNote) {
			this.cancelNote = cancelNote;
		}
		public String getCancelApprove() {
			return cancelApprove;
		}
		public void setCancelApprove(String cancelApprove) {
			this.cancelApprove = cancelApprove;
		}
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getServiceNo() {
			return serviceNo;
		}
		public void setServiceNo(String serviceNo) {
			this.serviceNo = serviceNo;
		}
		public String getReverseType() {
			return reverseType;
		}
		public void setReverseType(String reverseType) {
			this.reverseType = reverseType;
		}
		@Override
		public String toString() {
			return "MnpReceiptModel [receiptId=" + receiptId + ", receiptNo=" + receiptNo + ", officerName="
					+ officerName + ", cancelDate=" + cancelDate + ", cancelReasonId=" + cancelReasonId
					+ ", cancelReason=" + cancelReason + ", cancelNote=" + cancelNote + ", cancelApprove="
					+ cancelApprove + ", accountNo=" + accountNo + ", accountName=" + accountName + ", bankName="
					+ bankName + ", branch=" + branch + ", serviceNo=" + serviceNo + ", reverseType=" + reverseType
					+ "]";
		}

	    
}
