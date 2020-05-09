package javaTest;
//SQ: 82
public class Q025Employee {

	String name;
	boolean contract;
	double salary;
	Q025Employee() {
		//line1
	}
	
	public String toString() {
		return name + ":" + contract + ":" + salary;	
	}
	
	public static void main(String[] args) {

		Q025Employee e = new Q025Employee();
		// line2
		System.out.println(e);
			
	}

}
/* 
  Which two modifications, when made independently, enable the code to print joe:true:100.0 ?
 
 * bu haliyle calsitirdigimizda outp: null:false:0.0 
 *  
   bizden   joe:true:100.0   yazdirmak icin ne yapmak gerekiyor, onu soruyor. 
   
   answ: A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;
		 
		 C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);
		
	bu ikisini ayri ayri yaptigimizda sonucu ayni verir. 
	
* 'toString()' method : Object class'inda zaten oldugu icin bu methodu yazdigimizda override goruruz ve
  her object olusturdugumuzda bu method calisir. Aslinda override etmeyince zaten memory'deki yerini gosterir.  	
		
		
		
		
		
		
*/