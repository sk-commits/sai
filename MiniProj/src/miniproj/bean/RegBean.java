package miniproj.bean;

public class RegBean {
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private String password;
	private String passwordrepeat;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordrepeat() {
		return passwordrepeat;
	}
	public void setPasswordrepeat(String passwordrepeat) {
		this.passwordrepeat = passwordrepeat;
	}
	@Override
	public String toString() {
		return "RegBean [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", passwordrepeat=" + passwordrepeat + "]";
	}
	
	

}
