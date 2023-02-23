package pack2;
import pack3.GuessTheNumber3;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuessTheNumber2 extends JFrame implements ActionListener{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JCheckBox cb;
	JButton btn;
	public GuessTheNumber2(){
		frm = new JFrame("Number Guessing Game");
		frm.setLayout(null);
		l2 = new JLabel();
		l2.setBounds(0,0,0,0);
		l1 = new JLabel("INSTRUCTIONS TO PLAY THE GAME");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(50, 50, 700, 30);
		l3 = new JLabel("*");
		l3.setFont(new Font("Consolas", Font.BOLD, 25));
		l3.setBounds(70, 90, 30, 25);
		l4 = new JLabel("You have only five chances to guess the number(1-100).");
		l4.setFont(new Font("Consolas", Font.ITALIC, 20));
		l4.setBounds(100, 90, 800, 20);
		l5 = new JLabel("*");
		l5.setFont(new Font("Consolas", Font.BOLD, 25));
		l5.setBounds(70, 120, 30, 25);
		l6 = new JLabel("Your Score is reduced by half for a wrong Guess.");
		l6.setFont(new Font("Consolas", Font.ITALIC, 20));
		l6.setBounds(100, 120, 800, 20);
		l7 = new JLabel("*");
		l7.setFont(new Font("Consolas", Font.BOLD, 25));
		l7.setBounds(70, 150, 30, 25);
		l8 = new JLabel("Please click the check box given to start.");
		l8.setFont(new Font("Consolas", Font.ITALIC, 20));
		l8.setBounds(100, 150, 800, 20);
		cb = new JCheckBox("Terms and Conditions apply*");
		cb.setBounds(70, 180, 500, 20);
		btn = new JButton("Submit");
		btn.setBounds(100, 220, 80, 30);
		btn.setVisible(false);
		btn.setBackground(Color.PINK);
		cb.addActionListener(this);
		btn.addActionListener(this);
		frm.add(l1);
		frm.add(l3);
		frm.add(l4);
		frm.add(l5);
		frm.add(l6);
		frm.add(l7);
		frm.add(l8);
		frm.add(cb);
		frm.add(btn);
		frm.add(l2);
		frm.getContentPane().setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
		frm.setSize(1300,700);
	}
	public void actionPerformed(ActionEvent ae){
		if(cb.isSelected()==true)
		    btn.setVisible(true);
		else 
			btn.setVisible(false);
		if(ae.getSource()==btn){
			GuessTheNumber3 g3 = new GuessTheNumber3();
		}
	}
	public static void main(String[] args){
		new GuessTheNumber2();
	}
}