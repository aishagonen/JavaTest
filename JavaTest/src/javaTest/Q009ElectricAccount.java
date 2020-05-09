package javaTest;
//SQ:100

class A09Customer {

	Q009ElectricAccount acct = new Q009ElectricAccount();
	
	public void useElectricty(double kWh) {
		acct.addKWh(kWh);
	}
	
}

public class Q009ElectricAccount {

	private double kWh;
	private double rate = 0.07;
	private double bill;
	
	// line n1
	 

}



/* for line n1 ? 
  
Answ: B.  public void addKWh (double kWh) {
			  	if(kWh>0) {
			  		this.kWh += kWh;
			  		this.bill = this.kWh * this.rate;
			  	}
		  }
  
  
  
  
  
 */