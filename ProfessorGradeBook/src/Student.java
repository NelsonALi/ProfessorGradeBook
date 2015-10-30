public class Student {
	private String email;
	private String loginname;
	private String password;
	private String regdate;  // "mm-dd-yyyy"

	public Student() {
	}
	public Student (String email, String loginname, String password, String currentDate) {
		this.email = email;
		this.loginname = loginname;
		this.password = password;
		this.regdate = currentDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
