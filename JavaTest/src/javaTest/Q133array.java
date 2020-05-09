package javaTest;
//SQ:133
public class Q133array {

	public static void main(String[] args) {
		
		int array[] = {10, 20, 30, 40, 50};
		int x = array.length; /*5*/
		
		/*line n1*/
		do {
			x--;
			System.out.print(array[x]);
		} while (x > 0);
		
		
	}

}


/*
	Which two code fragments can be independently inserted at line n1 to enable the code to print the elements
	of the array in reverse order?
	
	A. while (x > 0) {x--;System.out.print(array[x]);}     	--> ok.
	B. do {x--;System.out.print(array[x]);} while (x >= 0);	--> 'x>=0' dedigi icin 0'a gelince devam eder ama x-- dediginde '-1'e duser. hata verir.'x>0' olmali.   
	C. while (x >= 0) {System.out.print(array[x]);x--;}		--> Arrayin 5.indexi yok. hata verir.
	D. do {System.out.print(array[x]);--x;} while (x >= 0); --> 	"		"	 "		"	"
	E. while (x > 0) {System.out.print(array[--x]);}		--> ok.

	Answ: A,E.



*/