package javabasic1;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
pw=nerv000
 */

public class fortuneteller{

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("占い師です！");
		System.out.println("君の名は?");
		String name = new java.util.Scanner(System.in).nextLine();
		
		while(name.equals("")){
		  //処理
		  System.out.println("正しい名前を入力してくれ> <" );
		  name = new java.util.Scanner(System.in).nextLine();   
		} 
			
		System.out.println("パスワード入力..." );
		String pw = new java.util.Scanner(System.in).nextLine();
		while(!pw.equals("nerv000")){
		  //処理
			System.out.println("正しいパスワードを入力してくれ" );
			pw = new java.util.Scanner(System.in).nextLine();   
		} 
		TimeUnit.SECONDS.sleep(2);
		System.out.println("占いスタート！");
		TimeUnit.SECONDS.sleep(1);
		System.out.println(name +"さんは...");
		TimeUnit.SECONDS.sleep(2);
			
		Random rand = new Random();
		int num = rand.nextInt(4);
		if (name.equals("渚カヲル")) {
			System.out.println("いつでも大吉です！" );
		}else if(name.equals("碇シンジ")) {
			System.out.println("占い師より渚カヲルを信じろう。");
		}else if(num == 3) {
			System.out.println("凶です。");
		}else if (num == 0) {
			System.out.println("おめでとう！大吉ですよ！");
		}else if (num == 1) {
			System.out.println("中吉ですね。");
		}else if (num == 2) {
			System.out.println("吉ですね。");
		}
		

	}

}
