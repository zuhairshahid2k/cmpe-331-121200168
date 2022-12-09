import javax.swing.JFrame;

public class secondWindow {

	
	public static void ShowWindow() {
		
		JFrame frame = new JFrame("WINDOW-2");
		frame.setBounds(100,100,467,315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
	
	
}
	public static void main(String[] args) {
		ShowWindow();
	}
	
	
}
