
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
	  
	 public void betOnANumber(int amnt, int max, int min, int selectedNumber)
	 {
		 if(amnt>balance || balance<minBalance)
		 {
			throw new InsufficientBalanceException();
		 }
		 
		if(selectedNumber>max || selectedNumber<min)
		{
			throw new IllegalArgumentException("Invalid number selected.");
		}
			
	    if(rand.generateRandomNumber(max, min)==selectedNumber)
	    {
	    	balance+=(max-min)*amnt;
	    }
	    else
	    {
	    	balance-=amnt;
	    }
	 }
	  
	 public void betOnProbability(int amnt, double p)
	 {
		 if(amnt>balance || balance<minBalance)
		 {
			throw new InsufficientBalanceException();
		 }
		 
		 if(p<0 || p>=1)
		 {
			 throw new InvalidProbabilityException();
		 }
		 
		 if(rand.generateRandomBoolean())
		 {
			 balance+=(Math.pow(p, -1)-1)*amnt;
		 }
		 else
		 {
			 balance-=amnt;
		 }
	 }
}
