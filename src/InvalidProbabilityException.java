
public class InvalidProbabilityException extends RuntimeException{

	public InvalidProbabilityException()
	{
		super("Probability must be between 0 and 1.");
	}
}
