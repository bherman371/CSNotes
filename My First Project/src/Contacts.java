
public class Contacts {

	private String name;
	private String phoneNum;
	private String email;
	
	public Contacts(String n, String p, String e) {
		name = n;
		phoneNum = p;
		email = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
