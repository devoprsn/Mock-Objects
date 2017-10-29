import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

	MockRandom rand=new MockRandom();
	Gambling b=new Gambling(50, rand);
	
	@Test
	public void CurrectBetAddsMoney()
	{
		b.addMoney(100);
		b.betOnANumber(50, 1, 20, 7);
		assertEquals(100, Gambling.getCurrentBalance()); //this line is giving me errors
	}
	
	@Test
	public void IncorrectBetDeductsMoney()
	{
		b.addMoney(100);
		b.betOnANumber(50, 1, 20, 10);
		assertEquals(50, Gambling.getCurrentBalance()); //this line has the same problem
	}
}
