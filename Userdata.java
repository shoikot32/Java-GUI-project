import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class Userdata extends JFrame {

    private Container c;
    private JLabel l1;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton b1,b2,b3,b4;
	private Font f1;
    private Cursor cursor;
     
    private String[] column = { "User Name", "Password", "First Name ", "Last Name", "Phone", "Date & Time" };
    private String[] rows = new String[7];

    Userdata() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hawabodol.Com | User Info");
        this.setSize(1100,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(51,153,255));
		
		ImageIcon leftimg = new ImageIcon("Image/panel2.jpg");
        JLabel LeftImage = new JLabel("", leftimg, JLabel.CENTER);
        LeftImage.setBounds(0, 0,550, 800);
        c.add(LeftImage);
		
		f1 = new Font("Script", Font.PLAIN, 20);
		
		l1 = new JLabel("Hawabodol.Com");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(710,10,300, 100);
		c.add(l1);
		
		
		 // Title
        l1 = new JLabel("Data User-Info");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,24));
		l1.setForeground(Color.white);
		l1.setBounds(750,150,260,100);
		c.add(l1);
		
		
		cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        b1 = new JButton("Refresh");
        b1.setBounds(775,650,100,30);
        b1.setCursor(cursor);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        c.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(775,700,100,30);
        b2.setCursor(cursor);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        c.add(b2);

        b3 = new JButton("Delete");
        b3.setBounds(775,600,100,30);
        b3.setCursor(cursor);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        c.add(b3);
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f1);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(570,250,500,300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);
		
		
		String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0,4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(13);       // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(13); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(13); // First Name
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(13); // Last Name
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(13); // Phone
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

        // Refresh Button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Userdata frame = new Userdata();
                frame.setVisible(true);

            }
        });

        // Delete Button
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(13).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    Userdata frame = new Userdata();
                    frame.setVisible(true);
                }

            }
        });
		
		// Back Button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Adminlogin frame = new Adminlogin();
                frame.setVisible(true);
            }
        });
	}
}