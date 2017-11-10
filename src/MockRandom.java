
public class MockRandom implements IRandomValueGenerator{
	
	private int num;
	private int max;
	private int min;
	
	public MockRandom()
	{
		num=0;
	}
	
	public void setMaxMin(int max, int min)
	{
		this.max=max;
		this.min=min;		
	}
	
	public int generateRandomNumber()
	{
		return num;
	}
	
	public void setNum(int num)
	{
		this.num=num;
	}
}
