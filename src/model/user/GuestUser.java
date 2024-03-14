package model.user;

public class GuestUser {
	private long userId;
	private static long counter = 0;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId() {
		userId = counter++;
	}
	public static long getCounter() {
		return counter;
	}

	public GuestUser() {
		setUserId();
	}
	public String toString() {
		return " " + userId;
	}
	
	
}
