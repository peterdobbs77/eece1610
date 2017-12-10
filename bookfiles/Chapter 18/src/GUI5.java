/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg. 423-25
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class GUI5 extends JFrame {
	
	private Container contentPane;
	private JPanel panel1, panel2;
	private JButton button1;
	private JTextField text1;
	private JRadioButton radio1, radio2;
	private ButtonGroup group;
	private ActionListener listener;
	private int count;
	//-----------------------------
	public GUI5(){
		
		setTitle("GUI5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.setPreferredSize(new Dimension(300,100));
		listener = new Listener();
		button1 = new JButton("Click to count");
		button1.addActionListener(listener);
		panel1.add(button1);
		
		radio1 = new JRadioButton("Up", true);
		radio2 = new JRadioButton("Down");
		group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		panel1.add(radio1);
		panel1.add(radio2);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.setPreferredSize(new Dimension(200,100));
		text1 = new JTextField(10);
		count = 0;
		text1.setText(""+count);
		text1.addActionListener(listener);
		panel2.add(text1);
		
		// get content pane of frame
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel1);
		contentPane.add(panel2);
		
		pack();
		setVisible(true);
	}
	//----------------------------------
	public static void main(String[] args){
		
		@SuppressWarnings("unused")
		GUI5 window = new GUI5();
	}
	//----------------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource() == text1)
				count = Integer.parseInt(text1.getText());
			else if (e.getSource() == button1)
				if (radio1.isSelected())
					text1.setText(""+ ++count);
				else if (radio2.isSelected())
					text1.setText(""+ --count);
		}
	}
}
