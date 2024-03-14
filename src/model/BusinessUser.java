package model;
import java.util.ArrayList;

import model.PostType;
import model.user.User;
public class BusinessUser extends User{

	
	private String PVNnumber;
	private ArrayList<Page> listOfPages = new ArrayList<Page>();
	
	public String getPVNnumber() {
		return PVNnumber;
	}

	public void setPVNnumber(String pVNnumber) {
		if(PVNnumber != null)
			this.PVNnumber = pVNnumber;
		else 
		 PVNnumber = "-------";
	}

	public ArrayList<Page> getListOfPages() {
		return listOfPages;
	}

	@Override
	public void publishPost(PostType type, String msg) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle) {
		// TODO Auto-generated method stub
		
	}
	
}
