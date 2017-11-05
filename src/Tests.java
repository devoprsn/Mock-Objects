import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

	MockRandom rand=new MockRandom();
	Gambling b=new Gambling(50, rand);
	
	@Test
	public void CorrectBetOnNumberReturnsTrue()
	{
		b.addMoney(100);
		assertTrue(b.betOnANumber(50, 20, 1, 1));
	}
	
	@Test
	public void CorrectBetOnNumberAddsMoney()
	{
		b.addMoney(100);
		b.betOnANumber(50, 20, 1, 1);
		assertEquals(1050, b.getCurrentBalance()); 
	}
	
	@Test
	public void IncorrectBetOnNumberReturnsFalse()
	{
		b.addMoney(100);
		assertFalse(b.betOnANumber(50, 20, 1, 7));
	}
	
	@Test
	public void IncorrectBetOnNumberDeductsMoney()
	{
		b.addMoney(100);
		b.betOnANumber(50, 20, 1, 10);
		assertEquals(50, b.getCurrentBalance()); 
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void InputLowerThanMinThrowsException()
	{
		b.addMoney(100);
		b.betOnANumber(50, 20, 1, -5);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void InputHigherThanMaxThrowsException()
	{
		b.addMoney(100);
		b.betOnANumber(50, 20, 1, 30);
	}
	
	@Test (expected=InsufficientBalanceException.class)
	public void BetOnANumberAmountGreaterThanBalanceThrowsException()
	{
		b.betOnANumber(50, 20, 1, 6);
	}
	
	@Test
	public void ProbabilityGeneratesTrueReturnsTrue()
	{
		b.addMoney(100);
		assertTrue(b.betOnProbability(50, .5));
	}
	
	@Test 
	public void ProbabilityGeneratesTrueAddsMoney()
	{
		b.addMoney(100);
		b.betOnProbability(50, .5);
		assertEquals(150, b.getCurrentBalance());
	}

	
//	@Test
//	public void ProbabilityGeneratesFalseReturnsFalse()
//	{
//		assertFalse(b.betOnProbability(50, .5));
//	}
//	
//	@Test
//	public void ProbabilityReturnsFalseDeductsMoney()
//	{
//		b.addMoney(100);
//		b.betOnProbability(50, .5);
//		assertEquals(50, b.getCurrentBalance()); 
//	}
	
	@Test (expected=InvalidProbabilityException.class)
	public void BetOnProbability()
	{
		b.addMoney(100);
		b.betOnProbability(50, -.05);
	}
	
	@Test (expected=InsufficientBalanceException.class)
	public void BetOnProbabilityAmountGreaterThanBalanceThrowsException()
	{
		b.betOnProbability(50, .05);
	}
}
