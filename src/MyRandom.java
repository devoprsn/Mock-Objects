import java.util.Random;

public class MyRandom implements IRandomValueGenerator{
	
	Random rand;
	
	public MyRandom()
	{
		rand=new Random();
	}
	 
	public int generateRandomNumber(int max, int min)
	{
		return rand.nextInt((max-min)+1);
	}
	
	public boolean generateRandomBoolean()
	{
		return rand.nextBoolean();
	}
}
