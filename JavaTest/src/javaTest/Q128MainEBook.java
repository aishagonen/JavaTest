package javaTest;
//SQ: 83
interface Downloadable {
	
	public void download();
	
}

interface Readable extends Downloadable {	//line n1
	
	public void readBook();
	
}

abstract class Book implements Readable {	//line n2
	
	public void readBook() {
		System.out.println("Read Book");
	}
	
}

class EBook extends Book { 					//line n3
	
	public void readBook() {
		System.out.println("Read E-Book");
	}

}

public class Q128MainEBook {

	public static void main(String[] args) {
		
		Book book1 = new EBook();
		
		book1.readBook();

	}
}

/*
	What is the result?
	
	A. Compilation fails at line n2
	B. Read Book
	C. Read E-Book
	D. Compilation fails at line n1
	E. Compilation fails at line n3
	
	
	Answ: ?
	
	At line 28:  'download' methodu hem yukaridaki abstract classta -ki abstract class doesn't have to- 
 	ve EBook classinda da implement edilmedigi icin, line n3 hata verir ve download methodunu @Override etmeni ister.  

	
	
 */
