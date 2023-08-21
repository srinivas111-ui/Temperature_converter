import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Fah extends WindowAdapter implements ActionListener
{
	Frame f=new Frame();
	String a="";
	TextField t1,t2,t3,t4;
	Button b1;
	Button b2;
	Fah()
	{
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		b1=new Button("Convert to Fahrenheit");
		b2=new Button("Convert to Celsius");
		Label l1=new Label("Temperature Converter");
		Label l2=new Label("Enter Fahrenheit ");
		Label l3=new Label("Enter Celsius");
		Panel p1=new Panel();
		l1.setBounds(70,70,200,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,100,100,20);
		t2.setBounds(270,100,100,20);
		//p1.setBounds(30,270,100,20);
		//b3.setBounds(30,10,100,20);
		b2.setBounds(50,150,100,20);
		l3.setBounds(30,200,100,20);
		t3.setBounds(150,200,100,20);
		t4.setBounds(270,200,100,20);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b2);
		b2.addActionListener(this);
		p1.add(b1);
		b1.addActionListener(this);
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,50,250));
		f.add(p1);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
		});
		l1.setBackground(Color.yellow);
		p1.setBackground(Color.magenta);
		
		f.setBackground(Color.cyan);
		f.setVisible(true);
		f.setSize(400,400);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		a=e.getActionCommand();
		if(a.equals("Convert to Fahrenheit"))
		{
			String j=t3.getText();
			String st=""+((Integer.parseInt(j)*1.8)+32);
			
			t4.setText(st);
		}
		else if(a.equals("Convert to Celsius"))
		{
			String h=t1.getText();
			String st=""+((Integer.parseInt(h)-32)/1.8);
			
			t2.setText(st);
		}
	}
	public static void main(String args[])
	{
		Fah f1=new Fah();
	}
}