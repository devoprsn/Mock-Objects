
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
		 if(amount<1)
		 {
			 throw new IllegalArgumentException("Amount must be greater than 1");
		 }
	    balance+=amount;
	 }
	  
	 public boolean betOnANumber(int amnt, int max, int min, int selectedNumber)
	 {
		 if(amnt>balance || balance<minBalance)
		 {
			throw new InsufficientBalanceException();
		 }
		 
		if(selectedNumber>max || selectedNumber<min)
		{
			throw new IllegalArgumentException("Invalid number selected.");
		}
		
		rand.setMaxMin(max, min);
	    if(rand.generateRandomNumber()==selectedNumber)
	    {
	    	balance+=(max-min)*amnt;
	    	return true;
	    }
	    else
	    {
	    	balance-=amnt;
	    	return false;
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
		 
		 
//		 if(rand.generateRandomBoolean())
//		 {
//			 balance+=(Math.pow(p, -1)-1)*amnt;
//			 return true;
//		 }
//		 else
//		 {
//			 balance-=amnt;
//			 return false;
//		 }
	 }
}
