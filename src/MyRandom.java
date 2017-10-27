import java.util.Random;

public class MyRandom implements IRandomValueGenerator{
	
	Random rand;
	
	public MyRandom()
	{
		rand=new Random();
	}
	
	public int generateRandomNumber(int max)
	{
		return rand.nextInt(max);
	}
	 
	public int generateRandomNumber(int min, int max)
	{
		return rand.nextInt((max-min)+1);
	}
}
