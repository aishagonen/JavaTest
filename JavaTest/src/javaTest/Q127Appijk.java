package javaTest;
//SQ: 87
public class Q127Appijk {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k = j += i / 5; // j= 20+2 // int k=(j+=i) / 5 --> k=6
		// 9. line'da j'yi tekrar assign ediyoruz: j=j+i/5 --> j=20+2 --> j = 22
		
		System.out.print(i + ":" + j + ":" + k);

	}
}

/*
	What is the result?
	A. 10:30:6
	B. 10:22:22
	C. 10:22:20
	D. 10:22:6
		
	Answ: 10:22:22
	

*/