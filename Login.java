import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;


public class Login extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2,b3; 
		JPanel p1;
   	    Cursor cursor;
		
	public Login()
	{
		super("Hawabodol.Com | Log in");
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
        LeftImage.setBounds(0,0,600, 800);
        p1.add(LeftImage);
		
		l1 = new JLabel("Welcome To");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(775,20,260,100);
		p1.add(l1);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(740,50,260,100);
		p1.add(l1);
		
		l1 = new JLabel("Member Login");
		l1.setFont(new Font("Algerian",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(750,160,260,100);
		p1.add(l1);
		
		l2 = new JLabel("Username :");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l2.setForeground(Color.white);
		l2.setBounds(740,250,200,40);
		p1.add(l2);
		
		l3 = new JLabel("Password :");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l3.setForeground(Color.white);
		l3.setBounds(740,350,200,40);
		p1.add(l3);
		
		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t1.setBounds(740,290,200,35);
		t1.setForeground(Color.black);
		t1.setBackground(new Color(197,197,197));
		p1.add(t1);

		t2 = new JPasswordField();
		t2.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t2.setForeground(Color.black);
		t2.setBackground(new Color(197,197,197));
		t2.setBounds(740,390,200,35);
		t2.setEchoChar('*');
		p1.add(t2);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		//button
		b1 = new JButton("Log in");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b1.setCursor(cursor);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(730,500,100,30);
		b1.setFocusable(false);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Register");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	    b2.setCursor(cursor);
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
		b2.setBounds(860,500,100,30);
		b2.setFocusable(false);
		b2.addActionListener(this);
		p1.add(b2);	
		
		b3 = new JButton("Admin");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	    b3.setCursor(cursor);
		b3.setForeground(Color.blue);
		b3.setBackground(Color.black);
		b3.setBounds(800,620,100,35);
		b3.setFocusable(false);
		b3.addActionListener(this);
		p1.add(b3);
		
		
        this.add(p1);		
       
	}


        public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b3)
			{
				Adminlogin f = new Adminlogin();
				this.setVisible(false);
				f.setVisible(true);
			}
		
		
			if(ae.getSource()==b2)
			{
				Register f = new Register();
				this.setVisible(false);
				f.setVisible(true);
			}
		
     
	       if(ae.getSource()==b1)

	          {
               String textField1 = t1.getText().toLowerCase(); // User Name 
               String textField2 = t2.getText();               // Password

               if (textField1.isEmpty() || textField2.isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                           JOptionPane.WARNING_MESSAGE);
                } 
				
				else 

                    try {
                        String userNameS = "User Name   : " + textField1;
                        String passwordS = "Password    : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();
						

                        for (int i = 0; i <= totalLines; i++) 
							
						 {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS))
								{
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) 
									
								 {
                                   JOptionPane.showMessageDialog(null, "Login Successful.", "Hawabodol.Com!",
                                   JOptionPane.WARNING_MESSAGE);
								   
                                   
                                    setVisible(false);
                                    Offer frame = new Offer();
                                    frame.setVisible(true);
                                    break;
                                 }
                                }
                          }
						
                        } 
					catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        }  
		
	 


	







