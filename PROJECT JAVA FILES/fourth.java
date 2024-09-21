import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class fourth extends JFrame implements ActionListener {

	 JPanel contentPane;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					second frame = new second();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public int score=0;
	JButton b1,b2,b3;
	JLabel l1,l2,sc;
	JTextField t1;
	
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	JLabel jl,jl2;
	JScrollPane jp;
	
	
	
	Font F= new Font("SansSerif",Font.ITALIC,20);
	Font F1= new Font("SansSerif",Font.BOLD,20);
	public fourth()
	{
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1920,1200);
		setVisible(true);
		
		
		
		//BackgroundImage
		ImageIcon bg=new ImageIcon("C:\\Users\\shree\\Pictures\\bg3.jpg");
        jl=new JLabel(bg,JLabel.CENTER);
       setSize(1920,1200);
        jp=new JScrollPane(jl);
        add(jp);
    
       	one();
	    
	   
	
	}
	
	 public void one() 
	    { 
		 
		 
		
		 
	    //Question 9
		l1=new JLabel("9) What do you mean by nameless objects?"); 
				
		l1.setFont(F1);
		l1.setForeground(Color.RED);
		l1.setBounds(100, 100, 1000,40);
		jl.add(l1);
		
		
		CheckboxGroup cb1= new CheckboxGroup();
		c1= new Checkbox("a) An object created by using the new keyword.",false,cb1);
		c1.setFont(F);
		c1.setBounds(100,140,1000,50);
		jl.add(c1);
		
		c2= new Checkbox("b) An object of a superclass created in the subclass.",false,cb1);
		c2.setFont(F);
		c2.setBounds(100,190,1000,50);
		jl.add(c2);
		
		c3= new Checkbox("c) An object without having any name but having a reference.",false,cb1);
		c3.setFont(F);
		c3.setBounds(100,240,1000,50);
		jl.add(c3);
		
		c4= new Checkbox("d) An object that has no reference.",false,cb1);
		c4.setFont(F);
		c4.setBounds(100,290,1000,50);
		jl.add(c4);
		
		//Question 10
		l2=new JLabel("10) An interface with no fields or methods is known as a ______.");
		l2.setFont(F1);
		l2.setForeground(Color.RED);
		l2.setBounds(100, 370, 1000,40);
		jl.add(l2);
		
		CheckboxGroup cb2= new CheckboxGroup();
		
		c5= new Checkbox("a) Runnable Interface",false,cb2);
		c5.setFont(F);
		c5.setBounds(100,410,1000,50);
		jl.add(c5);
		
		c6= new Checkbox("b) Marker Interface",false,cb2);
		c6.setFont(F);
		c6.setBounds(100,450,1000,50);
		jl.add(c6);
		
		c7= new Checkbox("c) Abstract Interface",false,cb2);
		c7.setFont(F);
		c7.setBounds(100,500,1000,50);
		jl.add(c7);
		
		c8= new Checkbox("d) CharSequence Interface",false,cb2);
		c8.setFont(F);
		c8.setBounds(100,550,1000,50);
		jl.add(c8);
		
		
		

		JLabel j1=new JLabel("Page 3/3");
    	j1.setBounds(1350, 320, 200, 40);
    	j1.setFont(F1);
    	jl.add(j1);	
				
				
	    b1=new JButton ("SUBMIT");
		b1.setBounds(1300, 370, 200, 40);
		b1.setFont(F1);
		b1.addActionListener(this);
		jl.add(b1);
		
		 t1=new JTextField("");
		t1.setBounds(1440, 420, 200, 40);	
		jl.add(t1);
				
				
				
				
			
	    }
	 
	 

	

	
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==b1)
		{

			if(c1.getState()==true)
			{
				score+=0;
				c1.setState(true);
			 
				
			}
			if(c2.getState()==true)
			{
				score+=0;
				c1.setState(true);
			}
			if(c3.getState()==true)
			{
				score+=0;
				c3.setState(true);
			}
			if(c4.getState()==true)
			{
				score+=2;
				c4.setState(true);
			}
			if(c5.getState()==true)
			{
				score+=0;
				c5.setState(true);
			}
			if(c6.getState()==true)
			{
				score+=2;
				c6.setState(true);
			}
			 if(c7.getState()==true)
			{
				score+=0;
				c7.setState(true);
			}
			
			 if(c8.getState()==true)
			{
				score+=0;
				c8.setState(true);
			}
			
			
			 int num=Integer.parseInt(t1.getText());
			fifth f1=new fifth();
			f1.t1.setVisible(false);
			f1.t1.setText("               "+(num+score));
			f1.setVisible(true);
			
	        setVisible(false);
			
			
		}
		
		
	
		
	}

	
	

}
