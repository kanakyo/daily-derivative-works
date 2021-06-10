package model;

public class Confirm {

	public boolean process(User user) {
		
		
		System.out.println("ID:" + user.getId());
		System.out.println("name:" + user.getName());
		System.out.println("password:" + user.getPw());
		System.out.println("signed up");
		
		return true;
		
	}
	
}
