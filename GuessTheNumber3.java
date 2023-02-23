package pack3;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuessTheNumber3 extends JFrame implements ActionListener{
	JFrame frm;
	JButton btn1,btn2,btn3;
	JLabel l1,l2,l3,l4,l5;
	JTextArea ta;
	int gen=0,gue=0,i=0;
	String str1="";
	public GuessTheNumber3(){
		frm = new JFrame("Number Guessing Game");
		l2 = new JLabel("PLAY THE GAME");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l2.setBounds(450,100,300,30);
		btn1 = new JButton("Generate");
		btn1.setBackground(Color.ORANGE);
		btn2 = new JButton("Guess");
		btn2.setBackground(Color.ORANGE);
		btn3 = new JButton("End Game");
		btn1.setBounds(400,200,100,30);
		btn2.setBounds(600,200,100,30);
		l1 = new JLabel();
		l1.setBounds(0,0,0,0);
		l3 = new JLabel("Remaining chances : ");
		l3.setFont(new Font("Consolas", Font.ITALIC, 15));
		l3.setBounds(400, 330, 170, 15);
		l4 = new JLabel("5");
		l4.setBounds(560, 330, 50,15);
		ta = new JTextArea("Press Generate to generate a \nRandom number(1-100)");
		ta.setBackground(Color.PINK);
		ta.setBounds(400,250,300,70);
		btn3 = new JButton("END GAME");
		btn3.setBackground(Color.BLUE);
		btn3.setBounds(600,500,100,30);
		l5 = new JLabel();
		l5.setBounds(400, 380, 200, 20);
		btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
		frm.add(btn1);
		frm.add(btn2);
		frm.add(ta);
		frm.add(l2);
		frm.add(l3);
		frm.add(l4);
		frm.add(btn3);
		frm.add(l5);
		frm.add(l1);
		frm.getContentPane().setBackground(Color.LIGHT_GRAY);
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setSize(1300,700);
	}
	public void actionPerformed(ActionEvent ae){
		Random r = new Random();
		if(ae.getSource() == btn1){
			gen = r.nextInt(100)+1;
			System.out.println(gen);
			btn1.setVisible(false);
			ta.setText("Computer has generated a \nrandom between (1-100).\nNow you can guess the number \nby clicking guess button.");
		}
		else if(ae.getSource() == btn2){
			str1 = JOptionPane.showInputDialog("Enter Your Guessing Number");
			gue = Integer.parseInt(str1);
			if(i<4){
				if(gue>gen){
					ta.setText("Your number is greater than\ncomputer generated number");
					l4.setText(""+(4-i));
				}
				else if(gue<gen){
					ta.setText("Your number is lesser than\ncomputer generated number");
					l4.setText(""+(4-i));
				}
				else {
					l4.setText(""+(4-i));
					JOptionPane.showMessageDialog(frm,"You won the game");
					ta.setText("You Guessed the correct number");
					l5.setText("Your Score is "+(5-i)*100+""); 
					btn2.setVisible(false);
			    }
			}
			else {
				l4.setText(""+0);
				btn2.setVisible(false);
				l5.setText("Your Score is "+0+""); 
			}
			i=i+1;
		}
		else if(ae.getSource()==btn3)
			frm.setVisible(false);
	}
	public static void main(String[] args){
		new GuessTheNumber3();
	}
}
		