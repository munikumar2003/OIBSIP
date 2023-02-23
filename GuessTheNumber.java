package pack1;
import pack2.GuessTheNumber2;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuessTheNumber extends JFrame implements ActionListener{
	JFrame frm;
	JTextField ta2,ta1;
	JButton btn1;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7;
	public GuessTheNumber(){
		frm = new JFrame("NUMBER GUESSING GAME");
		frm.setLayout(new BorderLayout());
		lbl2 = new JLabel();
		lbl2.setBounds(1000,1000,0,0);
		lbl3 = new JLabel("WELCOME TO");
		lbl3.setBounds(550,120,200,20);
		lbl3.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbl1 = new JLabel("GUESS THE NUMBER GAME");
		lbl1.setBounds(400,150,700,35);
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lbl4 = new JLabel("Please enter your credentials to play the game!!!");
		lbl4.setBounds(400,220,1500,20);
		lbl4.setFont(new Font("Consolas", Font.ITALIC, 20));
		lbl5 = new JLabel("Name");
		lbl5.setBounds(400,250,100,20);
		lbl5.setFont(new Font("Calibri", Font.BOLD, 20));
		ta1 = new JTextField("");
		ta1.setBounds(460,250,200,20);
		lbl6 = new JLabel("Mail");
		lbl6.setBounds(400,280,100,20);
		lbl6.setFont(new Font("Calibri", Font.BOLD, 20));
		ta2 = new JTextField("");
		ta2.setBounds(460,280,250,20);
		btn1 = new JButton("Submit");
		btn1.setBounds(460, 310, 80, 30);
		btn1.setBackground(Color.BLUE);
		btn1.addActionListener(this);
		lbl7 = new JLabel();
		lbl7.setBounds(460,350,200,20);
		frm.add(lbl1);
		frm.add(lbl3);
		frm.add(lbl4);
		frm.add(lbl5);
		frm.add(ta1);
		frm.add(lbl6);
		frm.add(ta2);
		frm.add(btn1);
		frm.add(lbl7);
		frm.add(lbl2);
		frm.getContentPane().setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
		frm.setSize(1300,700);
	}
	public void actionPerformed(ActionEvent ae){
		if(ta1.getText().equals("")||ta2.getText().equals(""))
			lbl7.setText("Please enter the credentials.");
		else{
			lbl7.setText("Successfully Logged in!!");
			GuessTheNumber2 g2 = new GuessTheNumber2();
		}
	}
	public static void main(String[] args){
		new GuessTheNumber();
	}
}