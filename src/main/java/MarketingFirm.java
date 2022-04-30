import java.io.IOException;
import java.net.URISyntaxException;

public class MarketingFirm {
	SweepstakesManager manager;

	public MarketingFirm(SweepstakesManager manager) {
		super();
		this.manager = manager;
	}

	public void AddSweepstakes(String name) throws IOException, URISyntaxException {
		Sweepstakes newSweepstakes = new Sweepstakes(name);
		manager.InsertSweepstakes(newSweepstakes);
	}

	public void RunSweepstakes() {
		Sweepstakes runningSweepstakes = manager.GetSweepstakes();
		Contestant winner = runningSweepstakes.PickWinner();
		Helpers.Print("The winner is " + winner.firstName + "!");
		//TODO: Use observer pattern to send a message to all contestants based on winner
	}

}
