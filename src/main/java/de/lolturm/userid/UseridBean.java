package de.lolturm.userid;

public class UseridBean {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String summonername;

	public UseridBean() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSummonername() {
		return summonername;
	}

	public void setSummonername(String summonername) {
		this.summonername = summonername;
	}
}
