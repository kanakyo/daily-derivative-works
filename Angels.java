
public class Angels extends Evas {
	
	
	
	public void battle(Evas target) {	
		

		System.out.println("人類を崩壊し、そして再生。");
		System.out.println(this.name + ": Angels attack");
		int damage = 80;
		target.hp -= damage;
		System.out.println(target.name + " is attacked, hp-" + damage);
		
		}
	
	public void justice(Evas tatget) {
		
		this.justice(tatget);
		System.out.println("The Thrid Wave is omniment!");
		//abstract method, chapter 5 
		
	}
	

}
