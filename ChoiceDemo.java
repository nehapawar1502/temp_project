import java.awt.*;
import java.awt.event.*;
class ChoiceDemo extends Frame implements ItemListener
{   
    ChoiceDemo()
    {
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public static void main(String arg[])
	{
		ChoiceDemo obj=new ChoiceDemo();
	}
	
}