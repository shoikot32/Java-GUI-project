import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
import java.time.*;
import java.time.format.*;

public class Register extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t1,t2,t3,t4;
		JButton b1,b2,b7; 
		JPasswordField t5,t6;
		JPanel p1;
		Cursor cursor;
		
	public Register()
	{
		super("Hawabodol.Com | Register");
		this.setSize(1100,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1100,800));
		p1.setBackground(new Color(51,153,255));
		p1.setLayout(null);
		
		ImageIcon leftimg = new ImageIcon("Image/register.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0, 600, 800);
        p1.add(LeftImage);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(730,50,240,50);
		p1.add(l1);
		
		l1 = new JLabel("Sign up for FREE");
		l1.setFont(new Font("Congenial",Font.BOLD,12));
		l1.setForeground(Color.white);
		l1.setBounds(602,2,100,30);
		p1.add(l1);
		
		
		l8 = new JLabel("Already have account? Click Back");
		l8.setFont(new Font("Congenial",Font.BOLD,12));
		l8.setForeground(Color.black);
		l8.setBounds(602,700,250,30);
		p1.add(l8);
		
		l2 = new JLabel("First Nane:");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		l2.setForeground(Color.white);
		l2.setBounds(740,150,200,25);
		p1.add(l2);
		
		l3 = new JLabel("Last Name :");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		l3.setForeground(Color.white);
		l3.setBounds(740,220,200,25);
		p1.add(l3);
		
		l4 = new JLabel("Username :");
		l4.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		l4.setForeground(Color.white);
		l4.setBounds(740,290,200,25);
		p1.add(l4);
		
		l5 = new JLabel("Phone:");
		l5.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		l5.setForeground(Color.white);
		l5.setBounds(740,360,200,25);
		p1.add(l5);
		
		l6 = new JLabel("Password :");
		l6.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		l6.setForeground(Color.white);
		l6.setBounds(740,430,200,25);
		p1.add(l6);
		
		l7 = new JLabel("Confirm Password:");
		l7.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		l7.setForeground(Color.white);
		l7.setBounds(740,500,200,25);
		p1.add(l7);
		
		
		t1 = new JTextField(); //First name
		t1.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t1.setBackground(new Color(197,197,197));
		t1.setBounds(740,175,200,30);
		p1.add(t1);

		t2 = new JTextField(); //Last Name
		t2.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t2.setBackground(new Color(197,197,197));
		t2.setBounds(740,245,200,30);
		p1.add(t2);
		
		t3 = new JTextField(); //User Name
		t3.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t3.setBackground(new Color(197,197,197));
		t3.setBounds(740,315,200,30);
		p1.add(t3);
		
		t4 = new JTextField(); //Phone
		t4.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t4.setBackground(new Color(197,197,197));
		t4.setBounds(740,385,200,30);
		p1.add(t4);
		
		t5 = new JPasswordField(); //Password
		t5.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t5.setBackground(new Color(197,197,197));
		t5.setBounds(740,455,200,30);
		t5.setEchoChar('*');
		p1.add(t5);
		
		t6 = new JPasswordField(); //Confirm Password
		t6.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t6.setBackground(new Color(197,197,197));
		t6.setBounds(740,525,200,30);
		t6.setEchoChar('*');
		p1.add(t6);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b1.setCursor(cursor);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(730,640,100,30);
		b1.setFocusable(false);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Create");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b2.setCursor(cursor);
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
		b2.setBounds(850,640,100,30);
		b2.setFocusable(false);
		b2.addActionListener(this);
		p1.add(b2);	
		
	    b7 = new JButton("Login");
		b7.setBounds(602,720,50,30);
		b7.setFont(new Font("Congenial",Font.BOLD,12));
		//b7.setForeground(new Color.black);
		b7.setForeground(Color.black);
		b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b7.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		b7.setFocusable(false);
		b7.setFocusPainted(false); 
		b7.setContentAreaFilled(false);
		//p1.add(b7);
		
        this.add(p1);		
       
	  }
	  
	    public void actionPerformed(ActionEvent ae)
		{
			
		 if(ae.getSource()==b1)
			{
				Login f = new Login();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			
		
		 if(ae.getSource()==b2)
			 {
                String textField1 = t1.getText();               // First Name
                String textField2 = t2.getText();               // Last Name
                String textField3 = t3.getText().toLowerCase(); // Username
                String textField4 = t4.getText();               // Phone
                String textField5 = t5.getText();               // Password
				String textField6 = t6.getText();               //ConfirmP Password
                

                if (!textField5.equals(textField6))
					
				{
                  JOptionPane.showMessageDialog(null, "Invalid Password Match", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
			
                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() || textField5.isEmpty() || textField6.isEmpty())
			    {
                  JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                } 

					else {

                        try {
                            File file = new File(".\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name   : " + textField3);
                            pw.println("Password    : " + textField5);
                            pw.println("First Name  : " + textField1);
                            pw.println("Last Name   : " + textField2);
                            pw.println("Phone       : " + textField4);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        setVisible(false);
                        Otp frame = new Otp();
                        frame.setVisible(true);

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }
						

                    }
                
            }
		
		}
		
		public static void main(String args[]){
			new Register();
		}
}
