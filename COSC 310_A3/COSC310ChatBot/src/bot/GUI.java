package bot;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Dino Chatbot");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600,600);
	    
	    JPanel mainp = new JPanel();
	    frame.setLayout(new GridLayout(5,1));
	    
	    JPanel notmain = new JPanel();
	
	    JLabel begin = new JLabel("Welcome to the Dino-Bot, Please Enter the name you would like to be called by.");
	    notmain.add(begin);
	    mainp.add(notmain);
	    
	    notmain = new JPanel();
	    JLabel yourName = new JLabel("your name");
	    notmain.add(yourName);
	    JTextField name1 = new JTextField(20);
	    notmain.add(name1);
	    mainp.add(notmain);
	    
	    notmain = new JPanel();
	    JLabel greet = new JLabel("Greetings, my name is Tee-Tee the T-Rex!!");
	    notmain.add(greet);
	    mainp.add(notmain);
	    
	    notmain = new JPanel();
	    JLabel question = new JLabel("what do you want to ask");
	    notmain.add(question);
	    JTextField answer = new JTextField(30);
	    notmain.add(answer);
	    mainp.add(notmain);
	    
	    frame.add(mainp);
	    frame.setVisible(true);

	}

}
