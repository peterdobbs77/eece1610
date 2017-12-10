/*
 * Homework 11 Problem 1, chapter 18 homework 1
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 4/14/2015
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class C18h1 extends JFrame {
	
	private Container contentPane;
	private JPanel panel1;
	private JTextField text1, text2;
	private JButton button1;
	private JLabel label1;
	private ActionListener listener;
	private int sum, i1, i2;
	//-------------------------------
	public C18h1(){
		
		setTitle("C18h1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.setPreferredSize(new Dimension(300,100));
		listener = new Listener();
		
		text1 = new JTextField(10);
		text1.addActionListener(listener);
		text2 = new JTextField(10);
		text2.addActionListener(listener);
		panel1.add(text1);
		panel1.add(text2);
		button1 = new JButton("Add");
		button1.addActionListener(listener);
		panel1.add(button1);
		
		sum = 0;
		label1 = new JLabel();
		label1.setText("Sum = "+sum);
		panel1.add(label1);
		
		// get content pane of frame
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel1);
			
		pack();
		setVisible(true);
	}
	//---------------------------------------
	public static void main(String[] args){
		
		new C18h1();
	}
	//-----------------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			i1 = Integer.parseInt(text1.getText());
			i2 = Integer.parseInt(text2.getText());
			if(e.getSource()==button1)
				sum = i1+i2;
				label1.setText("Sum = "+sum);
		}
	}
}