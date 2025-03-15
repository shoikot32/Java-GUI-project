import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener
{
	    JLabel l1;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1;
		JOptionPane m1,m2,m3,m4;
		Cursor cursor;
		
	public Payment()
	{
	
		super("Hawabodol.Com | Payment");
		this.setSize(1100,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(120,40,240,100);
		p1.add(l1);
		
		l1 = new JLabel("choose payment method");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l1.setForeground(Color.black);
		l1.setBounds(110,150,240,100);
		p1.add(l1);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);	
		
		
		b1 = new JButton("Sellect");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b1.setCursor(cursor);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(118, 472, 85, 35);
		b1.setFocusable(false);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Sellect");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b2.setCursor(cursor);
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
		b2.setBounds(268, 472, 85, 35);
		b2.setFocusable(false);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Sellect");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b3.setCursor(cursor);
		b3.setForeground(Color.blue);
		b3.setBackground(Color.white);
		b3.setBounds(122, 677, 85, 35);
		b3.setFocusable(false);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Sellect");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b4.setCursor(cursor);
		b4.setForeground(Color.blue);
		b4.setBackground(Color.white);
		b4.setBounds(270,675,85,35);
		b4.setFocusable(false);
		b4.addActionListener(this);
		p1.add(b4);
		
		
		b5 = new JButton("Back");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setCursor(cursor);
		b5.setForeground(Color.blue);
		b5.setBackground(Color.white);
		b5.setBounds(970,710,100,30);
		b5.setFocusable(false);
		b5.addActionListener(this);
		p1.add(b5);
		
		ImageIcon leftimg = new ImageIcon("Image/panel4.png");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0, 1100, 800);
        p1.add(LeftImage);
		
		
		
		this.add(p1);
}
		
		public void actionPerformed(ActionEvent ae)
		{
			
		if(ae.getSource()==b1)
		{
			Bkash f = new Bkash();
			this.setVisible(false);
			f.setVisible(true);
		} 
		
		if(ae.getSource()==b2)
		{
			Nagad f = new Nagad();
			this.setVisible(false);
			f.setVisible(true);
		} 
		
		if(ae.getSource()==b5)
		{
			Offer f = new Offer();
			this.setVisible(false);
			f.setVisible(true);
		} 
		
		
		
		if(ae.getSource()==b3)
		
		{  m3.showMessageDialog(null, "Sorry, this service not available :(", "Sorry:) !",
                                m3.WARNING_MESSAGE);
								}
			
		
		if(ae.getSource()==b4)
		
		{ m4.showMessageDialog(null, "Sorry, this service not available :(", "Sorry:) !",
                                m4.WARNING_MESSAGE); 
			
				
		}
 }
}



