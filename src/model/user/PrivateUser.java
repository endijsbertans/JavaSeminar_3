package model.user;

import java.util.ArrayList;

import model.Post;
import model.PostType;

public class PrivateUser extends User{
	private ArrayList<Post> privatePosts = new ArrayList<Post>();
	private ArrayList<Post> publicPosts = new ArrayList<Post>();// all posts can be stored in one
	private ArrayList<User> followers = new ArrayList<User>();
	
	
	public ArrayList<Post> getPrivatePosts() {
		return privatePosts;
	}

	public ArrayList<Post> getPublicPosts() {
		return publicPosts;
	}

	public ArrayList<User> getFollowers() {
		return followers;
	}
	public PrivateUser() {
		super();
		setNameAndSurnameOrTitle(" ");
		setUsername();
	}
	public PrivateUser(String name, String surname, String password) {
		super(password);
		setNameAndSurnameOrTitle(name + " " + surname);
		setUsername();
	}
	public String toString() {
		return super.toString() + super.nameAndSurnameOrTitle + "(" + super.getUsername() + ")";
	}
	@Override
	public void publishPost(PostType type, String msg)throws Exception {
	Post newPost = new Post(msg);
	 if(type.equals(PostType.publicPost))
		 publicPosts.add(newPost);
	 else if(type.equals(PostType.privatePost)) 
		 privatePosts.add(newPost);
	else 
	 	throw new Exception("User not given");
	}
	public void followPrivateUser(User user) throws Exception {
		if(user ==null) throw new Exception("User Empty!");
		for(User usert: followers) {
			if(usert.getUsername().equals(usert.getUsername()))
				throw new Exception("this user already exists");
		}
		followers.add(user);
	}
	@Override
	public void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle) {
		// TODO Auto-generated method stub
		if(nameAndSurnameOrTitle != null &&
				nameAndSurnameOrTitle.matches("[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+"))
			super.nameAndSurnameOrTitle = nameAndSurnameOrTitle;
		else
			super.nameAndSurnameOrTitle = "--------";
	}
	
}
