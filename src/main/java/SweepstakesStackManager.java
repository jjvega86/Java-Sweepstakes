import java.util.Stack;

public class SweepstakesStackManager implements SweepstakesManager {
	Stack<Sweepstakes> stack;

	public SweepstakesStackManager() {
		super();
		this.stack = new Stack<Sweepstakes>();
	}

	public void InsertSweepstakes(Sweepstakes sweepstakes) {
		stack.push(sweepstakes);

	}

	public Sweepstakes GetSweepstakes() {
		return stack.pop();
	}

}
