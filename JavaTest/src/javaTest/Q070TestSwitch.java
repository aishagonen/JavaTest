package javaTest;
//SQ:71
public class Q070TestSwitch {

	public static void main(String[] args) {
		
		// line n1
		
		
//		Byte x = 1;
//		short x = 1;
//		String x = "1";
//		Long x = 1;
//		Double x = 1;
//		Integer x = new Integer ("1");

		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		}

	}

}



/*
	Which three code fragments can be independently inserted at line n1 to enable the code to print one?
	
	A. Byte x = 1;
	B. short x = 1;
	C. String x = "1";  --> calismasi icin 'case "1":' seklinde yazilmaliydi.
	D. Long x = 1;
	E. Double x = 1;
	F. Integer x = new Integer ("1"); --> calisiyor. ama 'The constructor Integer(String) is deprecated 
										since version 9' diyor. >>> ?? bak

	
	Answ: A,B,F

	-Switch case'lerde Byte, short, char, Integer ve String calisir ancak, Long ve Double, boolen, float calismaz. 
	




*/