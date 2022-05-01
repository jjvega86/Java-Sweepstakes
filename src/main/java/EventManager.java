import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
	HashMap<String, List<EventListener>> listeners = new HashMap<String, List<EventListener>>();

	public EventManager(String... operations) {
		for (String operation : operations) {
			this.listeners.put(operation, new ArrayList<EventListener>());
		}
	}

	public void Subscribe(String eventType, EventListener listener) {
		List<EventListener> users = listeners.get(eventType);
		users.add(listener);
	}

	public void Unsubscribe(String eventType, EventListener listener) {
		List<EventListener> users = listeners.get(eventType);
		users.remove(listener);
	}

	public void Notify(String eventType, String winner) {
		List<EventListener> users = listeners.get(eventType);
		for (EventListener listener : users) {
			listener.Update(winner);
		}
	}

}
