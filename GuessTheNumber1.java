import pack1.GuessTheNumber;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuessTheNumber1 extends JFrame{
	JFrame frm;
	public GuessTheNumber1(){
		frm = new JFrame("Number Guessing Game");
		GuessTheNumber g=new GuessTheNumber();
		frm.setLayout(null);
		frm.setVisible(false);
	}
	public static void main(String[] args){
		new GuessTheNumber1();
	}
}

