
public class Pikachu {
    //Field
	String name;
	int hp;
	int mp;
	
	//constructors
	
	public Pikachu(String name, int hp, int mp) {
		this.name = name;	
		this.hp = hp;
		this.mp = mp;
	}
	
	
	//Method 1 : Volt attack
	public void volt(Terragame target) {
		
			
		
		System.out.println(this.name + ": ⚡️Volt attack!");
		int damage = 80;
		int mpp = 70;
		target.hp -= damage;
		this.mp -= mpp;
		
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		
		}
	
}
