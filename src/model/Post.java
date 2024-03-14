package model;

import java.time.LocalDateTime;

public class Post {
	private String msg;
	private LocalDateTime dateTime;
	private int countOfLikes = 0;
	
	public String getMsg(){
		return msg;
	}
	public void setMsg(String msg) {
		if(msg != null && msg.length() > 5 && msg.length() < 300)
			this.msg = "----";
		else
			this.msg = msg;
			
	}
	public LocalDateTime getDate() {
		return dateTime;
	}
	public void setDateTime() {
		this.dateTime = LocalDateTime.now();
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	public void incrementCountOfLikes(int countOfLikes) {
		this.countOfLikes++;
	}
	public Post() {
		setMsg("Test msg");
		setDateTime();
	}
	public Post(String msg) {
		setMsg(msg);
		setDateTime();
	}
	@Override
	public String toString() {
		return msg + " ( " + dateTime + " ) " + "Likes [" + countOfLikes + " ]";
	}
}
