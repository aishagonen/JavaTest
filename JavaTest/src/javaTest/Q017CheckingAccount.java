package javaTest;
//SQ: 8
public class Q017CheckingAccount {

	public int amount;
	
	public Q017CheckingAccount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void changeAmount(int x) {
		amount += x;
	}
	
	public static void main(String[] args) {
		
		Q017CheckingAccount acct = new Q017CheckingAccount((int) (Math.random()*1000));
	
		// line n1 		 
		
		System.out.println(acct.getAmount());
			
	}

}


/* 
  Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
 	
 	A. this.amount = 0;						:'this.' yi main methodda kullanmiyoruz. 
	B. amount = 0;							: amount variable'i static olmadigi icin direct ulasilmaz.
	C. acct (0) ;							: The method acct(int) is undefined. Boyle bir method yok.
	D. acct.amount = 0;          			:0 --> get amount 0'a return edecek. 
	E. acct.getAmount() = 0;				: The left-hand side of an assignment must be a variable
	F. acct.changeAmount(0);				:845 --> x yerine 0 versen de amount random sayi gelir. 
	G. acct.changeAmount(-acct.amount);		:0 --> sonucta 'amount-amount' oluyor. yani 0 
	H. acct.changeAmount(-acct.getAmount());:0 --> G ile ayni sonuc.
 	I. acct.setAmount(-acct.getAmount());   : - random sayi cikiyor.  
	J. acct.setAmount(0);					:0 
	
	Answ: d, g, h, j. 
 
	* 'Math.random()'methodu, 0-1 arasinda bir sayi uretir. 


*/