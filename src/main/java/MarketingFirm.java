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
		runningSweepstakes.PickWinner();
	}

}
