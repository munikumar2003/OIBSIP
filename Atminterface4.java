import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class Atminterface4 extends JFrame implements ActionListener{
	JFrame f1,f2,f3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l;
	JTextField t1,t2,t3,t4;
	JTextArea t5;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	int i=0,b=0;
	float a=2000, c=0,d=0;
	String str="";
	public Atminterface4(){
		f1 = new JFrame("ATM INTERFACE");
		f2 = new JFrame("ATM INTERFACE");
		f3 = new JFrame("ATM INTERFACE");
		f1.setLayout(null);
		l1 = new JLabel("Welcome to ATM");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(500,30,350,30);
		l4 = new JLabel("New User Login");
		l4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		l4.setBounds(570,160, 250, 20);
		l2 = new JLabel("Username :");
		l2.setFont(new Font("CASTELLAR", Font.PLAIN, 15));
		l2.setBounds(500,200, 150, 20);
		t1 = new JTextField("");
		t1.setBounds(610, 200, 150, 20);
		l3 = new JLabel("Card No.  :");
		l3.setFont(new Font("CASTELLAR", Font.PLAIN, 15));
		l3.setBounds(500,240, 150, 20);
		t2 = new JTextField("");
		t2.setBounds(610, 240, 150, 20);
		b1 = new JButton("Create PIN");
		b1.setBackground(Color.CYAN);
		b1.setBounds(610, 280, 100, 30);
		b2 = new JButton("CLR");
		b2.setBackground(Color.RED);
		b2.setBounds(715, 280, 70, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1.add(l1);
		f1.add(l4);
		f1.add(l2);
		f1.add(t1);
		f1.add(l3);
		f1.add(t2);
		f1.add(b1);
		f1.add(b2);
		b3 = new JButton("Open");
		b3.setBackground(Color.CYAN);
		b3.setBounds(620, 280, 80, 30);
		b4 = new JButton("CLR");
		b4.setBackground(Color.RED);
		b4.setBounds(700, 280, 70, 30);
		l = new JLabel();
		l.setBounds(0,0,0,0);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f2.add(b3);
		f2.add(b4);
		f2.add(l);
		b5 = new JButton("Balance Enquiry");
		b5.setFont(new Font("Consolas", Font.BOLD, 20));
		b5.setBackground(Color.CYAN);
		b5.setBounds(100,160,250,30);
		b6 = new JButton("Cash WithDraw");
		b6.setFont(new Font("Consolas", Font.BOLD, 20));
		b6.setBackground(Color.CYAN);
		b6.setBounds(1000,160,250,30);
		b7 = new JButton("Transcation History");
		b7.setFont(new Font("Consolas", Font.BOLD, 20));
		b7.setBackground(Color.CYAN);
		b7.setBounds(100,400,250,30);
		b8 = new JButton("Cash Deposit");
		b8.setFont(new Font("Consolas", Font.BOLD, 20));
		b8.setBackground(Color.CYAN);
		b8.setBounds(1000,400,250,30);
		b9 = new JButton("Pin Change");
		b9.setFont(new Font("Consolas", Font.BOLD, 20));
		b9.setBackground(Color.CYAN);
		b9.setBounds(100,600,250,30);
		b10 = new JButton("Transfer money");
		b10.setFont(new Font("Consolas", Font.BOLD, 20));
		b10.setBackground(Color.CYAN);
		b10.setBounds(1000,600,250,30);
		b11 = new JButton("Quit");
		b11.setFont(new Font("Consolas", Font.BOLD, 20));
		b11.setBackground(Color.RED);
		b11.setBounds(615,600,100,30);
		t5 = new JTextArea();
		t5.setBackground(Color.PINK);
		t5.setBounds(535,250, 250, 150);
		t5.setVisible(false);
		f3.add(b5);
		f3.add(b6);
		f3.add(b7);
		f3.add(b8);
		f3.add(b9);
		f3.add(b10);
		f3.add(b11);
		f3.add(t5);
		f3.add(l);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		f1.setVisible(true);
		f2.setVisible(false);
		f1.getContentPane().setBackground(Color.LIGHT_GRAY);
		f2.getContentPane().setBackground(Color.LIGHT_GRAY);
		f3.getContentPane().setBackground(Color.LIGHT_GRAY);
		f1.setSize(1400,700);
		f2.setSize(1400,700);
	}		
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			if(t1.getText()!=""&&t2.getText()!=""){
				f2.setVisible(true);
				l6 = new JLabel("Welcome to ATM");
		        l6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		        l6.setBounds(500,30,350,30);
				l8 = new JLabel();
				l8.setBounds(10,10,0,0);
				l5 = new JLabel("New PIN : ");
				l5.setFont(new Font("CASTELLAR", Font.PLAIN, 20));
				l5.setBounds(500,200,120,20);
				t3 = new JTextField("");
		        t3.setBounds(620, 200, 150, 20);    
				l7 = new JLabel("Re-Enter :");
				l7.setFont(new Font("CASTELLAR", Font.PLAIN, 20));
				l7.setBounds(500,240,120,20);
				t4 = new JTextField("");
		        t4.setBounds(620, 240, 150, 20);
				f2.add(l6);
				f2.add(l5);
				f2.add(t3);
				f2.add(t4);
				f2.add(l7);
				f2.add(l8);
			}
		}
		else if(e.getSource()==b2||e.getSource()==b4){
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		else if(e.getSource()==b3){
			if(t3.getText().equals(t4.getText())){
				i = Integer.parseInt(t3.getText());
				l10 = new JLabel();
				l10.setBounds(0,0,0,0);
				l9 = new JLabel("Welcome to ATM");
				l9.setFont(new Font("Times New Roman", Font.BOLD, 30));
				l9.setBounds(560,30,350,30);
				l17 = new JLabel("Hello "+t1.getText());
				l17.setFont(new Font("CASTELLAR", Font.PLAIN, 30));
				l17.setBounds(500,70,450,30);
				l18 = new JLabel("ACC. No. :"+t2.getText());
				l18.setFont(new Font("CASTELLAR", Font.PLAIN, 25));
				l18.setBounds(500,100,450,30);
				l11 = new JLabel("<---");
				l11.setFont(new Font("CONSOLAS", Font.BOLD, 30));
				l11.setBounds(400,160,150,30);
				l12 = new JLabel("--->");
				l12.setFont(new Font("CONSOLAS", Font.BOLD, 30));
				l12.setBounds(850,160,150,30);
				l13 = new JLabel("<---");
				l13.setFont(new Font("CONSOLAS", Font.BOLD, 30));
				l13.setBounds(400,400,150,30);
				l14 = new JLabel("--->");
				l14.setFont(new Font("CONSOLAS", Font.BOLD, 30));
				l14.setBounds(850,400,150,30);
				l15 = new JLabel("<---");
				l15.setFont(new Font("CONSOLAS", Font.BOLD, 30));
				l15.setBounds(400,600,150,30);
				l16 = new JLabel("--->");
				l16.setFont(new Font("CONSOLAS", Font.BOLD, 30));
				l16.setBounds(850,600,150,30);
				f3.add(l9);
				f3.add(l11);
				f3.add(l12);
				f3.add(l13);
				f3.add(l14);
				f3.add(l15);
				f3.add(l16);
				f3.add(l17);
				f3.add(l18);
				f3.add(l10);
				f3.setVisible(true);
				f3.setLayout(null);
				f3.setSize(1400, 700);
			}
			else
				JOptionPane.showMessageDialog(f2, "Password Mismatch");
		}
		else if(e.getSource()==b5){
			b=Integer.parseInt(JOptionPane.showInputDialog(f3,"Enter PIN"));
			if(b==i){
				t5.setVisible(true);
				t5.setText("Your Account Balance is "+a);
				str=str+"\nYou enquired balance amount";
			}
			else
				JOptionPane.showMessageDialog(f2, "Password Mismatch");
		}
		else if(e.getSource()==b6){
			c=Float.parseFloat(JOptionPane.showInputDialog(f3,"Enter amount"));
			if(c<=a){
				b=Integer.parseInt(JOptionPane.showInputDialog(f3,"Enter PIN"));
				if(b==i){
					t5.setVisible(true);
					t5.setText("Money Debited Successfully");
					a=a-c;
					str=str+"\n"+c+" Rs. is debited from your account";
				}
				else
				    JOptionPane.showMessageDialog(f2, "Password Mismatch");
			}
			else
				JOptionPane.showMessageDialog(f2, "Insufficient Balance");
		}
		else if(e.getSource()==b7){
			b=Integer.parseInt(JOptionPane.showInputDialog(f3,"Enter PIN"));
			if(b==i){
				t5.setVisible(true);
				t5.setText(str);
			}
			else
				JOptionPane.showMessageDialog(f2, "Password Mismatch");
		}
		else if(e.getSource()==b8){
			c=Float.parseFloat(JOptionPane.showInputDialog(f3,"Enter amount to deposit"));
			d=d+c;
			if(d<=40000){
				b=Integer.parseInt(JOptionPane.showInputDialog(f3,"Enter PIN"));
				if(b==i){
					t5.setVisible(true);
					t5.setText("Money credited Successfully");
					a=a+c;
					str=str+"\n"+c+" Rs. is credited to your account";
				}
				else
				    JOptionPane.showMessageDialog(f2, "Password Mismatch");
			}
			else
				JOptionPane.showMessageDialog(f2, "Daily Limit exceeded");
		}
		else if(e.getSource()==b9){
			b=Integer.parseInt(JOptionPane.showInputDialog(f3, "Enter current Password"));
			if(b==i){
				t3.setText("");
				t4.setText("");
				t5.setVisible(false);
				f3.setVisible(false);
				str="";
			}
		}
		else if(e.getSource()==b10){
			int i1=Integer.parseInt(JOptionPane.showInputDialog(f3, "Enter Account Number"));
			float f=Float.parseFloat(JOptionPane.showInputDialog(f3, "Enter amount"));
			b=Integer.parseInt(JOptionPane.showInputDialog(f3, "Enter Password"));
			if(b==i){
				a=a-f;
				t5.setText("Amount transferred successfully");
				str=str+"\n"+f+" Rs. is transferred to account:"+i1;
			}
			else
				JOptionPane.showMessageDialog(f3, "Password Mismatch");
		}
		else if(e.getSource()==b11){
			f3.setVisible(false);
			f2.setVisible(false);
		}
	}
	public static void main(String[] args){
		new Atminterface4();
	}
}