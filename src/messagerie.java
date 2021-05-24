import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class messagerie extends JFrame implements PapotageListener,ActionListener{
	private JPanel pan = new JPanel();
	
	private JButton bouton = new JButton("Envoyez le message aux utilisateurs connectes");
	
	private JButton bouton1 = new JButton("Deconnexion");
	
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("Bienvenue sur la fenetre de messagerie");
	private String text;
	private JTextField textField = new JTextField(20);
	private JTextField textField2 = new JTextField(20);
	private JTextArea area=new JTextArea();
	
	
    
	
	private Bavard A;
	private Concierge cons;
	
	public messagerie(Bavard B,Concierge cons){
		
		this.setTitle("vous etes connecte au nom de"+A);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		
		this.A=B;
		this.cons=cons;
		

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		container.add(pan, BorderLayout.CENTER);


		JLabel label1 = new JLabel("le sujet");
		pan.add(label1);
		textField.setToolTipText("Saisissez le sujet du message");
		pan.add(textField);

		JLabel label2 = new JLabel("le corps du message");
		pan.add(label2);
		

		textField2.setToolTipText("Saisissez le message");
		pan.add(textField2);
		


		pan.add(bouton, BorderLayout.CENTER); 
		container.add(bouton1, BorderLayout.SOUTH); 
		
		Font police = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(police);  
		label.setForeground(Color.blue); 
		label.setHorizontalAlignment(JLabel.CENTER);
		container.add(label, BorderLayout.NORTH);
		
		
		
		area.setBounds(30,160, 250,250); 
		container.add(area);
		
		//JLabel label3 = new JLabel("Les messages");
		//container.add(label3,BorderLayout.SOUTH);
		container.add(pan, BorderLayout.CENTER);
		this.setContentPane(container);
		this.setVisible(true);

		bouton1.addActionListener(this);
		bouton.addActionListener(this);
		
		
	}


	
	public void actionPerformed(ActionEvent e) {
		String component=e.getActionCommand();
		if (component=="Envoyez le message aux utilisateurs connectes") {
			String sujet = textField.getText();
			String corps = textField2.getText();
			
			cons.EnvoiMessageAtoutleslistener(A.generEvent(sujet,corps));
			
			
			label.setText("le message a ete envoye");
			}
		if (component=="Deconnexion") {
			setVisible(false);

		}
		
		
}



	@Override
	public void ecouteMessage(PapotageEvent event) {
		
		area.setText(A.login+" vous a envoye, Sujet: " + event.getSujet()+" Corps: " +event.getCorps());
	}
}

















