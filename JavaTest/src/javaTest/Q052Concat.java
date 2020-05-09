package javaTest;
//SQ:122 
public class Q052Concat {

	public static void main(String[] args) {
		
		String[] strs = new String [2];
		
		//String[] strs = {"A", "B"};
		
		int idx = 0;
		
		for (String s : strs) {
			strs[idx].concat("element" + idx);
			idx++;
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}

	}

}
 
/*
	What is the result?
	
	A. Element 0Element 1
	B. Null element 0Null element 1
	C. NullNull
	D. A NullPointerException is thrown at runtime.

	Answ:  D

	index'ler null oldugu icin methodu kullanamiyor. orada hata veriyor. 
	Gerci kullansa da ise yaramaz, zaten bi yerde son haline assign etmemis. 
  
*/