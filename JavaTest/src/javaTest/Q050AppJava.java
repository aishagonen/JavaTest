package javaTest;
//SQ: 
public class Q050AppJava {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = new String("java");
		
			//line n1
		if (str1.equalsIgnoreCase(str2))
		{
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}


/* 
	Which code fragment, when inserted at line n1, enables the App class to print Equal?
  
	A.  String str3 = str2;
		if (str1 == str3)    --> not Equal
		 
	B. 	if (str1.equalsIgnoreCase(str2))  --> Equal
	
	C. 	String str3 = str2;
		if(str1.equals(str3))  --> not Equal
	
	D. if (str1.toLowerCase() == str2.toLowerCase())  --> not Equal


	Answ: B
*/