/*Neha pawar*/
import java.awt.*;
import java.awt.event.*;
class CheckBoxDemo extends Frame implements ItemListener
{    String msg=" ";
      Checkbox winXP,winVista,solaris,mac;
	  CheckboxGroup cbg;
	CheckBoxDemo()
	{  FlowLayout f=new FlowLayout();  
	setSize(500,500);
	setVisible(true);
	setLayout(f);
	cbg=new CheckboxGroup();
	winXP=new Checkbox("windows xp",cbg,true);
	winVista=new Checkbox("windows vista",cbg,false);
	solaris=new Checkbox("solaris",cbg,false);
	mac=new Checkbox("mac",cbg,false);
	add(winXP);
	add(winVista);
	add(solaris);
	add(mac);
	winXP.addItemListener(this);
	winVista.addItemListener(this);
	solaris.addItemListener(this);
	mac.addItemListener(this);
	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="current state";
		/*
		g.drawString(msg,50,100);
		msg="windows xp "+winXP.getState();
	    g.drawString(msg,50,120);
		msg="windows vista "+winVista.getState();
	    g.drawString(msg,50,140);
		msg="solaris "+solaris.getState();
		g.drawString(msg,50,160);
        msg="mac "+mac.getState();
		g.drawString(msg,50,180);*/
		msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,50,180);

	}
	
	public static void main(String arg[])
	{
		CheckBoxDemo obj=new CheckBoxDemo();
	}
}
