package twitter;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class home extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JLabel labelsearch;
	//JLabel labelPass;
	JTextField textsearch;
	JPasswordField passField;
	JButton hometab;
	JButton notificationtab;
	JButton messages;
	JButton searchB;
	JPanel panelThree;
	JDialog dialog;
	
	public home() {
		
		panelThree = new JPanel();
		panelThree.setLayout(null);
		//makes buttons
		hometab = new JButton("HOME");
		
		notificationtab = new JButton("NOTIFICATIONS");
		
		messages = new JButton("MESSAGES");
		
		//adds search panel
		//search.setLayout(null);
		textsearch = new JTextField(25);
		searchB=new JButton("Search");
		
		
		//textsearch.setBounds(450, 50, 150, 20);
		
		
		
		
		
		//sets location of buttons
		
		hometab.setBounds(0,50,90,20);
		notificationtab.setBounds(90,50,120,20);
		messages.setBounds(210,50,100,20);
		searchB.setBounds(787,50,80,25);
		textsearch.setBounds(860, 50, 160, 25);
		
		//action listener, for userinterface
		hometab.addActionListener(this);
		notificationtab.addActionListener(this);
		messages.addActionListener(this);
		searchB.addActionListener(this);
		
		//adds it to the gui
		
		panelThree.add(hometab);
		panelThree.add(notificationtab);
		panelThree.add(messages);
		panelThree.add(searchB);
		panelThree.add(textsearch);
		
		String text = "stuff needs to be printed out here";
		String text1=" what's on your mind........";
		JTextArea textArea2 = new JTextArea(text, 5, 10);
		//textArea2.setPreferredSize(new Dimension(100, 100));
	    JScrollPane scrollPane = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
	    JTextArea textArea3 = new JTextArea(text1, 5, 10);
	    JButton text3 = new JButton("Tweet");
		text3.setBounds(704,176,90,20);
		textArea3.setBounds(280,75,513,100);
		
		    
	    textArea2.setLineWrap(true);
		   
		scrollPane.setBounds(280,200,510,510);
		
	
		
		//RectDraw triangle4=new RectDraw();
	//	triangle4.setBounds(10,0,5000,5000);
	//	triangle4.setBackground(Color.CYAN);
		panelThree.setBackground(Color.CYAN);
		// panelThree.add(textArea2);
		panelThree.add(scrollPane);
		panelThree.add(text3);
		panelThree.add(textArea3);
		this.shows1(panelThree);
       
	  
  }		
	
	
		public void shows1(JPanel b){
			dialog = new JDialog();
		       
			dialog.setResizable(true);
				
			
			//dialog.getContentPane().add(search);
			//dialog.getContentPane().setLayout(new FlowLayout());
			dialog.getContentPane().add(b);
			dialog.setTitle("Welcome to twitter");
				
				
		 
			dialog.setSize(1080, 750);
			dialog.setLocationRelativeTo(null); // place in center of screen
			dialog.setBackground(Color.CYAN);
				
				
			dialog.setModal(true);
				
			dialog.setVisible(true);
			
		}

		
		
	      public void actionPerformed(ActionEvent e) {
	          if (e.getSource() == hometab) {
	              dialog.dispose();
	          }else if (e.getSource() == notificationtab) {
	              System.exit(0);
	          }
	          else if (e.getSource() == messages) {
	              System.exit(0);
	          }
	          else if (e.getSource() == searchB) {
	              System.exit(0);
	          }
	      }
	  
	      public JDialog getDialog(){
	    	  return dialog;
	    	  
	      }
	      public JPanel getPanel(){
	    	  return panelThree;
	    	  
	      }
}