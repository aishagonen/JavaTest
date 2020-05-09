package javaTest;
//SQ:23 & 3 / Q:58
public class Q103Person {

	String name;
	int age = 25;
	
	//public Q058Person() {}
	
	public Q103Person(String name) {
		this();		 	// line n1			   /* non-param constr. olmali.
		setName(name);
	}
	
	public Q103Person(String name, int age) {
		Q103Person(name);	// line n2			/* 'this(name);' olmali */
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
		return name + " " + age + " ";
	}
	
	
	public static void main(String[] args) {
		
		Q103Person p1 = new Q103Person("Jesse");
		Q103Person p2 = new Q103Person("Walter", 52);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}


/* 
 	What is the result?
	
	A. Compilation fails at both line n1 and line n2.
	B. Compilation fails only at line n2.
	C. Compilation fails only at line n1.
	D. Jesse 25Walter 52
	
	
	Answ: A. Compilation fails at both line n1 and line n2.

*/
