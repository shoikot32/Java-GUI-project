import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contribution extends JFrame implements ActionListener{
	
	JButton b1,b2;
	JPanel p1;
	Cursor cursor;
	
	Contribution() {
		super("Hawabodol.Com | Contribution");
		this.setSize(1100, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		//p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);	
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setCursor(cursor);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(980,720,100,30);
		b1.setFocusable(false);
		b1.addActionListener(this);
		p1.add(b1);
		
		ImageIcon leftimg = new ImageIcon("Image/contribution.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0,1100,800);
        p1.add(LeftImage);
		
		
		this.add(p1);
		
	}
	 public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
				
			{
				Offer f = new Offer();
				this.setVisible(false);
				f.setVisible(true);
			}
    }
}