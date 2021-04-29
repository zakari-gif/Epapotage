import java.util.ArrayList;

public class Concierge {
//variables
	private String sujet;
	
	
	private ArrayList<PapotageListener> listeners;
	
	//Constructors
	public Concierge (String sujet) {
		this.setListeners(new ArrayList<PapotageListener>());
		this.sujet = sujet;
	}
	
	//Add, remove, getters and setters...
	public void addListener(PapotageListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(PapotageListener listener) {
		listeners.remove(listener);
	}
	
	public void listenersConnected() {
		for (PapotageListener l : listeners) {
			System.out.println(getName() + " said that the listener " + l.getName() + " est connecte");
		}
	}

	public String getName() {
		return sujet;
	}

	public void setName(String name) {
		this.sujet =sujet;
	}

	public ArrayList<PapotageListener> getListeners() {
		return listeners;
	}

	public void setListeners(ArrayList<PapotageListener> listeners) {
		this.listeners = listeners;
	}

	//Send a message to all the listeners
	public void EnvoiMessageAtoutleslistener(String sujet, String corps) {
		for (PapotageListener listener : listeners) {
			listener.EnvoiMessage(sujet, corps);
		}
		
	}
}
