package javaTest;
//SQ:56
public class Q110Stack {

	public static void main(String[] args) {
		
		int[] stack = {10,20,30};
		
		int size = 3;
		int idx = 0;
		
		/*line n1*/
		do {
			idx++;
		} while(idx < size-1);
		
		
		System.out.println("The top element: " + stack[idx]);

	}

}

/*
	Which code fragment, inserted at line n1, prints The Top element: 30?
	
	A. do{idx++; }while(idx>=size);
	B. while(idx<size) {idx++; }
	C. do{idx++;}while(idx <size-1);
	D. do{idx++;} while(idx<=size);
	E. while(idx<=size-1) {idx++;}
	
	A. idx = 1 oldu. 
	B. idx = 3 oldu
	C. idx = 2 oldu
	D. idx = 4 oldu
	E. idx = 3 oldu

	Answ: C

	30, 2.indexte oldugu icin, idx'in 2'yi vermesi gerek.

*/
