/*
 * Taken from An Introduction to Programming Using Java, pg 411
 */
import javax.swing.*;

import java.awt.*;					// needed for Color Class
@SuppressWarnings("serial")
public class GUI1 extends JFrame{

	private Container contentPane;
	private JButton button1;
	private JLabel label1;
	//------------------------------
	public GUI1(){
		
		setTitle("GUI1");				// sets title on frame
		setSize(400, 100);				// sets frame width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// get content pane of frame
		contentPane = getContentPane();
		
		// configure content pane
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.GREEN);
		
		// add button and label to the content pane of the frame
		button1 = new JButton("This is a button");
		contentPane.add(button1);
		label1 = new JLabel("This is a label");
		contentPane.add(label1);
		
		setVisible(true);						// make fram visible
	}
	//------------------------------
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		GUI1 window = new GUI1();				// create window
	}

}
