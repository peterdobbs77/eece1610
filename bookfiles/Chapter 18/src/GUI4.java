/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg. 420-22
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class GUI4 extends JFrame {
	
	private Container contentPane;
	private JPanel panel1, panel2;
	private JButton button1, button2;
	private JLabel label1;
	private int count;
	private ActionListener listener;
	//-----------------------------------
	public GUI4(){
		setTitle("GUI4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.setPreferredSize(new Dimension(300,100));
		listener = new Listener();
		button1 = new JButton("Click to count");
		button1.addActionListener(listener);
		panel1.add(button1);
		button2 = new JButton("Click to count down");
		button2.addActionListener(listener);
		panel1.add(button2);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.setPreferredSize(new Dimension(100,100));
		count = 0;
		label1 = new JLabel("Count = "+count);
		panel2.add(label1);
		
		// get content pane of frame
		contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel1);
		contentPane.add(panel2);
		
		pack();
		setVisible(true);	
	}
	//-----------------------------------------
	public static void main(String[] args){
		
		@SuppressWarnings("unused")
		GUI4 window = new GUI4();
	}
	//------------------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			// e.getSource() returns ref to triggering component
			if (e.getSource() == button1)
				label1.setText("Count = "+ ++count);
			else if (e.getSource() == button2)
				label1.setText("Count = "+ --count);
		}
	}
}
