import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="avg" width=500 height=500> </applet> */
public class avg extends JApplet
{
JLabel jl;
JLabel l1,l2,l3;
public void init()
{
try
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
makeGUI();
}
});
}
catch(Exception e)
{
System.out.println(e);
}
}
public void makeGUI()
{
setLayout(new FlowLayout());
l1=new JLabel("Enter the average of 1 IA");
l2=new JLabel("Enter the average of 2 IA");
l3=new JLabel("Enter the average of 3 IA");
JTextField jt1=new JTextField(10);
JTextField jt2=new JTextField(10);
JTextField jt3=new JTextField(10);
add(l1);
add(jt1);
add(l2);
add(jt2);
add(l3);
add(jt3);
jl=new JLabel("");
add(jl);
JButton jb=new JButton("Average");
jb.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{
		int avg1=Integer.parseInt(jt1.getText());
		int avg2=Integer.parseInt(jt2.getText());
		int avg3=Integer.parseInt(jt3.getText());
		int average=(avg1+avg2+avg3)/3
		jl.setText(String.valueOf(average));
	}
});
add(jb);
}
}
