package javaTest;
//SQ:81
public class Q030WorkDone {

	public static void main(String[] args) {

		String [] arr = {"A","B","C","D"};
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			
			if (arr[i].equals("C")) {
				continue;			
				//break;
			}
			System.out.println("Work Done");
			break;
			//continue;
		}
		
		
	}
}


/* 
   Answ: A Work Done
   

*/