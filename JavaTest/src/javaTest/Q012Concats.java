package javaTest;
//SQ: 28
public class Q012Concats {

	public static void main(String[] args) {
		
		String ta = "A ";
		
		ta = ta.concat("B ");  	// AB
		
		String tb = "C ";
		
		ta = ta.concat(tb);  	  // ABC
		ta.replace('C', 'D'); 	 // ABD
		ta= ta.concat(tb);    	// ABCC
		
		System.out.println(ta); // ABCC

	}

}


/*
 	What is result?
 	Answ: A B C C 
 	
 	Burada Stringlerin immutable olmasini hatirlamak gerekiyor;
 	 	'ta.replace('C', 'D');' denilmis ama bu degisiklik 'ta'ya esitlenmemis. 
 	 	'ta = ta.replace('C', 'D');' denilMEmis. O nedenle degisiklik yapildigi yerde kalir. 
 	 	'ta' en son neye esitlendiyse ondan devam eder. 
 	
 	 System.out.println(ta.replace('C', 'D')); --> syso'icinde yazarsam ABD goruyorum. 
 	 Ama bu ta'ya esitlendigi anlamina gelmez. 
 	 
 	 Immutable simply means unmodifiable or unchangeable. Once string object is created its data 
 	 or state can't be changed but a new string object is created.
 	
 */



