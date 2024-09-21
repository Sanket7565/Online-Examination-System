import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends JFrame implements ActionListener
{
	
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	
	
    public  Start()
	{
    	
    	
    	
    	  //JFrame	    
    	 setTitle("ONLINE EXAMINATION");
 		 setSize(1820,1100);
 	     setLocationRelativeTo(null);
 	 	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	     setVisible(true);
 	     Font F= new Font("SansSerif",Font.ROMAN_BASELINE,20);
 	     Font F1= new Font("SansSerif",Font.ITALIC,40);
 	     setLayout(new FlowLayout());
 	     
 	     
    	 
		//BackgroundImage
		ImageIcon bg=new ImageIcon("C:\\Users\\shree\\Pictures\\l10.jpg");
    	JLabel l1=new JLabel(bg,JLabel.CENTER);
        setSize(1700,1000);
    	add(l1);
    	
    	// Login Label
    	Color c1=new Color(120,120,120,120);
    	JLabel j1=new JLabel("Student Login Panel");
    	j1.setBounds(430,100, 700,100);
    	j1.setFont(F1);
    	j1.setForeground(Color.BLACK);
    	j1.setBackground(c1);
    	l1.add(j1);
    	
    	
    	//JPanel
    	
	     JPanel jp= new JPanel();
	     jp.setLayout(null);
	     jp.setBounds(250,200,700,750);
	     jp.setBackground(c1);
	     l1.add(jp);
	     
    	
    	//Logo
    	ImageIcon logo=new ImageIcon("C:\\Users\\shree\\Pictures\\user3.png");
    	JLabel l2=new JLabel(logo);
        l2. setBounds(240,20,256,256);
    	jp.add(l2);
    	
    	//Username Image
    	ImageIcon user=new ImageIcon("C:\\Users\\shree\\Pictures\\user1.0.png");
    	JLabel l3=new JLabel(user);
        l3.setBounds(100,300,64,64);
       // l3.setToolTipText("ENTER YOUR VALID USERNAME");
    	jp.add(l3);
    	
        //Username Textfield
    	t1=new JTextField();
    	t1.setBounds(180,310,350,40);
    	t1.setFont(F);
    	//t1.setToolTipText("ENTER YOUR VALID USERNAME");
    	jp.add(t1);
    			
    	//Password Image
    	ImageIcon pass=new ImageIcon("C:\\Users\\shree\\Pictures\\pass.png");
    	JLabel l4=new JLabel(pass);
        l4.setBounds(100,400,64,64);
         l4.setToolTipText("ENTER YOUR VALID PASSWORD");
    	jp.add(l4);
    	
    	//Password Textfield
    	 t2=new JPasswordField();
    	t2.setBounds(180,410,350,40);
    	t2.setFont(F);
    	t2.setToolTipText("ENTER YOUR VALID PASSWORD");
       	jp.add(t2);
       	
        //Login Button
       	ImageIcon login=new ImageIcon("C:\\Users\\shree\\Pictures\\log.png");
         b1=new JButton(login);
        b1.setBounds(240,540,200,48);
         b1.setToolTipText("LOGIN HERE...");
        jp.add(b1);
        b1.addActionListener(this);
        
        
       
    	
    	
	}
    
    public void login()
    {
    	

    	if(t1.getText().equals("admin")&&t2.getText().equals("admin"))
    	{
    		
    		
    		
    		second sc=new second();
        	sc.setVisible(true);
    	    setVisible(false);
    	    
    	   
    	}
    	
    	else
    	{
    		
    		JOptionPane.showMessageDialog(this,"OOPS....! Something Went Wrong...Please Check Your Username And Password");
    	}
    	
    }
    
    public void actionPerformed(ActionEvent ae)
	{
		
    
    	login();
    	
	}
    
    
    
	public static void main (String args[]) 
	{
		
	    Start s=new Start();
	  
    }
	
	
	}

