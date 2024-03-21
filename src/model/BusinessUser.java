package model;

import java.util.ArrayList;

import model.Page;
import model.PostType;
import model.user.User;

public class BusinessUser extends User {

	//1. variables
	private ArrayList<Post> privatePosts = new ArrayList<Post>();
	private ArrayList<Post> publicPosts = new ArrayList<Post>();
	private ArrayList<User> followers = new ArrayList<User>();
	private String PVNNo;//example: LV40003245752
	private ArrayList<Page> listOfPages = new ArrayList<Page>();
	
	//2. get and set
	public String getPVNNo() {
		return PVNNo;
	}

	public void setPVNNo(String pVNNo) {
		if(pVNNo != null && pVNNo.matches("[A-Z]{2}[0-9]{11}"))
			this.PVNNo = pVNNo;
		else
			this.PVNNo = "----------";
	}

	public ArrayList<Page> getListOfPages() {
		return listOfPages;
	}
	
	@Override
	public void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle) {
		if(nameAndSurnameOrTitle != null && nameAndSurnameOrTitle.matches("[A-Za-z0-9%&+@=.,!]{3,50}"))
			super.nameAndSurnameOrTitle = nameAndSurnameOrTitle;
		else
			super.nameAndSurnameOrTitle = "----------";
		
	}
	
	
	//3. constructors
	public BusinessUser() {
		super(); //tiek izsaukts User() bezargs konstruktors
		setNameAndSurnameOrTitle("AutoServiss");
		setUsername();
		setPVNNo("LV40003245752");
	}
	
	
	public BusinessUser(String title, String password, String PVNNo) {
		super(password);
		setNameAndSurnameOrTitle(title);
		setUsername();
		setPVNNo(PVNNo);
		
	}
	
	
	//4. toString
	public String toString() {
		return super.toString() + " " + PVNNo;
	}
	
	
	//5. other functions
	public void createPage(String title, String description) throws Exception {
		for(Page tempP: listOfPages) {
			if(tempP.getTitle().equals(title))
				throw new Exception("Page already exists");
		}
		listOfPages.add(new Page(title, description));
	}
	
	public void publishPostInPage(String pageTitle, String msg) throws Exception {
		// TODO parbaudes
		for(Page tempP: listOfPages) {
			if(tempP.getTitle().equals(pageTitle)) {
				Post newPost = publishPost(PostType.publicPost, msg);
				tempP.getPostsInPage().add(newPost);
				return;
			}
		}
		throw new Exception("PAGE NOT FOUND");
	}
	
	@Override
	public Post publishPost(PostType type, String msg) throws Exception{
		// veic pārbaudi uz not null abiem input mainīgajiem un izmet izņēmumu
		if(type == null || msg ==  null) throw new Exception("Problems with input params");
		
		//izveidojam Post objektu
		Post newPost = new Post(msg);
		return newPost;	
	}

	



}