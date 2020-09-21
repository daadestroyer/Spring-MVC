package Model;

public class User {
	private String uemail;
	private String uname;
	private String upassword;
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {	
		this.uemail = uemail;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	@Override
	public String toString() {
		return "User [uemail=" + uemail + ", uname=" + uname + ", upassword=" + upassword + "]";
	}

	 

}
