package javaTest;
//SQ:3 & 23 / Q:103
public class Q058Person {

	String name;
	int age = 25;
	
	//public Q058Person() {}
	
	public Q058Person(String name) {
		this();		 	// line n1          /* non-param constr. olmali. 
		setName(name);
	}
	
	public Q058Person(String name, int age) {
		Q058Person(name);	// line n2       /* 'this(name);' olmali */
		setAge(age);
	}
	
	// setter and getter methods go here
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
	
	public String show() {
		return name + " " + age;
	}
	
	
	public static void main(String[] args) {
		
		Q058Person p1 = new Q058Person("Jesse");
		Q058Person p2 = new Q058Person("Walter", 52);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}


/* 
 	What is the result?
	A. Jesse 25 Walter 52
	B. Compilation fails only at line n1
	C. Compilation fails only at line n2
	D. Compilation fails at both line n1 and line n2


	Answ: D. Compilation fails at both line n1 and line n2

*/
