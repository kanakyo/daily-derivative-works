# Daily derivative works
Some derivative works based on daily tasks as a Java beginner. 


## Work 1: Pikachu 0
_created 3 June, 2021;_
### Concepts of the day:

* What is Object-Oriented Programming?

OOP VS Procedual programming; \

* Objects (also called instances in some cases?? idk. )
  * Item 2a
  * Item 2b
* Classs
  * Instance variables
  * Methods
  * Constructor


A Pokemon game is designed to help understanding 
Object-Oriented Programming Concepts


Pokemon 1    | Pokemon 2
------------ | -------------
name:Kira| name: Terra   
hp:1100| hp: 900   
mp:900| mp: 1100  
------------ | -------------
functions; | functions;
volt(); | water();


## Work 2: -
_created 4 June, 2021;_

### Concepts of the day:
Object-Oriented Programming

#### Inheritance ・継承
* e (extends? idk.)
  * Item 2a
field　＋　methods will be  from _Pikachu_ to _Raichu_. \
constructor shall not be extended except for 'default constructor'
```java
 public class Arashi extends Idol{}
```
 public class Arashi    extend      s Idol{} \
              Arash     i is a      Idol     \
          add Arashi variables into Idol     \

 
  * Item 2b

>
#### Encapsulation　

```java
public int getTasks() {
			return this.tasks;
		}  \
  main class \
		System.out.println(emp.getName());
 ```
  
  
#### Polymorphism 多態性

## Work 5 The Universe, the moon and stars
### HTML

example of **Radio Button** in a MVC Model

in jsp 
```html
<form action="CalcServlet" method="post"> 
Name <input type="text" name="name"><br>
Birth<input type="text" name="num1"><br>
<input type="radio" name="game" value="stars">   <font color="#EBFFE9" size=3>Counting Stars★</font><br> 
<input type="radio" name="game" value="moon"> <font color="#EBFFE9" size=3> Talking to the Moon☽</font> <br>
 <br>
<input type="submit" value="Check out"><br>
</form>
```
 in servlet 
```java
 		//get request parameter
		request.setCharacterEncoding("UTF-8");
		int num1= Integer.parseInt(request.getParameter("num1"));
		//int num2= Integer.parseInt(request.getParameter("name"));
		String name = request.getParameter("name");
		String game = request.getParameter("game");	
		//biz logic, run
		CalcLogic calc = new CalcLogic();
		int ans = 0;
		if(game.equals("stars")) {
			ans = calc.process(num1);
		}else if(game.equals("moon")) {
			ans = calc.moon(num1);
		}
		//reqeust scope
		request.setAttribute("ans",ans);
		request.setAttribute("name",name);
		//forward this to "calcResult.jsp"  
		request.getRequestDispatcher("calcResult.jsp").forward(request, response); 	
	}
```


## JAVA API Programming

### 第1章 エラーの種類と対応策
* 1.1 例外処理の流れ
* 1.2 例外処理の流れ
* 1.3 例外クラスとその種類
  * **Error**系; no catch required
    * FormatError, MemoryError, etc.
  * **Exception**系; must-catch, check例外
    * ConnectException, etc.
  * **RunTimeException**系　非チェック例外
    * IllegalArgument,
* 1.4 例外の発生と例外インスタンス
  *  例外インスタンスの受け渡し
    *   example(IOException): inside **try{}**, JVM run the prgm while monitoring Exceptions, once it happens, **catch{}**
```java
package model;
import java.io.FileWriter;
import java.io.IOException;
public class ExcepS1 {
public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("hello");
		fw.close();
		}
		catch(IOException e) {
			System.out.print("failed");
		}
		System.out.print("end");
	}
}

```
  *  How to read **StackTrace**
* 1.5 さまざまなcatch構文
  * try-catch
 ```java
try {
}
catch(IOException String) {
     System.out.print("xxx");
}
```
  * try-catch for 2 or more exceptions  *multi catch*
 ```java
try {
}
catch(IOException String) {
     System.out.print("xxx");
}
catch(NullPointerException String) {
     System.out.print("xxx");
}
```
  * Finally 
The code inside the **finally{ }** will always be executed, even if an exception is thrown from within the try or catch block.
 ```java
try {
   System.out.print("DONE");
}
catch(IOException String) {
     System.out.print("Error message: MemoryError");
}
catch(NullPointerException String) {
     System.out.print("Error message: Null xxx");
}finally{
     System.out.print("The cod will always be executed no matter what. ");
}
```
* 1.6例外の伝播
  * 例外の伝播による強制終了
  * throw statement , for **EXception**(check例外)
* 1.7例外を発生させる
  * report exceptions to JVM



### 第2章 文字列の操作

* 2.1文字列処理とは
* 2.2基本的な文字列操作
* 2.3文字列の連結
* 2.4正規表現の活用。
* 2.5文字列の整形。

### 第3章コレクション
* 3.1コレクションとは
  * コレクション制約
  * Only Instance / Objects could be stored in Collection Classes
  * The built-in types(integral types byte, short, int, long, char, floating-point) cannot be 
* 3.2 ArrayListの使いかた
* 3.3 ArrayListの上位インタフェース
* 3.4 Mapの使いかた
* 3.5コレクションの応用


## JAVA & Database
* 第1章 データベースの基礎
  * 1.1 Database, relational database
    * RD : Relational Database
    * DBMS : - - Management System
  * 1.2データベースの基本操作
* 第2章 JDBCを用いたデータベース操作の基本手順
  * 2.1 基本パターン
  * JDBC API
* 第3章更新系SQL文の送信
  * 3.1 更新系SQL文の送信
* 第4章検索系SQL文の送信
  * 4.1 検索系SQL文の送信
  * 4.2 結果表の処理
* 第5章トランザクション
  * 5.1トランザクション処理
  * 5.2 JDBC経由でのトランザクション制御
* 第6章DAOパターン
  * 6.1 DAOとDTO 
  * 6.2 DAOの例
  * 6.3 DAOの改善
  
