
public class Gambling {
	 int balance;
	 int minBalance;
	 IRandomValueGenerator rand;
  
	 public Gambling(int minBalance, IRandomValueGenerator rand)
	 {
	    if(minBalance<0)
	    	throw new IllegalArgumentException();
	    
	    this.minBalance=minBalance;
	    balance=0;
	    this.rand=rand;
	 }
	  
	 public double getCurrentBalance()
	 {
	    return balance;
	 }
	  
	 public void addMoney(int amount)
	 {
	    
	 }
	  
	 public void betOnANumber(int amnt, int min, int max, int selectedNumber)
	 {
	    
	 }
	  
	 public void betOnProbability(int amnt, double p)
	 {
	    
	 }
}
