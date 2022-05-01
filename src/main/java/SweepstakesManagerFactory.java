
public class SweepstakesManagerFactory {

	public static SweepstakesManager GetSweepstakesManager(String type) {

		if ("stack".equalsIgnoreCase(type))
			return new SweepstakesStackManager();
		else if ("queue".equalsIgnoreCase(type))
			return new SweepstakesQueueManager();
		return null;

	}

}
