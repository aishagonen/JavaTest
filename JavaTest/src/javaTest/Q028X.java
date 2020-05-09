package javaTest;
//SQ:77
public class Q028X {

	static int i;
	int j;
	
	public static void main(String[] args) {
		
		Q028X x1 = new Q028X();
		Q028X x2 = new Q028X();
		
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		
		System.out.println(x1.i + " "+ x1.j + " " + x2.i +  " " + x2.j );
	}

}



/*
 	Answ: 5 4 5 6

	Static variable'lar class'a ait oldugu icin, degistigi her yerde, classin her yerinde degisir. 
	Non-static variable'lar  objeye ait oldugu icin objeye gore farkli deger alabilir, birbirini etkilemez. 
*/
