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



## Work 5 ()

### 第1章 エラーの種類と対応策
* 1.1 例外処理の流れ
* 1.2 例外処理の流れ
* 1.3 例外クラスとその種類
  * Error; FormatError, MemoryError, etc.
  * Exceptional; ConnectException, etc.
  * RunTimeException 
* 1.4 例外の発生と例外インスタンス
  *  例外インスタンスの受け渡し
    *   example(IOException): inside try{}, JVM run the prgm while monitoring Exceptions, once it happens, catch{}
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
  *  How to read StackTrace
* 1.5 さまざまなcatch構文

1.  try-catch

#### 1.3例外クラスとその種類

Error, Exceptional, RunTimeException 

check 例外



#### 1.6例外の伝播

#### 1.7例外を発生させる

### 第2章 文字列の操作

2.1文字列処理とは

2.2基本的な文字列操作

2.3文字列の連結

2.4正規表現の活用。

2.5文字列の整形。

### 第3章コレクション

3.1コレクションとは

3.2 ArrayListの使いかた

3.3 ArrayListの上位インタフェース

3.4 Mapの使いかた

3.5コレクションの応用
