import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Fix extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4,t5,t6;
		JButton b1,b2,b3,b4,b5,b6,b7; 
		JPanel p1;
		JOptionPane m1;
		Cursor cursor;
		
	public Fix()
	{
		super("Hawabodol.Com | Offerd");
		this.setSize(1100,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		//p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		b1 = new JButton("Book Now");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setCursor(cursor);
		b1.setBounds(221, 387, 98, 29);
		b1.setFocusable(false);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Book Now");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
	    b2.setCursor(cursor);
		b2.setBounds(598, 390, 98, 29);
		b2.setFocusable(false);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Book Now");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b3.setForeground(Color.blue);
		b3.setBackground(Color.white);
	    b3.setCursor(cursor);
		b3.setBounds(974, 400, 98, 29);
		b3.setFocusable(false);
		b3.addActionListener(this);
		p1.add(b3);

		b4 = new JButton("Book Now");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b4.setForeground(Color.blue);
		b4.setBackground(Color.white);
	    b4.setCursor(cursor);
		b4.setBounds(221, 735, 98, 29);
		b4.setFocusable(false);
		b4.addActionListener(this);
		p1.add(b4);

		b5 = new JButton("Book Now");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b5.setForeground(Color.blue);
		b5.setBackground(Color.white);
	    b5.setCursor(cursor);
		b5.setBounds(606, 727, 98, 29);
		b5.setFocusable(false);
		b5.addActionListener(this);
		p1.add(b5);

		b6 = new JButton("Book Now");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		b6.setForeground(Color.blue);
		b6.setBackground(Color.white);
		b6.setCursor(cursor);
		b6.setBounds(982, 732, 98, 29);
		b6.setFocusable(false);
		b6.addActionListener(this);
		p1.add(b6);
		
		b7 = new JButton("Back");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b7.setForeground(Color.blue);
		b7.setBackground(Color.white);
		b7.setCursor(cursor);
		b7.setBounds(982,20,100,29);
		b7.setFocusable(false);
		b7.addActionListener(this);
		p1.add(b7);

		
		ImageIcon leftimg = new ImageIcon("Image/panel3.png");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0,0,1100,800);
        p1.add(LeftImage);
		
		

		this.add(p1);
	}
		public void actionPerformed(ActionEvent ae)
		
		{
		 if(ae.getSource()==b1)
			{
				JOptionPane.showMessageDialog(null, "The price of the package is 8000 tk", "Hawabodol.Com!", JOptionPane.WARNING_MESSAGE);
				Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}
		
		if(ae.getSource()==b2)
			{
				JOptionPane.showMessageDialog(null, "The price of the package is 14000 tk", "Hawabodol.Com!", JOptionPane.WARNING_MESSAGE);
				Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}
		
		if(ae.getSource()==b3)
			{
				JOptionPane.showMessageDialog(null, "The price of the package is 8000 tk", "Hawabodol.Com!", JOptionPane.WARNING_MESSAGE);
				Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}					
		
		if(ae.getSource()==b4)
			{
				JOptionPane.showMessageDialog(null, "The price of the package is 9999 tk", "Hawabodol.Com!", JOptionPane.WARNING_MESSAGE);
				Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}

        if(ae.getSource()==b5)
			{
				JOptionPane.showMessageDialog(null, "The price of the package is 8000 tk", "Hawabodol.Com!", JOptionPane.WARNING_MESSAGE);
				Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		if(ae.getSource()==b6)
			{
				JOptionPane.showMessageDialog(null, "The price of the package is 5000 tk", "Hawabodol.Com!", JOptionPane.WARNING_MESSAGE);
				Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}	
			
			
		if(ae.getSource()==b7)
		{
		setVisible(false);
        Offer frame = new Offer();
        frame.setVisible(true);
		}	
			
        }	
}		