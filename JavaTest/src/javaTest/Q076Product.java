package javaTest;
//SQ: 27
public class Q076Product {

	int id;
	String name;
	
	public Q076Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		Q076Product p1 = new Q076Product(101, "Pen");
		Q076Product p2 = new Q076Product(101, "Pen");
		Q076Product p3 = p1;
		
		boolean ans1 = p1 == p2;
		boolean ans2 = p1.name.equals(p2.name);
		
		System.out.println(ans1 + ":" + ans2);
		
	}

}

/*
	What is the result?
	A. true:true
	B. true:false
	C. false:true
	D. false:false

	Answ: false:true

*/