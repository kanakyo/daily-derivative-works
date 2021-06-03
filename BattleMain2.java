import java.util.Random;

// THIS IS THE MAIN CLASS !!!

public class BattleMain2 {

	public static void main(String[] args) throws InterruptedException {
		
		//character(instance) 1: Kira
		Pikachu pika = new Pikachu("Kira", 1100, 900);
	
		//character 2: Terra
		Terragame tira = new Terragame("Terra", 900,1100);
	//Random rand = new Random();
	//int enWC = rand.nextInt(4)+1;
		
		// Step 3: Calling methods (instruction)
	int rd = 1;
		while(pika.hp>=0 && tira.hp >= 0){
			if (pika.mp<70 || tira.mp < 80) {
				
				break;
			}
			Thread.sleep(500);
			System.out.println("*--------------------*"); 
			System.out.println("  Round:  " + rd); 
		    System.out.println("     Start!  "); 
		    System.out.println("*--------------------*"); 
		    
		    //IF MP > 100
		    if(pika.hp >= 0) {
			pika.volt(tira);
			System.out.println("---"); 
			System.out.println(tira.name +" hp: "+ tira.hp+ "; "+ " mp: "+tira.mp);
			System.out.println(pika.name + " hp: "+pika.hp + "; " +" mp: "+ pika.mp);
			System.out.println("*SWITCH*");
			//} else {System.out.println("Volt Attack unavailable! ");}
		    } else {
		    	System.out.println(tira.name + "Wins"); 
		    }
		    
			//IF MP > 80
		    if(tira.hp>=0) {
			tira.absorb(pika);
			System.out.println("---"); 
			System.out.println(pika.name + " hp: "+pika.hp + "; " +" mp: "+ pika.mp);
			System.out.println(tira.name +" hp: "+ tira.hp+ "; " + " mp: "+tira.mp);
			System.out.println("Absorb Attack unavailable! ");
		    }else {System.out.println(pika.name + "Wins");
			}
		   rd ++;  
		}
	
	System.out.println( "             ");
	System.out.println( " **** GAME OVER **** ");
	System.out.println(pika.name + " hp: "+pika.hp + "; "+" mp: "+ pika.mp);
	System.out.println(tira.name +" hp: "+ tira.hp+  "; "+ " mp: "+tira.mp);

	if (tira.hp<=0){System.out.println(pika.name + " wins！");  
    }else if (pika.hp<=0){System.out.println(tira.name + " wins！"); }
}
}

