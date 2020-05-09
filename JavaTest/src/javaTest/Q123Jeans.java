package javaTest;
//SQ:108
/*package clothing; */
public class Shirt {
	
	public static String getColor() {
		return "Green";
	}
	
}

/*package clothing.pants; */
			//line n1
public class Q123Jeans {

	public void matchShirt() {
				//line n2
		if (color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	
	public static void main(String[] args) {
		
		Q123Jeans trouser = new Q123Jeans();

		trouser.matchShirt();
	}

}
/*
	Which two set of actions, independently, enable the code fragment to print Fit?
	
	A. At line n1 insert: import clothing.Shirt; At line n2 insert: String color = getColor();
	B. 		''		''	: import clothing.*; 		''       ''   : String color = Shirt.getColor();
	C. 		''		''	: import static clothing.Shirt.getColor; At line n2 insert: String color = getColor();
	D. 		''		no changes required. At line n2 insert: String color = Shirt.getColor();
	E. 		''		insert	: import clothing;
		
	Answ: B, C
	


	Static method, baska bir classta sadece adiyla cagirilmaz, classin adiyla beraber cagirilir.
	Static methodu, package, class ve method adiyla import edersen o zaman sadece adiyla kullanabilirsin. 
	
	
	
*/