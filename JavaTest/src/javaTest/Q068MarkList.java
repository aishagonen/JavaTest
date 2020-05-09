package javaTest;
//SQ:63
public class Q068MarkList {

	int num;
	
	public static void graceMarks(Q068MarkList obj4) {
		obj4.num +=10;
	}
	
	public static void main(String[] args) {
		
		Q068MarkList obj1 = new Q068MarkList();
		Q068MarkList obj2 = obj1;
		Q068MarkList obj3 = null;
		
		obj2.num = 60;
		graceMarks(obj2);
		
		
	}

}

/*
	How many MarkList instances are created in memory at runtime?
	A. 1
	B. 2
	C. 3
	D. 4


	Answ: 1 

*/