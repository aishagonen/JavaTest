package javaTest;
//SQ:106

class Studentx {
	
	String name;
	
	
	public Studentx(String name) {
		this.name = name;
	}
}

public class Q137StudentTest {

	public static void main(String[] args) {
		
		Studentx[] students = new Studentx[3];
		
		students[1] = new Studentx("Richard");
		students[2] = new Studentx("Donald");

		for (Studentx s : students) {
			System.out.println("" + s.name);
		}	
			
		
	}

}

/*
	What is the result?
	
	A. null Richard Donald
	B. Richard Donald
	C. Compilation fails.
	D. An ArrayIndexOutOfBoundsException is thrown at runtime.
	E. A NullPointerException is thrown at runtime.

	Answ: E
	
	0. indexte bir eleman tanimlanmamis. Foreach loop'ta 's' array'in elemanlari uzerinde gezerken, O.indexe gelir ve bakar
	boyle bir eleman yok ve biz 's.name'diyerek olmayan bir seyin adini soruyoruz. O nedenle null exeption verir. 
	Eger 0. indexi tanimlasaydik ve null deyip biraksaydik, o zaman output'ta 0.indexi null gosterirdi.
	Ama burada 0.index icin obje hic olusturulmamis.  
	
	Eger sadece memorydeki yerini sorsaydi o zamand da 'null' gosterirdi. yani 's.name' degil de 's' isteseydi



*/
