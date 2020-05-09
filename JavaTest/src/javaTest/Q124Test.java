package javaTest;

class Student {
	
	String name;
	int age; 
	
}

public class Q124Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1 = s3;
		s3 = s2;
		s2 = null;

	}
}

/*
	Which statement is true? 
	
	A. After line 20, three objects are eligible for garbage collection. 
	B. After line 20, two objects are eligible for garbage collection. 
	C. After line 20, one objects are eligible for garbage collection. 
	D. After line 20, none of the objects are eligible for garbage collection. 

	Answ: 


*/