import java.io.IOException;
import java.net.URISyntaxException;

public class Simulation {

	public static void runSimulation() throws IOException, URISyntaxException {
		String userChoice = Helpers.takeInput("Welcome! Choose your type of Sweepstakes manager (stack or queue)");
		SweepstakesManager manager = SweepstakesManagerFactory.GetSweepstakesManager(userChoice);
		MarketingFirm firm = new MarketingFirm(manager);
		userChoice = Helpers.takeInput("What would you like to name your sweepstakes?");
		firm.addSweepstakes(userChoice);
		firm.runSweepstakes();
	}

}
