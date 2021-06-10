package model;

public class User {
	
	private String id;
	private String name;
	private String pw;
	
	
	//constructor
	
	
	/*
	 * when public User(): new User(); null null null
	 * public User() {		
	 * } 
	 * */

	
	public User(String id, String name, String pw) {
	
		this.id = id;
		this.name = name;
		this.pw = pw;
		
	}
	



	//setter getter
	public String getId() {
		
		return id;
	}
	public void setId(String id) {
		if(id.equals("")) {
			throw new IllegalArgumentException("invalid ID");			
		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals("")) {
			throw new IllegalArgumentException("invalid Name");			
		}
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		if(pw.equals("")) {
			throw new IllegalArgumentException("invalid Password");			
		}
		this.pw = pw;
	}

}
