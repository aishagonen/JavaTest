package javaTest;
//SQ:97

class AAnimal {
	
	String type = "Canine";
	int maxSpeed = 60;
	
	AAnimal() {}
	
	AAnimal (String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
}

public class Q092WildAnimal extends AAnimal{

	String bounds;
	
	Q092WildAnimal (String bounds) {
		// line n1
//		super();
//		this.bounds = bounds;
		
	}
	
	Q092WildAnimal(String type, int maxSpeed, String bounds) {
		// line n2
//		super(type, maxSpeed);
//		this.bounds = bounds;
	
	}
	
	public static void main(String[] args) {
		
		Q092WildAnimal wolf = new Q092WildAnimal("Long");
		Q092WildAnimal tiger = new Q092WildAnimal("Feline", 80, "Short");
		
		System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
		System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);

	}

}

/* 
	Which two modifications enable the code to print the following output? 
		Canine 60 Long
		Feline 80 Short
	
	A. Replace line n1 with: super(); this.bounds = bounds;
	B. Replace line n1 with: this.bounds = bounds; super ();
	C. Replace line n2 with: super(type, maxSpeed); this (bounds);
	D. Replace line n1 with: this(“Canine”, 60); this.bounds = bounds;
	E. Replace line n2 with: super(type, maxSpeed); this.bounds = bounds;

	Answ: A, E


*/