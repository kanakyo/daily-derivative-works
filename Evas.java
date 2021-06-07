
public class Evas {
     
	 String name;
     int hp;
	
	public void battle(Evas target) {
		
		//abstract method
		
	}
	
	public void rest() {
		
		//abstract method, chapter 5 
		System.out.println(this.name + "一旦退場");
		System.out.println(this.name + "の元気値　20点 up!");
	}
	
	
}
