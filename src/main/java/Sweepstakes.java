import java.util.HashMap;

public class Sweepstakes {
	public String name;
	public HashMap<Integer, Contestant> contestants;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sweepstakes(String name) {
		super();
		this.name = name;
	}

	public void RegisterContestants() {
		// TODO: Use the CSVParser Parse() method to parse CSV asset and generate the
		// HashMap of Contestant objects
	}

	public Contestant PickWinner() {
		Contestant winner = null;
		// TODO: write logic for picking a random winner from the HashMap
		return winner;

	}

}
