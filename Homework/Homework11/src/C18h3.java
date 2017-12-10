/*
 * Homework 11 Problem 2, chapter 18 homework 3
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 4/14/2015
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class C18h3 extends JFrame {
	
	private Container contentPane;
	private JPanel panel1, panel2, panel3;
	private JButton button1;
	private JLabel label1, label2;
	private JTextField text1;
	private JRadioButton radio1, radio2;
	private JRadioButton radio3, radio4, radio5, radio6, radio7;
	private ButtonGroup group1, group2;
	private ActionListener listener;
	private int count;
	//------------------------------------
	public C18h3(){
		
		setTitle("C18h3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// panel 1
		panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.setPreferredSize(new Dimension(150,120));
		listener = new Listener();
		button1 = new JButton("Click to count");
		button1.addActionListener(listener);
		panel1.add(button1);
		radio1 = new JRadioButton("Up", true);
		radio2 = new JRadioButton("Down");
		group1 = new ButtonGroup();
		group1.add(radio1);
		group1.add(radio2);
		panel1.add(radio1);
		panel1.add(radio2);
		
		// panel 2
		panel2 = new JPanel();
		panel2.setBackground(Color.CYAN);
		panel2.setPreferredSize(new Dimension(75,120));
		label1 = new JLabel("Increment");
		radio3 = new JRadioButton("1", true);
		radio4 = new JRadioButton("2");
		radio5 = new JRadioButton("3");
		radio6 = new JRadioButton("4");
		radio7 = new JRadioButton("5");
		group2 = new ButtonGroup();
		group2.add(radio3);
		group2.add(radio4);
		group2.add(radio5);
		group2.add(radio6);
		group2.add(radio7);
		panel2.add(label1);
		panel2.add(radio3);
		panel2.add(radio4);
		panel2.add(radio5);
		panel2.add(radio6);
		panel2.add(radio7);
		
		// panel 3
		panel3 = new JPanel();
		panel3.setBackground(Color.YELLOW);
		panel3.setPreferredSize(new Dimension(150,120));
		label2 = new JLabel("Count");
		text1 = new JTextField(10);
		count = 0;
		text1.setText(""+count);
		text1.addActionListener(listener);
		panel3.add(label2);
		panel3.add(text1);
		
		// get content pane of frame
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel1);
		contentPane.add(panel2);
		contentPane.add(panel3);
		
		pack();
		setVisible(true);
	}
	//-------------------------------------------
	public static void main(String[] args){
		
		new C18h3();
	}
	//----------------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			// checks for changes in text field
			if (e.getSource() == text1)
				count = Integer.parseInt(text1.getText());
			// checks for button clicks
			else if (e.getSource() == button1)
				// checks which radio buttons are selected
				if (radio1.isSelected()){
					if (radio3.isSelected())
						text1.setText(""+(count+=1));
					else if (radio4.isSelected())
						text1.setText(""+(count+=2));
					else if (radio5.isSelected())
						text1.setText(""+(count+=3));
					else if (radio6.isSelected())
						text1.setText(""+(count+=4));
					else if (radio7.isSelected())
						text1.setText(""+(count+=5));
				}
				// checks which radio buttons are selected
				else if (radio2.isSelected()){
					if (radio3.isSelected())
						text1.setText(""+(count-=1));
					else if (radio4.isSelected())
						text1.setText(""+(count-=2));
					else if (radio5.isSelected())
						text1.setText(""+(count-=3));
					else if (radio6.isSelected())
						text1.setText(""+(count-=4));
					else if (radio7.isSelected())
						text1.setText(""+(count-=5));
				}
		}
	}	
}