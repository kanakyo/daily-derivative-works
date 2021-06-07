public class Asuka extends Pilots {
	
	//private int birth;
	
	public Asuka() {
		this.name = "Asuka";
		this.hp = 800;
		}
	
	public void battle(Evas target) {

		
		
		System.out.println("２号機、出動！");
		System.out.println("お母さん、私のことを見てーーーーー！");
		int damage = 80;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);

		
	}
	

}