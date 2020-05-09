package javaTest;

public class Q064Fors {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		

		
	}

}
/*
	Given the code fragment: int[] array = {1, 2, 3, 4, 5}; And given the requirements:
	
	1. Process all the elements of the array in the order of entry.
	2. Process all the elements of the array in the reverse order of entry.
	3. Process alternating elements of the array in the order of entry. Which two statements are true?
	
	A. Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.
	B. Requirements 1, 2, and 3 can be implemented by using the standard for loop.
	C. Requirements 2 and 3 CANNOT be implemented by using the standard for loop.
	D. Requirement 1 can be implemented by using the enhanced for loop.
	E. Requirement 3 CANNOT be implemented by using either the enhanced for loop or the standard for loop.
	
	Answ: B, D
	

		for:
			- Standart order yapar.
			- Reverse yapar. 
			- Alternate order yapar.
		
		for each: 
			- Standart order yapar.
			- Reverse yapamaz. 
			- Alternate order yapamaz.
			
		
	1.	for (int i : array) {						
				System.out.print(i + " ");
			}
		
		for (int i = 0; i < array.length; i++) {	
				System.out.print(array[i] + " ");
			}
			
	
	2. for (int i = array.length-1; i >= 0 ; i--) {	
			System.out.print(array[i] + " ");
		}
		
	
	3. 	for (int i = 0; i < array.length; i+=2) { 	
			System.out.println(array[i] + " ");
		}
		
		



*/