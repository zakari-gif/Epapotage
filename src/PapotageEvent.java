import java.util.EventObject;

public class PapotageEvent extends EventObject{
	private String sujet;
	private String corps;
	public PapotageEvent (Object o,String sujet,String corps) {
		super(o);
		this.sujet=sujet;
		this.corps=corps;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getCorps() {
		return corps;
	}
	public void setCorps(String corps) {
		this.corps = corps;
	}
	
}
