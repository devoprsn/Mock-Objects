import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

	MockRandom rand=new MockRandom();
	Gambling b=new Gambling(50, rand);
	
	@Test
	public void CurrectBetOnNumberAddsMoney()
	{
		b.addMoney(100);
		b.betOnANumber(50, 1, 20, 7);
		assertEquals(950, b.getCurrentBalance()); 
	}
	
	@Test
	public void IncorrectBetOnNumberDeductsMoney()
	{
		b.addMoney(100);
		b.betOnANumber(50, 1, 20, 10);
		assertEquals(50, b.getCurrentBalance()); 
	}
	
	@Test
	public void BetOnProbability()
	{
		b.addMoney(100);
		b.betOnProbability(50, .05);
		
	}
}
