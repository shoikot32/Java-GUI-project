import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Offer extends JFrame implements ActionListener   {
	
	JButton b1,b2,b3,b4,b5,b6,b7;
	JPanel p1;
	JLabel l1;
	Cursor cursor;
	
	Offer() {
		super("Hawabodol.Com | Home");
		this.setSize(1100, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		ImageIcon leftimg = new ImageIcon("Image/panel2.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0,550, 800);
        p1.add(LeftImage);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBackground(new Color(197,197,197));
		l1.setBounds(710,10,300, 100);
		p1.add(l1);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);	
		
		b1 = new JButton("Home");
		b1.setBounds(580, 110, 80, 40);
		b1.setFont(new Font("Poppins", Font.BOLD, 18));
		b1.setForeground(new Color(85,151,251));
		b1.setForeground(Color.white);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b1.setFocusable(false);
		b1.setFocusPainted(false); 
		b1.setContentAreaFilled(false);
		p1.add(b1);
		
		b2 = new JButton("About");
		b2.setBounds(660, 110, 80, 40);
		b2.setFont(new Font("Poppins", Font.BOLD, 18));
		b2.setForeground(Color.white);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b2.setFocusable(false);
		b2.setFocusPainted(false); 
		b2.setContentAreaFilled(false);
		p1.add(b2);
		
		b3 = new JButton("Contribution");
		b3.setBounds(840,110,120,40);
		b3.setFont(new Font("Poppins", Font.BOLD, 18));
		b3.setForeground(Color.white);
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b3.setFocusable(false);
		b3.setContentAreaFilled(false);
		p1.add(b3);
		
		b4 = new JButton("Logout");
		b4.setBounds(980, 110, 68, 40);
		b4.setFont(new Font("Poppins", Font.BOLD, 18));
		b4.setForeground(Color.white);
		b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b4.setFocusable(false);
		b4.setFocusPainted(false); 
		b4.setContentAreaFilled(false);
		p1.add(b4);
		
		
		b5 = new JButton("Default Package");
		b5.setBounds(690,301,260,100);
		b5.setFont(new Font("Comic Sans MS", Font.BOLD,22));
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//b5.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b5.setFocusable(false);
		b5.setFocusPainted(false); 
		//b5.setContentAreaFilled(false);
		p1.add(b5);
		

		
		b6 = new JButton("Custom Package");
		b6.setBounds(690,431,260,100);
		b6.setFont(new Font("Comic Sans MS", Font.BOLD,22));
		b6.setForeground(Color.WHITE);
		b6.setBackground(Color.BLACK);
		b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//b6.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b6.setFocusable(false);
		b6.setFocusPainted(false); 
		//b6.setContentAreaFilled(false);
		p1.add(b6);
		
		b7 = new JButton("Admin Access");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b7.setCursor(cursor);
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		b7.setBounds(690,561,260,100);
		b7.setFocusable(false);
		b7.addActionListener(this);
		p1.add(b7);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		
		this.add(p1);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1)
		{
		setVisible(false);
        Offer frame = new Offer();
        frame.setVisible(true);
		}
		
		if(ae.getSource()==b2)
		{
		setVisible(false);
        About frame = new About();
        frame.setVisible(true);
		}
		
		if(ae.getSource()==b3)
		{
		setVisible(false);
        Contribution frame = new Contribution();
        frame.setVisible(true);
		}
		
		if(ae.getSource()==b4)
		{
		setVisible(false);
        Login frame = new Login();
        frame.setVisible(true);
		}
		
		if(ae.getSource()==b5)
		{
		setVisible(false);
        Fix frame = new Fix();
        frame.setVisible(true);
		}
		
		if(ae.getSource()==b6)
		{
		setVisible(false);
        Customize frame = new Customize();
        frame.setVisible(true);
		}
		
		if(ae.getSource()==b7)
		{
		setVisible(false);
        Adminlogin frame = new Adminlogin();
        frame.setVisible(true);
		}
		
		
		
	}
}