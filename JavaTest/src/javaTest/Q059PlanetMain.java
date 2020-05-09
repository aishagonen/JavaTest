package javaTest;
//SQ: 89

class Planet {

	public String name;
	public int moons;
	
	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}	
}

public class Q059PlanetMain {

	public static void main(String[] args) {

		Planet [] planets = {
				  new Planet("Mercury", 0),
				  new Planet("Venus", 0),
				  new Planet("A06Earth", 1),
				  new Planet("Mars", 2)
		};
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
	}
}

/* 
 	
 	Answ:  	[Lexams.Planet;@7852e922
			exams.Planet@4e25154f
			1
			
			
 */


