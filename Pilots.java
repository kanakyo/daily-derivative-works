
public class Pilots extends Evas {
	
	//private int birth;
	
	
	
	public void battle(Evas target) {
		
		System.out.println(this.name + "God in his heaven, all's right with the world...");
		System.out.println(this.name + ": 人類 attack");
		int damage = 80;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		
	}
	

}
