import java.util.ArrayList;
import java.util.List;

public class Bavard implements PapotageListener {
		public String login;
		public String password;
		public messagerie mess;
		public String ok;
		
		
		Bavard(String login,String password){
			this.login=login;
			this.password=password;
			this.ok=String.valueOf(mess);
			
		}
		public PapotageEvent generEvent(String sujet,String corps) {
			PapotageEvent P=new PapotageEvent(this,sujet,corps);
			this.login=login;
			return P;
			
		}
		
		@Override
		public void ecouteMessage(PapotageEvent even) {
			
			this.mess.ecouteMessage(even);
		}
		
		
		@Override
		public String toString() {
			return "["+ login + "|" + password + "]";
		}
		
		
		public messagerie getMess() {
			return mess;
		}
		
		
		public void setMess(messagerie mess) {
			this.mess=mess;
		}
		
		
}
		
	//String.valueOf(this.mess)+"\n"+String.valueOf(mess)+"\n"	


