# Daily derivative works
Some derivative works based on daily tasks as a Java beginner. 

## USEFUL LINES
```java
without contructor
Employee emp = new Employee("Domoto");
with constructor
Pikachu pika = new Pikachu("Kira", 1100, 900);

```

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
  * Constructor コンストラクタ
  
```java
//method

public Pikachu(String name, int hp, int mp) {
	this.name = name;	
	this.hp = hp;
	this.mp = mp;
	}
main:
Pikachu pika = new Pikachu("Kira", 1100, 900);
 ```


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
ArrayList <String> variablename = new ArrayList<String/int/etc>();
```java
	
public static void main(String[] args) {
		
		List <String> myFav = new ArrayList<String>();
		System.out.println("私の好きなもの");
		myFav.add("ロードレーサー");
		myFav.add("ロードレーサーに乗っている時見える世界");
		myFav.add("母さんの手料理");
		myFav.add("寝言を喋る犬");
		
		int size = myFav.size();
		System.out.println(size+"つあります");
```
**拡張for文** \
	
拡張for文を使う対象は、配列とコレクションのようなIterableのサブタイプである。\このような対象の内容を、すべて取得してある操作を実行しようとするとき拡張for文が使える。\
	
```java

for ( 型　変数名 : 式 ){
  文;
}


public class EnhancedForArray {
    public static void main (String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//[1]
        for (int number : numbers) {//[2]
            System.out.println("[3] number = " + number);
        }
    }
}
```
1] 配列変数numbersに初期値を代入する。\
[2] [3] numberに配列の値を代入し、配列の数だけnumberの表示を繰り返す。	
```java
public class EnhancedForArray {
    public static void main (String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//[1]
        for (int number : numbers) {//[2]
            System.out.println("[3] number = " + number);
        }
    }
}
```
1] 配列変数numbersに初期値を代入する。\
[2] [3] numberに配列の値を代入し、配列の数だけnumberの表示を繰り返す。	
```java
for (String fv: myFav) {
		System.out.println(fv);
	}	
```
	

for文
```java
for(int i=size-1;i>=0;i--) {
	String fv = myFav.get(i);
	System.out.println(fv);
}       System.out.println(myFav);
	}

```


* 3.3 ArrayListの上位インタフェース
	
ArrayList <Book> booklist = new ArrayList<>();


* 3.4 Mapの使いかた
```java
public class HashMapS1 {
	public static void main(String[] args) {
		Map<String,String>favMap= new HashMap<>();
		favMap.put("ジャニーズ", "Arashi");
		favMap.put("errorkey","not data");
		String jns = favMap.get("正統ジャニーズ");
		System.out.print(jns);
		favMap.remove("errorkey");
		System.out.print(favMap);
	}
}
```
* 3.5コレクションの応用




## JAVA & Database
* 第1章 データベースの基礎
  * 1.1 Database, relational database
    * RD : Relational Database
    * DBMS : - - Management System
  * 1.2データベースの基本操作
    * 更新系: UPDATE, DELETE, INSERT
    * 検索系: SELECT
	
* 第2章 JDBCを用いたデータベース操作の基本手順
  * 2.1 基本パターン
  * JDBC API
  
### 第3章  更新系SQL文
```java


```
  * Step 0: Preparation 

```java
try {
      Class.forName("org.h2.Driver");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
	throw new IllegalStateException("JDBC Driver Not found");
}

```
Step 1: Set up Connection - to Database (h2) \
DriverManager.getConnection(JDBC URL, Username, password)

```java
Connection con = null;
try{con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/mydb", "sa","");
```
  * Step 2-1: SQL 雛形 \
**PreparedStatement pstmt = con.prepareStatement();** \
A SQL statement is precompiled and stored in a PreparedStatement object(SQL Container) \ 
**Update**
```java
String sql =  "UPDATE FROM EMP(TABLE NAME)  SET ID=? WHERE ID=?";
PreparedStatement pstmt = con.prepareStatement(sql);
```
**INSERT**
```java	
String sql =  "INSERT INTO BOOK(ISBN,TITLE,PRICE,AUTHOR,FEATURE) VALUES(?,?,?,?,?)";
PreparedStatement pstmt = con.prepareStatement(sql);

pstmt.setString(1,book.getIsbn());
pstmt.setString(2,book.getTitle());
pstmt.setInt(3, book.getPrice());
pstmt.setString(4,book.getAuthor());
pstmt.setString(5,book.getFeature());
int r = pstmt.executeUpdate();
pstmt.close();
return true;
```
**DETELE**
```java
String sql =  "DELETE FROM EMP WHERE ID=?";

PreparedStatement pstmt = con.prepareStatement(sql);
```
	
Step 2-2: SQL 文　組み立て

```java
//update
pstmt.setInt(123, 456);
//delete
pstmt.setString(1, "1001");
```
Step 2-3: SQL文送信

```java
int r = pstmt.executeUpdate();
```
Step 2-4: SQL文送信状態を判断

```java
if(r==1) {
	System.out.println("deleted");
}else {
	System.out.println("ID NOT FOUND");
}
	pstmt.close();
```
Step 2-5: SQL文 close

```java
}catch(SQLException e) {
	e.printStackTrace();
	return null;	
}finally {
	if(con != null) {
	try {
	      System.out.println("Step 2.5 con != null, Done");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
```
  * 1 更新系SQL文の構成

  * 2 更新系SQL文の送信
  * 
```

```
  
  
* 第4章  検索系SQL文
  * 1 検索系SQL文の構成
**ResultSet rs = pstmt.executeQuery();**
```JAVA
System.out.println("enter the keyword of the title");
String keywd = new java.util.Scanner(System.in).nextLine();

String sql =  "SELECT* FROM BOOK WHERE TITLE LIKE ?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, "%"+ keywd +"%");
ResultSet rs = pstmt.executeQuery();
```
  * 2 検索系SQL文の送信
```

```
  * 4.2 結果表の処理
* 第5章トランザクション
  * 5.1トランザクション処理
  * 5.2 JDBC経由でのトランザクション制御
* 第6章DAOパターン
  * 6.1 DAOとDTO 
	* DTO 
```JAVA
public class Dept {
	private int id;
	private String name;
	}
```
  * 6.2 DAOの例
public Dept select(int id) throws SQLException {
.......
String sql = "SELECT * FROM DEPT WHERE ID=?";
	PreparedStatement pstmt = con.prepareStatement(sql);	
	pstmt.setInt(1, id);
	ResultSet rs = pstmt.executeQuery();
	Dept dept = null;
	if (rs.next()) {
		dept = new Dept();				
	dept.setId(rs.getInt("ID"));
		dept.setName(rs.getString("NAME"));
	}
		pstmt.close();
		return dept;
  * 6.3 DAOの改善
  
