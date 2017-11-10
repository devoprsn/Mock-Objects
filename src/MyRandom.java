import java.util.Random;

public class MyRandom implements IRandomValueGenerator{
	
	private Random rand;
	private int max;
	private int min;
	
	public MyRandom()
	{
		rand=new Random();
		max=0;
		min=0;
	}
	
	public void setMaxMin(int max, int min)
	{
		this.max=max;
		this.min=min;		
	}
	
	public int generateRandomNumber()
	{
		return rand.nextInt((max-min)+1);
	}
}
