import java.util.ArrayList;
import java.util.List;

public class Bavard implements PapotageListener {
	
		private String sujet;
		
		public Bavard (String sujet) {
			this.sujet = sujet;
		}

		public void setName(String sujet) {
			this.sujet = sujet;
		}

	
		@Override
		public String getName() {
			return this.sujet;
		}
		
		@Override
		public void EnvoiMessage(String sujet, String corps) {
			System.out.println(this.sujet + "A recu: " + sujet + " " + corps);
		}
	}

