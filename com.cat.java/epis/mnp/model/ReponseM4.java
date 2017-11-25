package epis.mnp.model;

public class ReponseM4 {
	private String status;
	private String note;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "ReponseM4 [status=" + status + ", note=" + note + "]";
	}
	
	
}
