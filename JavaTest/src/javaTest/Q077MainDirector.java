package javaTest;
//SQ: 37

class Employee {
	
	public int salary;
	
}

 class Manager extends Employee {
	
	public int budget; 

}

 class Director extends Manager {
	
	public int stockOptions;

}
	
public class Q077MainDirector {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		
		//line n1
		
		employee.salary = 50_000;
		director.salary = 80_000;
		//employee.budget = 200_000;
		manager.budget = 1_000_000;
		//manager.stockOption = 500;
		director.stockOptions = 1_000;

	}

}

/*
	Which two options fail to compile when placed at line n1 of the main method?
	
	A. employee.salary = 50_000;
	B. director.salary = 80_000;
	C. employee.budget = 200_000;
	D. manager.budget = 1_000_000;
	E. manager.stockOption = 500;
	F. director.stockOptions = 1_000;
  
  	Answ: C,E
  
  
  
  
  
  
 */



