import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bkash extends JFrame implements ActionListener   {
	
	JButton b1,b2;
	JTextField t1;
	JPasswordField t2;
	JLabel l1,l2,l3,l4;
	JPanel p1;
	Cursor cursor;
	JOptionPane m1,m2;
	
	Bkash() {
		super("Hawabodol.Com | Bkash");
		this.setSize(1100, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		//p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		
		
		l3 = new JLabel("Hawabodol.Com");
		l3.setFont(new Font("Britannic Bold",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(200,40,260,100);
		p1.add(l3);
		
		
		
		l1 = new JLabel("Phone:");
		l1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l1.setForeground(Color.black);
		l1.setBounds(47,330,100,30);
		p1.add(l1);
		
	    t1 = new JTextField(); //Phone
		t1.setFont(new Font("Times New Roman",Font.PLAIN,30));      
		t1.setBackground(new Color(197,197,197));
		t1.setBounds(45, 367, 479, 71);
		p1.add(t1);

        l2 = new JLabel("PIN :");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l2.setForeground(Color.black);
		l2.setBounds(47,435,100,30);
		p1.add(l2);
		
		t2 = new JPasswordField(); //Pin
		t2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		t2.setBackground(new Color(197,197,197));
		t2.setBounds(45, 467, 479, 71);
		t2.setEchoChar('*');
		p1.add(t2);
		
       cursor = new Cursor(Cursor.HAND_CURSOR);	
	   
		b1 = new JButton("Confirm");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b1.setCursor(cursor);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(402,598,123,46);
		b1.addActionListener(this);
		p1.add(b1);
		
		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b2.setCursor(cursor);
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
		b2.setBounds(47,602,123,46);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		
		ImageIcon leftimg = new ImageIcon("Image/bkash.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0,0,1100,800);
        p1.add(LeftImage);
		
		this.add(p1);	
		
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
		 
	     if(ae.getSource()==b1){
          String textField1 = t1.getText(); 
		  String textField2 = t2.getText(); 

               if (textField1.isEmpty() || textField2.isEmpty())
			   {
                   m1.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                   m1.WARNING_MESSAGE);
               } 
			   
			   else { m2.showMessageDialog(null, "Payment Successfully Completed.",
      			"Payment Complete", m2.WARNING_MESSAGE);
		
				Offer f = new Offer();
				this.setVisible(false);
				f.setVisible(true);
				   
			   }
		 }
		
		if(ae.getSource()==b2){
		
		        Offer f = new Offer();
				this.setVisible(false);
				f.setVisible(true);
		}
		
		}
		
}