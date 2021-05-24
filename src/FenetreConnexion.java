
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

 



public class FenetreConnexion extends JFrame {
	  
	 private JPanel pan = new JPanel();
	  
	  
	  private JButton bouton2 = new JButton("cliquez pour vous connecter");
	  
	  private JPanel container = new JPanel();
	  private JLabel label = new JLabel("Veuillez vous connectez");
	  private String text;
	  private JTextField textField = new JTextField(20);
	  private JTextField textField2 = new JTextField(20);
	  private Concierge cons;
	  
	  
	  public FenetreConnexion(Concierge cons){
	    this.setTitle("La fenetre de connexion");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null); 
	    this.cons=cons;
	    
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    
	    container.add(pan, BorderLayout.CENTER);
	    
	    
	    JLabel label1 = new JLabel("Login  ");
	    pan.add(label1);
	    textField.setToolTipText("Saisissez le login");
	    pan.add(textField);
	    
	    JLabel label2 = new JLabel("Password");
	    pan.add(label2);
	    
	    textField2.setToolTipText("Saisissez le password");
	    pan.add(textField2);
	   
	    pan.add(bouton2, BorderLayout.CENTER);  
	    
	    container.add(pan, BorderLayout.CENTER);
	    
	    
	    Font police = new Font("Tahoma", Font.BOLD, 16);
	    label.setFont(police);  
	    label.setForeground(Color.blue); 
	    label.setHorizontalAlignment(JLabel.CENTER);
	    container.add(label, BorderLayout.NORTH);
	    
	    
	    this.setContentPane(container);
	    this.setVisible(true);
	    
	    
	    
	    Concierge cons1=this.cons;
	    bouton2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String login = textField.getText();
				String motpasse =textField2.getText();
				System.out.print(login);
				System.out.print(motpasse);
				for (int i=0;i<cons1.getListeners().size();i++){
				if (cons1.getListeners().get(i).toString().equals("["+login+"|"+motpasse+"]")){
					label.setText("Connexion Reussi ");
					messagerie m=new messagerie(cons1.getListeners().get(i),cons1);
					cons1.getListeners().get(i).setMess(m);
					
				 		}
				
					}
	    		}
	    	
	    });
	  }
}
	    


	
	
		



	







	
	


	
	

