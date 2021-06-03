
public class Terragame {
	
	 //Field
		String name;
		int hp;
		int mp;
		
		public Terragame(String name, int hp, int mp) {
			this.name = name;	
			this.hp = hp;
			this.mp = mp;
		}

	//method 2 Absorb
		public void absorb(Pikachu target) {
		//	if(this.mp>=70) {

			
			System.out.println(this.name + ":  💧Water attack!");
			int damage = 70;
			int mpp = 80;
			target.hp -= damage;
			this.mp -= mpp;
			
			System.out.println(target.name + " is attacked, hp-" + damage);
		}
			//else {System.out.println("absorb attack unavailable! ");}
		//}
		
}
