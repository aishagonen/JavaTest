package javaTest;
//SQ:19
public class Q083Vowel {

	private char var;
		
	public static void main(String[] args) {
		
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
	
		Q083Vowel obj1 = new Q083Vowel();
		Q083Vowel obj2 = new Q083Vowel();
		
		obj1.var = 'i';
		obj2.var = 'o';
		
		System.out.println(var1 + ", " + var2);
		System.out.println(obj1.var + ", " + obj2.var);
	}

}


/*

Answ: a, e, i, o



*/