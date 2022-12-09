
/*
 * Stage: Development-01
 * @author:
 * @author:
 *
 */

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginWindow extends JFrame implements ActionListener {

	// main method for testing the application
	public static void main(String[] args) {
		new LoginWindow();
	}


	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES !
	 * ! YOU CAN ADD MORE ELEMENTS IF IT IS NECESSARY !
	 */
	private JButton loginbtn, signupbtn;
	private JLabel userlbl, passwordlbl;
	private JTextField txt01, txt02;


	// Constructor
	public LoginWindow () {

		this.initializeGUI();
		this.setWindowProperties(3, 2);
		this.addGUIElementsToFrame();

	}


	/**
	 * Initialize GUI elements. If it is necessary, you can add more
	 * 	elements.
	 */
	public void initializeGUI() {
		userlbl = new JLabel("USERNAME", SwingConstants.CENTER);
		passwordlbl = new JLabel("PASSWORD", SwingConstants.CENTER);

		txt01 = new JTextField("enter your username");
		txt02 = new JTextField("enter your password");

		txt01.setHorizontalAlignment(SwingConstants.CENTER);
		txt02.setHorizontalAlignment(SwingConstants.CENTER);

		loginbtn = new JButton("LOG-IN");
		signupbtn = new JButton("SIGN-UP");

		loginbtn.addActionListener(this);
		signupbtn.addActionListener(this);
	}


	/**
	 * Set the necessary properties for the window
	 *
	 * @param numRow number of row for GUI elements
	 * @param numCol number of column for GUI elements
	 */
	public void setWindowProperties(int numRow, int numCol) {
		this.setLayout(new GridLayout(numRow, numCol));

		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	/**
	 * Add GUI elements to the layout of the frame. If it is necessary,
	 * 	you can add more elements.
	 */
	public void addGUIElementsToFrame() {
		this.add(userlbl);
		this.add(txt01);

		this.add(passwordlbl);
		this.add(txt02);

		this.add(loginbtn);
		this.add(signupbtn);
	}


	/**
	 * Add margin to the frame.
	 */
	@Override
    public Insets getInsets() {
        return new Insets(100, 50, 100, 50);
    }


	/**
	 * Action listener for the buttons. If e.getSource() is from
	 * 	one of the buttons, apply the related operation.
	 *
	 * @param e action event for detecting which button is clicked
	 */
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== loginbtn) {
			if(txt01.getText().equals("bilgi")&& txt02.getText().equals("univeristy")) {
		setVisible(false);
		secondWindow w2= new secondWindow();
		w2.ShowWindow();
		}
		}
	
	else {
		new LoginWindow();
	}
	
	}
}

