package javaTest;
//SQ:132 

//Mystring.java:
//package p1;
class MyString {
	
	String msg;
	
	MyString(String msg) {
		this.msg = msg;
	}
}

//Test.java:
//package p1;
public class Q054TestHello {

	public static void main(String[] args) {
		
		System.out.println("Hello" + new StringBuilder("Java SE 8"));
		System.out.println("Hello" + new MyString("Java Se 8"));
		
	}
}


/*
	Given the definitions of the MyString class and the Test class:
	What is the result?
	
	A. 	Hello Java SE 8
		Hello Java SE 8
	
	B. 	Hello java.lang.StringBuilder@<<hashcode1>>
		Hello p1.MyString@<<hashcode2>>
	
	C. 	Hello Java SE 8
		Hello p1.MyString@<<hashcode>>
	
	D. 	Compilation fails at the Test class. 

	
	Answ: C

 	'Java Se 8' yazirmak istiyorsan objeyle '.msg' yazip cagir. 



*/