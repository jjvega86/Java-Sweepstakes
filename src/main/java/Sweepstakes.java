import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

/*
 * EventManager (has listeners, a hash map of event types and EventListeners)
 * Publisher (has List of EventManager events and calls update when its state changes)
 * EventListener (interface - describes update method that subscribers implement)
 * Subscriber (implements EventListenter with update method)
 * */

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

	public void PickWinner() {
		int randomKey = Helpers.GenerateRandomInteger(contestants.size());
		Contestant winner = contestants.get(randomKey);
		Helpers.Print("The winner is " + winner.firstName + "!");
		//TODO: Use observer pattern to send a message to all contestants based on winner

	}

}
