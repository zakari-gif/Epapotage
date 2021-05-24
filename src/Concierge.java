import java.util.*;


public class Concierge {

	
	
	public List<Bavard> listeners=new ArrayList<Bavard>();
	public void addBavard(Bavard listener) {
		listeners.add(listener);
	}
	
	public void removeBavard(Bavard listener) {
		listeners.remove(listener);
	}
	

	public List<Bavard> getListeners() {
		return this.listeners;
	}

	

	
	public void EnvoiMessageAtoutleslistener(PapotageEvent event) {
		for (Bavard listener : listeners) {
			listener.ecouteMessage(event);
		}
		
	}

	@Override
	public String toString() {
		return "Concierge "+ listeners;
	}

	
}
