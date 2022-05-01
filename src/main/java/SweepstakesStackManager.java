import java.util.Stack;

public class SweepstakesStackManager implements SweepstakesManager {
	Stack<Sweepstakes> stack;

	public SweepstakesStackManager() {
		super();
		this.stack = new Stack<Sweepstakes>();
	}

	public void insertSweepstakes(Sweepstakes sweepstakes) {
		stack.push(sweepstakes);

	}

	public Sweepstakes getSweepstakes() {
		return stack.pop();
	}

}
