import java.io.IOException;
import java.net.URISyntaxException;

public class Simulation {

	public static void RunSimulation() throws IOException, URISyntaxException {
		String userChoice = Helpers.TakeInput("Welcome! Choose your type of Sweepstakes manager (stack or queue)");
		SweepstakesManager manager = SweepstakesManagerFactor.GetSweepstakesManager(userChoice);
		MarketingFirm firm = new MarketingFirm(manager);
		userChoice = Helpers.TakeInput("What would you like to name your sweepstakes?");
		firm.AddSweepstakes(userChoice);
		firm.RunSweepstakes();
	}

}
