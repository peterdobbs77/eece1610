/*
 * Homework 11 Problem 3, chapter 18 homework 4
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 4/14/2015
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class C18h4 extends JFrame {

	private Container contentPane;
	private JPanel panel1, panel2;
	private JLabel label1, label2, label3;
	private JTextField text1, text2, text3;
	private JButton button1;
	private Color color;
	private ActionListener listener;
	private int red, green, blue;
	//--------------------------------------
	public C18h4(){
		
		setTitle("C18h4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listener = new Listener();
		
		// panel 1
		panel1 = new JPanel();
		panel1.setOpaque(true);
		panel1.setBackground(Color.GRAY);
		panel1.setPreferredSize(new Dimension(250,75));
		panel1.setLayout(new GridLayout(3,2));
		//
		label1 = new JLabel("Red");
		panel1.add(label1);
		text1 = new JTextField(10);
		red=0;
		text1.addActionListener(listener);
		text1.setText(""+red);
		panel1.add(text1);
		//
		label2 = new JLabel("Green");
		panel1.add(label2);
		text2 = new JTextField(10);
		green=0;
		text2.addActionListener(listener);
		text2.setText(""+green);
		panel1.add(text2);
		//
		label3 = new JLabel("Blue");
		panel1.add(label3);
		text3 = new JTextField(10);
		blue=0;
		text3.addActionListener(listener);
		text3.setText(""+blue);
		panel1.add(text3);
				
		// "Show Color" button
		button1 = new JButton("Show Color");
		button1.addActionListener(listener);
		
		// panel 2
		panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(100,75));
		panel2.setOpaque(true);
		color = new Color(red, green, blue);
		panel2.setBackground(color);
		
		
		// content pane
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel1);
		contentPane.add(button1);
		contentPane.add(panel2);
		
		pack();
		setVisible(true);
	}
	//------------------------------------
	public static void main(String[] args){
		
		new C18h4();
	}
	//---------------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource() == text1){
				red = Integer.parseInt(text1.getText());
				if (red<0||red>255) red=0;
				else text1.setText(""+red);
			}
			else if (e.getSource() == text2){
				green = Integer.parseInt(text2.getText());
				if (green<0||green>255) green=0;
				else text2.setText(""+green);
			}
			else if (e.getSource() == text3){
				blue = Integer.parseInt(text3.getText());
				if (blue<0||blue>255) blue=0;
				else text3.setText(""+blue);
			}
			else if (e.getSource() == button1){
				//
				red = Integer.parseInt(text1.getText());
				if (red<0||red>255) red=0;
				else text1.setText(""+red);
				//
				green = Integer.parseInt(text2.getText());
				if (green<0||green>255) green=0;
				else text2.setText(""+green);
				//
				blue = Integer.parseInt(text3.getText());
				if (blue<0||blue>255) blue=0;
				else text3.setText(""+blue);
				//
				color = new Color(red, green, blue);
				panel2.setBackground(color);
			}
		}
	}
}