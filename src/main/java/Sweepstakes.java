import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

public class Sweepstakes {
	public String name;
	public HashMap<Integer, Contestant> contestants;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sweepstakes(String name) throws IOException, URISyntaxException {
		super();
		this.name = name;
		this.contestants = new HashMap<Integer, Contestant>();
		this.RegisterContestants();
	}

	public void RegisterContestants() throws IOException, URISyntaxException {
		CSVParser parser = new CSVParser();
		List<Contestant> contestants = parser.Parse();
		for (Contestant contestant : contestants) {
			this.contestants.put(contestant.id, contestant);
		}
	}

	public Contestant PickWinner() {
		int randomKey = Helpers.GenerateRandomInteger(contestants.size());
		return contestants.get(randomKey);

	}

}
