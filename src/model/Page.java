package model;

import java.util.ArrayList;

import model.user.User;

public class Page {
	private String title;
	private String description;
	private ArrayList<User> followers = new ArrayList<User>();
	private ArrayList<Post> postsInPage = new ArrayList<Post>();
	
	public Page() {
		setTitle("TitleTest");
		setDescription("Testdescription");
		
	}
	public Page(String title, String description) {
		setTitle(title);
		setDescription(description);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.length() > 3)
			this.title = title;
		else
			this.title = "-----------";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if(description != null && description.length() >3)
			this.description = description;
		else
			this.description = "-------";
	}
	public ArrayList<User> getFollowers() {
		return followers;
	}
	public ArrayList<Post> getPostsInPage() {
		return postsInPage;
	}

	@Override
	public String toString() {
		return title + "(" + description + ")" +">"+ followers.size();
	}
}
