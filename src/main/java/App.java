import java.net.URISyntaxException;


public class App {
	public static void main(String[] args) throws Exception, URISyntaxException {
//		String userChoice = Helpers.TakeInput("Welcome! Choose your type of Sweepstakes manager (stack or queue)");
//		SweepstakesManager manager = SweepstakesManagerFactor.GetSweepstakesManager(userChoice);
//		MarketingFirm firm = new MarketingFirm(manager);
		// TODO: Create a new sweepstakes and run it as a test
		CSVParser parser = new CSVParser();
		parser.Parse();


	}

}
