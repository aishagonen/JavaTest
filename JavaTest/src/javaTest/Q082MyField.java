package javaTest;
//SQ:65
public class Q082MyField {

	int x;
	int y;
	
	public void doStuff(int x, int y) {
		x = x;
		y = this.y;
	}
	
	public void display() {
		System.out.println(x + " " + y + " :");
	}
	
	public static void main(String[] args) {
		
		Q082MyField m1 = new Q082MyField();
		
		m1.x = 100;
		m1.y =200;
		
		Q082MyField m2 =new Q082MyField();
		
		m2.doStuff(m1.x, m1.y);
		
		m1.display();
		m2.display();
		
	}

}


/*100 0    

	What is the result?
	A. 100 0 : 100 200:
	B. 100 0 : 100 0 :
	C. 100 200 : 100 200 :
	D. 100 200 : 100 0 :

	Answ:  100 200 : 100 0 :



*/