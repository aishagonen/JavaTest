package javaTest;

interface Readable {
	
	public void readBook();
	public void setBookMark();
}

 class Book implements Readable {  	// line n1
	
	public void readBook() { }
	//public abstract void setBookMark();	// line n2  // abstract class oldugu icin setBookMark();'i implement etmesine gerek yok.  

//	@Override
//	public void setBookMark() {
//	}
}

 class Q117EBook extends Book { 			// line n3
	
	public void readBook() { }
				// line n4
	
 	
	public static void main(String[] args) {
	
		Book book1 = new Q117EBook();
		book1.readBook();
	}
 }

/* 
  And given the code fragment:
  	Book book1 = new EBook();
  	Book1.readBook();
 
   Which option enables the code to compile? 
   Answ: At line n4 insert:
   		 public void setBookMark() {}
    
 * EBook class'i, concrete yani normal class oldugu icin onun Overriden methodlari implement etmesi gerekiyor.
   line n3 hata verir. o nedenle line n4'e methodu override etmemiz gerekir. 
 
 */
