
public class User {
	private String userName;
	private String email;

	public void User() {
		userName = "";
		email = "";
	}

	public void User(String userName, String email) {
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void grantReport() {

	}

	public void viewDonationReport() {

	}

	public void viewDonationTotals() {

	}

}
