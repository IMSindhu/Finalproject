package model;

public class User {
	private int uid;
	private String username;
	private String email;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String username, String email, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
}
