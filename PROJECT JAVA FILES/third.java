import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class third extends JFrame implements ActionListener {

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

	
	
	int score=0;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,sc;
	
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40;
	JLabel jl,jl2;
	JScrollPane jp;
	JTextField t1;
	
	
	
	Font F= new Font("SansSerif",Font.ITALIC,20);
	Font F1= new Font("SansSerif",Font.BOLD,20);
	public third()
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
		 
		 
		
		 
	    //Question 5
		l1=new JLabel("5) Which of the following creates a List of 3 visible items and multiple selections abled? "); 
				
				
				
				
		l1.setFont(F1);
		l1.setForeground(Color.RED);
		l1.setBounds(100, 100, 1000,40);
		jl.add(l1);
		
		
		CheckboxGroup cb1= new CheckboxGroup();
		c1= new Checkbox("a) new List(false, 3)",false,cb1);
		c1.setFont(F);
		c1.setBounds(100,140,1000,50);
		jl.add(c1);
		
		c2= new Checkbox("b) new List(3, true)",false,cb1);
		c2.setFont(F);
		c2.setBounds(100,190,1000,50);
		jl.add(c2);
		
		c3= new Checkbox("c) new List(true, 3)",false,cb1);
		c3.setFont(F);
		c3.setBounds(100,240,1000,50);
		jl.add(c3);
		
		c4= new Checkbox("d) new List(3, false)",false,cb1);
		c4.setFont(F);
		c4.setBounds(100,290,1000,50);
		jl.add(c4);
		
		//Question 
		l2=new JLabel("6) Which of the following for loop declaration is not valid?");
								 
		l2.setFont(F1);
		l2.setForeground(Color.RED);
		l2.setBounds(100, 370, 1000,40);
		jl.add(l2);
		
		CheckboxGroup cb2= new CheckboxGroup();
		
		c5= new Checkbox("a)for ( int i = 99; i >= 0; i / 9 )",false,cb2);
		c5.setFont(F);
		c5.setBounds(100,410,1000,50);
		jl.add(c5);
		
		c6= new Checkbox("b) for ( int i = 7; i <= 77; i += 7 )",false,cb2);
		c6.setFont(F);
		c6.setBounds(100,450,1000,50);
		jl.add(c6);
		
		c7= new Checkbox("c) for ( int i = 20; i >= 2; - -i )",false,cb2);
		c7.setFont(F);
		c7.setBounds(100,500,1000,50);
		jl.add(c7);
		
		c8= new Checkbox("d) for ( int i = 2; i <= 20; i = 2* i )",false,cb2);
		c8.setFont(F);
		c8.setBounds(100,550,1000,50);
		jl.add(c8);
		
		
		//Question7
				l3=new JLabel("7) In which process, a local variable has the same name as one of the instance variables?");
						
						
				l3.setFont(F1);
				l3.setForeground(Color.RED);
				l3.setBounds(100,630, 1020,40);
				jl.add(l3);
				
				CheckboxGroup cb3= new CheckboxGroup();
				
				c9= new Checkbox("a) Serialization",false,cb3);
				c9.setFont(F);
				c9.setBounds(100,670,1000,50);
				jl.add(c9);
				
				c10= new Checkbox("b) Variable Shadowing",false,cb3);
				c10.setFont(F);
				c10.setBounds(100,710,1000,50);
				jl.add(c10);
				
				c11= new Checkbox("c) Abstraction",false,cb3);
				c11.setFont(F);
				c11.setBounds(100,750,1000,50);
				jl.add(c11);
				
				c12= new Checkbox("d) Multi-threading",false,cb3);
				c12.setFont(F);
				c12.setBounds(100,800,1000,50);
				jl.add(c12);

				
				
				//Question 8
				l4=new JLabel("8) Which package contains the Random class?");
						
						
				l4.setFont(F1);
				l4.setForeground(Color.RED);
				l4.setBounds(100,880, 1000,40);
				jl.add(l4);
				
				CheckboxGroup cb4= new CheckboxGroup();
				
				c13= new Checkbox("a) java.util package",false,cb4);
				c13.setFont(F);
				c13.setBounds(100,910,1000,50);
				jl.add(c13);
				
				c14= new Checkbox("b) java.lang package",false,cb4);
				c14.setFont(F);
				c14.setBounds(100,950,1000,50);
				jl.add(c14);
				
				c15= new Checkbox("c) java.awt package",false,cb4);
				c15.setFont(F);
				c15.setBounds(100,1000,1000,50);
				jl.add(c15);
				
				c16= new Checkbox("d) java.io package",false,cb4);
				c16.setFont(F);
				c16.setBounds(100,1050,1000,50);
				jl.add(c16);
				
				
				
				

				JLabel j1=new JLabel("Page 2/3");
		    	j1.setBounds(1350, 320, 200, 40);
		    	j1.setFont(F1);
		    	jl.add(j1);	
		    	
	    b1=new JButton ("SUBMIT & NEXT ");
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
				score+=2;
				c1.setState(true);
			}
			if(c3.getState()==true)
			{
				 score+=0;
				c3.setState(true);
			}
			if(c4.getState()==true)
			{
				 score+=0;
				c4.setState(true);
			}
			if(c5.getState()==true)
			{
				score+=2;
				c5.setState(true);
			}
			if(c6.getState()==true)
			{
				 score+=0;
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
			 if(c9.getState()==true)
			{
				 score+=0;
				c9.setState(true);
			}
			 if(c10.getState()==true)
				{
				 score+=2;
					c10.setState(true);
					
				}
			 if(c11.getState()==true)
				{
				 score+=0;
					c11.setState(true);
					
				}
			 if(c12.getState()==true)
				{
				 score+=0;
					c12.setState(true);
					
				}
			 if(c13.getState()==true)
				{
				 score+=2;
					c13.setState(true);
					
				}
			 if(c14.getState()==true)
				{
				 score+=0;
					c14.setState(true);
					
				}
			 if(c15.getState()==true)
				{
				 score+=0;
					c15.setState(true);
					
				}
			 if(c16.getState()==true)
				{
				 score+=0;
					c16.setState(true);
					
				}
			int num=Integer.parseInt(t1.getText());
			 fourth f=new fourth();
			
			 f.t1.setText(""+(num+score));
			 f.t1.setVisible(false);
			 f.setVisible(true);
	         setVisible(false);
			
		}
		
	
		
	
		
	}

	
	

}
