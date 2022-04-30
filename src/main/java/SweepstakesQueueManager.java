import java.util.LinkedList;
import java.util.Queue;

public class SweepstakesQueueManager implements SweepstakesManager {

	Queue<Sweepstakes> queue;

	public SweepstakesQueueManager() {
		this.queue = new LinkedList<Sweepstakes>();
	}

	public void InsertSweepstakes(Sweepstakes sweepstakes) {
		queue.add(sweepstakes);

	}

	public Sweepstakes GetSweepstakes() {
		return queue.remove();
	}

}
