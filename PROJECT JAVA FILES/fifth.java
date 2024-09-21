import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class fifth extends JFrame implements ActionListener {

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
	JLabel jl,jl2;
	JScrollPane jp;
	JButton b1;
	JTextField t1;
	
	public fifth() 
	{
		
		
	     
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(1920,1200);
	     setVisible(true);
		
		
		
		
		//BackgroundImage
		ImageIcon bg=new ImageIcon("C:\\Users\\shree\\Pictures\\l9.jpg");
       jl=new JLabel(bg,JLabel.CENTER);
       setSize(1920,1200);
       //jp=new JScrollPane(jl);
        add(jl);
       
        
       
       
       JOptionPane.showMessageDialog(this,"You Have Sucessfully Submmited Your Exam");
       
       Font F= new Font("SansSerif",Font.BOLD,20);
       
    b1=new JButton ("    VIEW SCORE    ");
   	b1.setBounds(840,570, 220, 40);
   	b1.addActionListener(this);
   	b1.setForeground(Color.GREEN);
   	b1.setFont(F);
   	jl.add(b1);
   	
   	t1=new JTextField("");
   	t1.setFont(F);
	t1.setForeground(Color.RED);
   	t1.setBounds(850,650, 200, 40);	
   	jl.add(t1);
   	
   
	}

	
   
	
	public void actionPerformed(ActionEvent arg0)
	{
		t1.setEditable(false);
		t1.setVisible(true);
	}

}
