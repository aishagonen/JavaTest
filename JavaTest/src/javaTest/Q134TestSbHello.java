package javaTest;
//SQ:46

 public class Q134TestSbHello {

	int a1;
	
	public static void doProduct(int a) {
		a = a * a;
	}
	
	public static void doString(StringBuilder s) {
		s.append(" " + s);
	}
	
	public static void main(String[] args) {
		
		Q134TestSbHello item = new Q134TestSbHello();
		
		item.a1 = 11;
		
		StringBuilder sb = new StringBuilder("Hello");
		
		Integer i = 10;
		
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		
		System.out.println(i + " " + sb + " " + item.a1);
		

	}

}

 /*
	 What is the result?
	
	A. 10 Hello Hello 11
	B. 10 Hello Hello 121
	C. 100 Hello 121
	D. 100 Hello Hello 121
	E. 10 Hello 11
 
 
 	Answ: 10 Hello Hello 11
 	
 	
 	StringBuilder oldugu icin 'Hello Hello' olur. String olsaydi sadece ' Hello' olurdu. 
 	Cunku SB'ler degisir. String'te yeni bir string olusur. 
 	
 	Sayilar method'larda kullanilmis ama return edilmedigi icin method icinde isleyip kalir. 
 	O yuzden bi etkileri yok. 
 
 */