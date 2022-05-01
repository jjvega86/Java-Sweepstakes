import java.io.IOException;
import java.net.URISyntaxException;

public class MarketingFirm {
	SweepstakesManager manager;

	public MarketingFirm(SweepstakesManager manager) {
		super();
		this.manager = manager;
	}

	public void addSweepstakes(String name) throws IOException, URISyntaxException {
		Sweepstakes newSweepstakes = new Sweepstakes(name);
		manager.insertSweepstakes(newSweepstakes);
	}

	public void runSweepstakes() {
		Sweepstakes runningSweepstakes = manager.getSweepstakes();
		runningSweepstakes.pickWinner();
	}

}
