package problem1;

/*
 * Homework 12 Problem 1
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//-------------------
@SuppressWarnings("serial")
public class C18h5 extends JFrame {

	private Container contentPane;
	private JPanel panel1, panel2;
	private JButton button1;
	private JTextField text1;
	private JRadioButton radio1, radio2;
	private ButtonGroup group;
	private JCheckBox checkBox1, checkBox2;
	private ActionListener listener;
	private int count, red1, green1, blue1, red2, green2, blue2;
	//-----------------------------
	public C18h5(){
		
		setTitle("C18h5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		red1 = 52;
		green1=64;
		blue1=150;
		panel1.setBackground(new Color(red1,green1,blue1));
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
		checkBox1 = new JCheckBox("Clear Color");
		checkBox1.addActionListener(listener);
		panel1.add(checkBox1);
		
		panel2 = new JPanel();
		red2 = 200;
		green2= 15;
		blue2 = 64;
		panel2.setBackground(new Color(red2,green2,blue2));
		panel2.setPreferredSize(new Dimension(200,100));
		text1 = new JTextField(10);
		count = 0;
		text1.setText(""+count);
		text1.addActionListener(listener);
		panel2.add(text1);
		checkBox2 = new JCheckBox("Clear Color");
		checkBox2.addActionListener(listener);
		panel2.add(checkBox2);
		
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
		new C18h5();
	}
	//-----------------------------------
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource() == text1)
				count = Integer.parseInt(text1.getText());
			else if (e.getSource() == button1){
				if (radio1.isSelected())
					text1.setText(""+ ++count);
				else if (radio2.isSelected())
					text1.setText(""+ --count);
			}
			else if (e.getSource() == checkBox1){
				if (checkBox1.isSelected()==true){
					red1 = 255;
					green1=255;
					blue1= 255;
					panel1.setBackground(new Color(red1,green1,blue1));
				}
				else if (checkBox1.isSelected()==false){
					red1 = 52;
					green1=64;
					blue1=150;
					panel1.setBackground(new Color(red1,green1,blue1));
				}
			}
			else if (e.getSource() == checkBox2){
				if (checkBox2.isSelected()==true){
					red2 = 255;
					green2=255;
					blue2= 255;
					panel2.setBackground(new Color(red2,green2,blue2));
				}
				else if (checkBox2.isSelected()==false){
					red2 = 200;
					green2= 15;
					blue2 = 64;
					panel2.setBackground(new Color(red2,green2,blue2));
				}
			}
		}
	}
}
