import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Stage: Development-02
 * @author: Umut Geyik, 120200145
 * @author: Ghassan Barmada, 120202001
 *
 */

public class secondWindow extends JFrame implements ActionListener {
	// User information, dates of receiving and returning, and book name go here
	private String user_id, receiveDate, returnDate, bookName;

	// Labels for the elements
	JLabel lblUserID = new JLabel("User ID", SwingConstants.CENTER),
			lblReceiveDate = new JLabel("Receive Date", SwingConstants.CENTER),
			lblReturnDate  = new JLabel("Return Date", SwingConstants.CENTER),
			lblBookName  = new JLabel("Book Name", SwingConstants.CENTER);

	// TextFields to get inputs from user
	JTextField txtUserID = new JTextField(),
			txtReceiveDate = new JTextField(),
			txtReturnDate = new JTextField(),
			txtBookName = new JTextField();

	// Buttons to do actions, either borrow
	JButton btnBorrow = new JButton("Borrow"), btnReset = new JButton("Reset");

	// The below function had static type of it, changed to non-static
	public void ShowWindow() {

		JFrame frame = new JFrame("WINDOW-2");
		frame.setLayout(new GridLayout(5, 2));
		frame.setBounds(300,100,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add GUI elements to the frame
		frame.add(lblUserID);
		frame.add(txtUserID);
		frame.add(lblReceiveDate);
		frame.add(txtReceiveDate);
		frame.add(lblReturnDate);
		frame.add(txtReturnDate);
		frame.add(lblBookName);
		frame.add(txtBookName);
		frame.add(btnBorrow);
		frame.add(btnReset);

		// Add action listeners on buttons
		btnBorrow.addActionListener(this);
		btnReset.addActionListener(this);

		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// Created an object of secondWindow and run the ShowWindow function
		secondWindow sc = new secondWindow();
		sc.ShowWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrow){
			user_id = txtUserID.getText();
			receiveDate = txtReceiveDate.getText();
			returnDate = txtReturnDate.getText();
			bookName = txtBookName.getName();
			JOptionPane.showMessageDialog(this,"Book has borrowed!");
		}

		if (e.getSource() == btnReset){
			txtUserID.setText("");
			txtReceiveDate.setText("");
			txtReturnDate.setText("");
			txtBookName.setText("");
		}
	}
}
