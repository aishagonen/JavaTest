package javaTest;
//SQ:92
class Q094Employee {

	private String name;
	private int age;
	private int salary;
	
//	public Q094Employee() {
//	}
	
	public Q094Employee(String name, int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
	}
	
	public Q094Employee(String name, int age, int salary) {
		setSalary(salary);
		this(name,age); 
	
		//Constructor'la ilgili kodlar basa yazilir.Program burada hata verir
	}

	//getter and setter methods for attributes go here. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printDetails() {
		System.out.println(name + " : " + age + " : " + salary);
	}
		
}


public class Q094EmployeeTest {

	public static void main(String[] args) {

		Q094Employee e1 = new Q094Employee();
		Q094Employee e2 = new Q094Employee("Jack", 50);
		Q094Employee e3 = new Q094Employee("Cloe", 40, 5000);
		
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();

	}

}

/*
	Which is the result?
	A. Compilation fails in the Employee class.
	B. null : 0: 0Jack : 50 : 0Chloe : 40 : 5000
	C. null : 0 : 0Jack : 50 : 2000Chloe : 40 : 5000
	D. Compilation fails in the Test class.
	E. Both the Employee class and the Test class fail to compile. 

	Answ: E
	
	
	Kodu fix ettikten sonra output: null : 0 : 0
									Jack : 50 : 2000
									Cloe : 40 : 5000

*/

