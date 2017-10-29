
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
	  
	 public int getCurrentBalance()
	 {
	    return balance;
	 }
	  
	 public void addMoney(int amount)
	 {
	    balance+=amount;
	 }
	  
	 public boolean betOnANumber(int amnt, int min, int max, int selectedNumber)
	 {
	    throw new IllegalArgumentException();
	 }
	  
	 public boolean betOnProbability(int amnt, double p)
	 {
		 throw new IllegalArgumentException();
	 }
}
