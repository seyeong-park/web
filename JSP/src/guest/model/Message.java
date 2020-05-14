package guest.model;

public class Message {
	
	int messagId;
	String guestName;
	String password;
	String message;
	
	public int getMessagId() {
		return messagId;
	}
	public void setMessagId(int messagId) {
		this.messagId = messagId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
