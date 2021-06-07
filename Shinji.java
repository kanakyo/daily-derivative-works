public class Shinji extends Pilots {
	
	//private int birth;
	
	
	public Shinji() {
		this.name = "Ikari Shinji";
		this.hp = 800;
		}
	
	
	public void battle(Evas target) {
		
		System.out.println("３号機、出動。");
		
		System.out.println(this.name + ": 涙 attack");
		
		int damage = 80;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		
	}

	
	public void mama(Evas target) {
		
		System.out.println("３号機、暴走ーーーー");
	
		System.out.println(this.name + ": 涙 attack");
		
		int damage = 80;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		
	}
	
}