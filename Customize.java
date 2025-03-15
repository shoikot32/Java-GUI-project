import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Customize extends JFrame
{
		JLabel l1,l2,l3;
		JButton b1,b2,b3; 
		Font f1, f2, f3, f4, f5, f6;
		JComboBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
		Cursor cursor;
		Container c;
		
	public Customize()
	{
		super("Hawabodol.Com | Customize");
		this.setSize(1100,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(51,153,255));
		
		ImageIcon leftimg = new ImageIcon("Image/panel2.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0, 550,800);
        c.add(LeftImage);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(710,10,300,100);
		c.add(l1);
		
		
        // Fonts
        f1 = new Font("Comic Sans MS", Font.PLAIN, 20);
        f2 = new Font("Comic Sans MS", Font.PLAIN, 18);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f4 = new Font("Script", Font.BOLD, 18);
        f5 = new Font("Script", Font.PLAIN, 17);
		
		
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        l1 = new JLabel();
        l1.setText("Select Tour Details");
        l1.setBounds(725, 125, 500, 50);
        l1.setFont(f1);
        c.add(l1);

        // Tour Type
        l1 = new JLabel();
        l1.setText("Tour Type :");
        l1.setBounds(570, 175, 130, 50);
        l1.setFont(f4);
        c.add(l1);
		
		String[] cb1Str = { "Choose tour type...", "International", "Domestic" };
        cb1 = new JComboBox(cb1Str);
        cb1.setBounds(700, 184, 250, 30);
        cb1.setSelectedIndex(0);
        cb1.setFont(f5);
        cb1.setBackground(Color.WHITE);
        c.add(cb1);
		
        l2 = new JLabel();
        l2.setText("Place :");
        l2.setBounds(570, 200, 500, 50);
        l2.setFont(f4);
        c.add(l2);
		
        String[] cb2Str = { "Choose tour type first!" };
        cb2 = new JComboBox(cb2Str);
        cb2.setBounds(700, 209, 250, 30);
        cb2.setSelectedIndex(0);
        cb2.setFont(f5);
        cb2.setBackground(Color.WHITE);
        cb2.disable();
        c.add(cb2);

        // Person
        l1 = new JLabel();
        l1.setText("Person :");
        l1.setBounds(570, 225, 130, 50);
        l1.setFont(f4);
        c.add(l1);

        String[] cb3Str = { "Total person number...", "1", "2", "3", "4", "5" };
        cb3 = new JComboBox(cb3Str);
        cb3.setBounds(700, 234, 250, 30);
        cb3.setSelectedIndex(0);
        cb3.setFont(f5);
        cb3.setBackground(Color.WHITE);
        c.add(cb3);
		
		// Days
        l1 = new JLabel();
        l1.setText("Total Days :");
        l1.setBounds(570, 250, 130, 50);
        l1.setFont(f4);
        c.add(l1);

        String[] cb4Str = { "Number of days...", "1", "2", "3", "4", "5", "6", "7" };
        cb4 = new JComboBox(cb4Str);
        cb4.setBounds(700, 259, 250, 30);
        cb4.setSelectedIndex(0);
        cb4.setFont(f5);
        cb4.setBackground(Color.WHITE);
        c.add(cb4);

        // Hotel
        l1 = new JLabel();
        l1.setText("Hotel Type :");
        l1.setBounds(570, 275, 130, 50);
        l1.setFont(f4);
        c.add(l1);

        String[] cb5Str = { "Select tour type first!" };
        cb5 = new JComboBox(cb5Str);
        cb5.setBounds(700, 284, 250, 30);
        cb5.setSelectedIndex(0);
        cb5.setFont(f5);
        cb5.setBackground(Color.WHITE);
        cb5.disable();
        c.add(cb5);

        // Travel By
        l1 = new JLabel();
        l1.setText("Travel By :");
        l1.setBounds(570, 300, 130, 50);
        l1.setFont(f4);
        c.add(l1);

        String[] cb6Str = { "Select tour type first!" };
        cb6 = new JComboBox(cb6Str);
        cb6.setBounds(700, 309, 250, 30);
        cb6.setSelectedIndex(0);
        cb6.setFont(f5);
        cb6.setBackground(Color.WHITE);
        cb6.disable();
        c.add(cb6);

        // Vehicle Type
        l1 = new JLabel();
        l1.setText("Vehicle Type :");
        l1.setBounds(570, 325, 130, 50);
        l1.setFont(f4);
        c.add(l1);

        String[] cb7Str = { "Select vehicle first!" };
        cb7 = new JComboBox(cb7Str);
        cb7.setBounds(700, 336, 250, 30);
        cb7.setSelectedIndex(0);
        cb7.setFont(f5);
        cb7.setBackground(Color.WHITE);
        cb7.disable();
        c.add(cb7);
		
		b1 = new JButton("Back");
        b1.setBounds(775,500,100,30);
        b1.setFont(f2);
        b1.setCursor(cursor);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        c.add(b1);

        b2 = new JButton("Reset");
        b2.setBounds(775,550,100,30);
        b2.setFont(f2);
        b2.setCursor(cursor);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        c.add(b2);

        b3 = new JButton("Next");
        b3.setBounds(775,450,100,30);
        b3.setFont(f2);
        b3.setCursor(cursor);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        c.add(b3);
		
		cb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int s = cb1.getSelectedIndex();
                if (s == 0) {
                    l2.setText("Place");
                    cb2.removeAllItems();
                    cb2.addItem("Choose tour type first!");
                    cb2.disable();
                    cb5.removeAllItems();
                    cb5.addItem("Select tour type first!");
                    cb5.disable();
                    cb6.removeAllItems();
                    cb6.addItem("Select tour type first!");
                    cb6.disable();
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle first!");
                    cb7.disable();
                } 
				else if (s == 1){
					JOptionPane.showMessageDialog(null, "Sorry, this service not available :(", "Warning!",
				     JOptionPane.WARNING_MESSAGE);}
					 
				else if (s == 2) {
                    l2.setText("Place");
                    cb2.removeAllItems();
                    cb2.addItem("Select Place...");
                    cb2.addItem("Cox's Bazar");
                    cb2.addItem("Sajek Valley ");
                    cb2.addItem("Saint Martin");
                    cb2.addItem("Bandarban");
                    cb2.addItem("Sylhet");
                    cb2.addItem("Sundarban");
                    cb2.enable();
                    cb5.removeAllItems();
                    cb5.addItem("Choose hotel type...");
                    cb5.addItem("Loduge (2000 tk)");
                    cb5.addItem("Motel (3500 tk)");
                    cb5.addItem("Local (5000 tk)");
                    cb5.addItem("3 Star Hotel (10000 tk)");
                    cb5.addItem("5 Star Hotel (15000 tk)");
                    cb5.enable();
                    cb6.removeAllItems();
                    cb6.addItem("Travel By...");
                    cb6.addItem("Train");
                    cb6.addItem("Bus");
                    cb6.addItem("Airplane (14000 tk)");
                    cb6.enable();
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle first!");
                    cb7.enable();
                }
            }
        });	 
		
		
		cb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int s = cb6.getSelectedIndex();
                if (s == 0) {
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle First!");
                } else if (s == 1) {
                    cb7.removeAllItems();
                    cb7.addItem("Select train type...");
                    cb7.addItem("AC Sleeping Couch (3500 tk)");
                    cb7.addItem("AC Seating Couch (2000 tk)");
                    cb7.addItem("AC Train (1500 tk)");
                    cb7.addItem("Non-AC Train (1000 tk)");
                    cb7.enable();
                } else if (s == 2) {
                    cb7.removeAllItems();
                    cb7.addItem("Select bus type...");
                    cb7.addItem("AC Bus (2500 tk)");
                    cb7.addItem("Non-AC Bus (900 tk)");
                    cb7.enable();
                } else if (s == 3) {
                    cb7.removeAllItems();
                    cb7.addItem("No different types available...");
                }
            }
        });
		
		
	    // Back Button
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Offer frame = new Offer();
                frame.setVisible(true);
            }
        });
	
	
	    // Reset Button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               setVisible(false);
               Customize frame = new Customize();
               frame.setVisible(true);
            }
        });
		
		
		// Next Button
        b3.addActionListener(new ActionListener() {
			
            public void actionPerformed(ActionEvent ae) {
                if ((cb1.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select tour type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else if ((cb2.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select destination.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else if ((cb3.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total person number.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else if ((cb4.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total number of days.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else if ((cb5.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total hotel type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else if (((cb1.getSelectedIndex()) == 2) && ((cb6.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "You forgot to select travel by.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else if (((cb1.getSelectedIndex()) == 2) && ((cb6.getSelectedIndex()) != 3)
                        && ((cb7.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Vehicle Type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				
				else {
                    

                      if ((cb1.getSelectedIndex()) == 2) {
                        int cb1Cost = 10000* (cb2.getSelectedIndex()); ;
                        int cb2Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            cb2Cost = 7000;
                        } else if (cb2.getSelectedIndex() == 2) {
                            cb2Cost = 6000;
                        } else if (cb2.getSelectedIndex() == 3) {
                            cb2Cost = 5000;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 4000;
                        } else if (cb2.getSelectedIndex() == 5) {
                            cb2Cost = 3000;
                        } else if (cb2.getSelectedIndex() == 6) {
                            cb2Cost = 2800;
                        }

                        int cb3Cost = 2000 * (cb3.getSelectedIndex());
                        int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 2000;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 3500;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 5000;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 10000;
                        } else if (cb5.getSelectedIndex() == 5) {
                            cb5Cost = 15000;
                        }

                        int cb4Cost = cb5Cost * cb4.getSelectedIndex();
                        int cb7Cost = 0;

                        if (cb6.getSelectedIndex() == 1) {
                            if (cb7.getSelectedIndex() == 1) {
                                cb7Cost = 3500;
                            } else if (cb7.getSelectedIndex() == 2) {
                                cb7Cost = 2000;
                            } else if (cb7.getSelectedIndex() == 3) {
                                cb7Cost = 1500;
                            } else if (cb7.getSelectedIndex() == 4) {
                                cb7Cost = 1000;
                            }
                        } else if (cb6.getSelectedIndex() == 2) {
                            if (cb7.getSelectedIndex() == 1) {
                                cb7Cost = 2500;
                            } else if (cb7.getSelectedIndex() == 2) {
                                cb7Cost = 900;
                            }
                        } else if (cb6.getSelectedIndex() == 3) {
                            cb7Cost = 14000;
                        }

                        int totalCost = cb1Cost + cb2Cost + cb3Cost + cb4Cost + cb5Cost + cb7Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : " + totalCost + " tk", "Hawabodol.Com",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
                        Payment frame = new Payment();
                        frame.setVisible(true);
                    }
                }
            }
        });
	
	}

	
}
