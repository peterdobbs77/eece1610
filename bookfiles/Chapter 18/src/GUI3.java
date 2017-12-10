/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 418-419
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
class GUI3 extends JFrame {

	private Container contentPane;
	private JPanel panel1, panel2;
	private JButton button1;
	private JLabel label1;
	private int count;
	//-----------------------------
	public GUI3(){
		
		setTitle("GUI3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.GREEN);
		panel1.setPreferredSize(new Dimension (200,100));
		button1 = new JButton("Click to count");
		button1.addActionListener(new Listener());
		panel1.add(button1);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(Color.YELLOW);
		panel2.setPreferredSize(new Dimension(200,100));
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
	//-----------------------------
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		GUI3 window = new GUI3();
	}
	//--------------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			label1.setText("Count = "+ ++count);
		}
	}

}
