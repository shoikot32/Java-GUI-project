import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Otp extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4,t5,t6;
		JButton b1,b2,b3; 
		JPanel p1;
		JOptionPane m1,m2,m3,m4;
		Cursor cursor;
		
	    public Otp()
    {
		super("Hawabodol.Com | Verification ");
		this.setSize(1100,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		ImageIcon leftimg = new ImageIcon("Image/panel.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0, 600, 800);
        p1.add(LeftImage);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setBackground(Color.black);
		l1.setFont(new Font("Britannic Bold",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(750,50,240,40);
		p1.add(l1);
		
		l2 = new JLabel("Please enter your valid OTP");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l2.setForeground(Color.white);
		l2.setBounds(720,280,400,25);
		p1.add(l2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t1.setBounds(760,320,200,30);
		p1.add(t1);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);

		
		b1 = new JButton("Get code");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setCursor(cursor);
		b1.setBounds(730,390,100,30);
		b1.setFocusable(false);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Submit");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
		b2.setCursor(cursor);
		b2.setBounds(880,390,100,30);
		b2.setFocusable(false);
		b2.addActionListener(this);
		p1.add(b2);	
		
		this.add(p1);	

    }
		
     public void actionPerformed(ActionEvent ae)

	{
		if(ae.getSource()==b1)
			
         { 
		  m1.showMessageDialog(null, "6 Degit OTP sent to your phone number",
           "Registration", m1.WARNING_MESSAGE);
		   
		 }
		 
		 
		if(ae.getSource()==b2){
			  String textField1 = t1.getText();               

               if (textField1.isEmpty())
			   {
                   m2.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                   m2.WARNING_MESSAGE);
               } 
		 
             else {
				  
		        m3.showMessageDialog(null, "Registration Successfully Completed.",
      			 "Registration Complete", m3.WARNING_MESSAGE);
	 
		         Login f = new Login();
		       this.setVisible(false);
		       f.setVisible(true);
		           }
			 }
			   
		   
     	}
			
 }
	
