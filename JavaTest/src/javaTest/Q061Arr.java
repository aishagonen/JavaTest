package javaTest;
//SQ:55
import java.util.Arrays;
public class Q061Arr {

	public static void main(String[] args) {
	
		int [] intArr = {15,30,45,60,75};
		
		intArr[2] = intArr[4]; 		/*2.index = 4.index*/
		intArr[4] = 90;				/*4.index=90*/
		
		System.out.println(Arrays.toString(intArr));	/*yeni intArr={15,30,75,60,90}*/		
		
	}

}

/*
	What are the values of each element in intArr after this code has executed?

	A. A. 15, 60, 45, 90, 75
	B. 15, 90, 45, 90, 75
	C. 15, 30, 75, 60, 90
	D. 15, 30, 90, 60, 90
	E. 15, 4, 45, 60, 90


	Answ: C
	 	intArr = {15,30,75,60,90}





*/