package javaTest;
// Lambda ile ilgili soru. 
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q047PersonTest {

	public static void checkAge(List<Q047Person> list,Predicate<Q047Person> predicate ) {
		for (Q047Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.name + " ");
			}
		}	
	}

	public static void main(String[] args) {

		List<Q047Person> iList = Arrays.asList(new Q047Person ("Hank", 45),
										   new Q047Person ("Charlie", 40),
										   new Q047Person ("Smith", 38));
		// line n1								  
										  
										  
	}
}

// Outp: checkAge(iList, p -> p.getAge() > 40);


