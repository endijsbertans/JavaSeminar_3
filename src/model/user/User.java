package model.user;

import service.IpostService;

public abstract class User extends GuestUser implements IpostService{
	private String username;
	private String password;
	protected String nameAndSurnameOrTitle;
	
	public String getNameAndSurnameOrTitle() {
		return nameAndSurnameOrTitle;
	}
	public abstract void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle);
	public String getUsername() {
		return username;
	}
	public void setUsername() {
		this.username = nameAndSurnameOrTitle + " " + getUserId();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password !=null && password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$"))
			this.password = password;
		else
			this.password = "-------";
	}
	public User() {
		super();
		setPassword("13456789");		
	}
	public User(String password) {
		super();
		setPassword("password");		
	}
	public String toString() {
		return super.toString() + " : ";
	}
}
