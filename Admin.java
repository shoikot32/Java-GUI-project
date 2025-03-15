import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

    private Container c;
    private JLabel l1;
    private JButton b1, b2, b3;
    private Cursor cursor;

    Admin() {
        // Frame Layout
        super("Hawabodol.Com | Admin Panel");
		this.setSize(1100,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(51,153,255));
		
		ImageIcon leftimg = new ImageIcon("Image/panel2.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0,550, 800);
        c.add(LeftImage);
		
		
	    l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(710,10,300, 100);
		c.add(l1);
       
	   
	    l1 = new JLabel("Admin Panel");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,22));
		l1.setForeground(Color.BLACK);
		l1.setBounds(740,200,260,100);
		c.add(l1);

        cursor = new Cursor(Cursor.HAND_CURSOR);	
 
        b1 = new JButton("UserData-info");
		b1.setBounds(680,300,260,100);
		b1.setFont(new Font("Cooper Black", Font.BOLD,28));
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.BLACK);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//b1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b1.setFocusable(false);
		b1.setFocusPainted(false); 
		//b1.setContentAreaFilled(false);
		c.add(b1);

       
		b2 = new JButton("admin logout"); 
		b2.setBounds(680,430,260,100);
		b2.setFont(new Font("Cooper Black", Font.BOLD,30));
		b2.setForeground(Color.BLUE);
		b2.setBackground(Color.BLACK);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//b2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b2.setFocusable(false);
		b2.setFocusPainted(false); 
		//b2.setContentAreaFilled(false);
		c.add(b2);
		
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Userdata frame = new Userdata();
                frame.setVisible(true);
            }
        });
		
		b2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
                
                setVisible(false);
                Adminlogin frame = new Adminlogin();
                frame.setVisible(true);
            }
        });
		
	}
}