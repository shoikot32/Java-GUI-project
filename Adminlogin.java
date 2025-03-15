import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Adminlogin extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel l1;
    private JTextField t1;
    private JButton b1, b2;
    private JPasswordField t2;
    private Cursor cursor;

    Adminlogin() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hawabodol.Com | Admin Panel");
        this.setSize(1100, 800);
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
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		l1.setForeground(Color.BLACK);
		l1.setBounds(720,200,260,100);
		c.add(l1);
		
		  // User Name
        l1 = new JLabel();
        l1.setText("Name :");
        l1.setBounds(720,290,200,40);
        l1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l1.setForeground(Color.white);
        c.add(l1);
		
		t1 = new JTextField();
        t1.setBounds(720,330,200,35);
		t1.setForeground(Color.black);
		t1.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t1.setBackground(new Color(197,197,197));
		c.add(t1);
		
		 // Password
        l1 = new JLabel();
        l1.setText("Password :");
        l1.setBounds(720,390,200,40);
        l1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l1.setForeground(Color.white);
        c.add(l1);

        t2 = new JPasswordField();
        t2.setBounds(720, 430, 210, 35);
        t2.setFont(new Font("Times New Roman",Font.PLAIN,18));
		t2.setForeground(Color.black);
		t2.setBackground(new Color(197,197,197));
        t2.setEchoChar('*');
        c.add(t2);
		
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		
		b1 = new JButton("Back");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setCursor(cursor);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.black);
		b1.setBounds(720,500,100,30);
        c.add(b1);

        b2 = new JButton("Login");
        b2.setBounds(840,500,100,30);
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setCursor(cursor);
        b2.setForeground(Color.blue);
		b2.setBackground(Color.black);
        c.add(b2);
		
		
		 // Back Button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Login frame = new Login();
                frame.setVisible(true);
            }
        });


        // Login Button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = t1.getText().toLowerCase(); // Admin Name
                String textField2 = t2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {

                        String userNameS = "Name     : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.", "Travel Agency!",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    Admin frame = new Admin();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}