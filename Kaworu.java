public class Kaworu extends Angels {

	public Kaworu() {
		this.name = "Nagisa Kaworu";
		this.hp = 1000;
		}
	
	public void battle(Evas target) {	
		

		System.out.println("そんな顔をしないで、君のせいじゃない。");
		System.out.println(this.name + ": 放逐 attack");
		int damage = 100;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		}
	public void love(Evas target) {	

		System.out.println("君のせいじゃない");
		System.out.println(this.name + ": 微笑み attack");
		int damage = 80;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		}
	

}