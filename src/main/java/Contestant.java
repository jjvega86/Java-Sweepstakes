
public class Contestant implements EventListener {
	int id;
	String firstName;
	String lastName;
	String emailAddress;
	int wonCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Contestant() {
		super();
	}

	public Contestant(int id, String firstName, String lastName, String emailAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public void update(String winner) {
		if (winner == this.firstName) {
			this.wonCount++;
			Helpers.print("You won, congratulations!");
		} else {
			Helpers.print(winner + " is the winner!");
		}

	}

}
