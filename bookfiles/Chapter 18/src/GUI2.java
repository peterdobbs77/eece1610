/*
 * Taken from An Introduction to Programming Using Java, pg 415
 */
import javax.swing.*;

import java.awt.*;
@SuppressWarnings("serial")
public class GUI2 extends JFrame{

	private Container contentPane;
	private JPanel panel1, panel2;
	private JButton button1;
	private JLabel label1;
	//------------------------
	public GUI2(){
		
		setTitle("GUI2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();				// create panel 1
		panel1.setLayout(new FlowLayout());	// configure panel 1
		panel1.setBackground(Color.GREEN);
		panel1.setPreferredSize(new Dimension(100, 100));
		button1 = new JButton("This is a button");
		panel1.add(button1);				// add button to panel 1
		
		panel2 = new JPanel();				// create panel 2
		panel1.setLayout(new FlowLayout());	// configure panel 2
		panel2.setBackground(Color.YELLOW);
		panel2.setPreferredSize(new Dimension(300,100));
		label1 = new JLabel("This is a label");
		panel2.add(label1);					// add label to panel 2
		
		// get content pane of frame
		contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel1);		// add panels to content pane
		contentPane.add(panel2);
		
		pack();		// adjust frame size to accommodate panels
		setVisible(true);
	}
	//--------------------------
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		GUI2 window = new GUI2();
	}
}
