public class EvaBattle { 

	//Pilots vs Angels , generalized as "Evas"
	
public static void main(String[] args) { 

System.out.println("Eva Battle Start ----! "); 

Evas evas1; 
// キャラ選択 
evas1 = new Kaworu(); 


Evas evas2; 
Evas evas3;
Evas evas4;  
// キャラ選択 
evas3 = new Shinji(); 

evas3 = new Asuka();

evas4 = new Adam();



System.out.println(evas1.name + " VS " + evas3.name); 

// 無限ループ 
int rd = 1;
while(true) { 
// プレイヤー側が攻撃(1)か休憩(2)かを選択 
System.out.println("___________" ); 
System.out.println("  Round  " + rd); 
System.out.println("-----------" ); 

/* int input = new 

 java.util.Scanner(System.in).nextInt(); 

 if(input == 1) { 
	evas1.battle(evas3); 
	}  */



	int random = new java.util.Random().nextInt(3); 
	// 0-4 
	if( random == 0 ) { 
		evas1.rest(); 
} else { 
	System.out.println("攻撃----"); 
	evas1.battle(evas3); 
		} 

if(evas3.hp <= 0) {
 System.out.println(evas3.name + "を倒した!!!"); 
break; 
} 

// 敵側が攻撃か休憩かをランダムで選択 
int random1 = new java.util.Random().nextInt(3); 
// 0-4 
if( random1 == 0 ) { 
	evas3.rest(); 
} else { 
	
evas3.battle(evas1); 
} if(evas1.hp <= 0) { 

System.out.println(evas1.name + "は倒されてしまった･･･"); 

break; } 
rd ++;

} 
}

}
