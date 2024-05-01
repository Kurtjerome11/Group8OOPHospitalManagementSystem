package hospitalmanagement;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class System{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13,l14, limg,l15;
    private JRadioButton r1,r2,r3;
    private JPanel p1, p2;
    private JTextField tName, tPass;
    private JButton j1;

    System() {
        //frame setting
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.BLACK);
        
        //label settings
        l1 = new JLabel("Group 8's Hospital Management System");
        l1.setBounds(110, 20, 1000, 100);
        l1.setFont(new Font("Cambria",Font.PLAIN,55));
        l1.setForeground(Color.WHITE);
        
        l4 = new JLabel("____________________________________________");
        l4.setBounds(0, 65, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,50));
        l4.setForeground(Color.WHITE);
        
        l2 = new JLabel("Welcome, how can we help you?");
        l2.setBounds(115, 120, 500, 100);
        l2.setFont(new Font("Cambria",Font.PLAIN,20));
        l2.setForeground(Color.WHITE);
        
        l6 = new JLabel("Position:");
        l6.setBounds(115, 190, 500, 100);
        l6.setFont(new Font("Bookman Old Style",Font.PLAIN,17));
        l6.setForeground(Color.WHITE);
        
        l8 = new JLabel("Name:");
        l8.setBounds(115, 270, 500, 100);
        l8.setFont(new Font("Bookman Old Style",Font.PLAIN,15));
        l8.setForeground(Color.WHITE);
        
        l10 = new JLabel("Password:");
        l10.setBounds(115, 390, 500, 100);
        l10.setFont(new Font("Bookman Old Style",Font.PLAIN,15));
        l10.setForeground(Color.WHITE);
        
        
        //textfields and its settings
        tName = new JTextField();
        tName.setBounds(115, 340, 250, 25);
        
        tPass = new JTextField();
        tPass.setBounds(115, 460, 250, 25);
        
        
        //this is for position purposes only
        l14 = new JLabel();
        l14.setBounds(1100, 200, 100, 1000);
                
        l5 = new JLabel();
        l5.setBounds(1100, 200, 100, 1000);
        
        l12 = new JLabel();
        l12.setBounds(1100, 200, 100, 1000);
        
        l13 = new JLabel();
        l13.setBounds(1100, 200, 100, 1000);
       
        l11 = new JLabel();
        l11.setBounds(1100, 200, 100, 1000);
        
        l9 = new JLabel();
        l9.setBounds(1100, 200, 100, 1000);
        
        l7 = new JLabel();
        l7.setBounds(1100, 200, 100, 1000);
        
        l3 = new JLabel();
        l3.setBounds(1100, 200, 100, 1000);
        
        l15 = new JLabel();
        l15.setBounds(1100, 200, 100, 1000);
        
        
        //login button settings
        j1 = new JButton("Login");
        j1.setBounds(185, 550, 100, 30);
        j1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tName.getText();
                String password = tPass.getText();
                if (name.equals("admin")||name.equals("doctor")||name.equals("nurse") 
                    && password.equals("admin")||password.equals("doctor")||password.equals("nurse")) {
                    new MainUi();
                } else {
                    JOptionPane.showMessageDialog(f1, "Invalid Name or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        //new button group
        ButtonGroup b1 = new ButtonGroup();

        // radio buttons and its setting
        r1 = new JRadioButton("Doctor");
        r1.setForeground(Color.WHITE);
        r1.setBackground(Color.BLACK);
        r2 = new JRadioButton("Nurse");
        r2.setForeground(Color.WHITE);
        r2.setBackground(Color.BLACK);
        r3 = new JRadioButton("Admin");
        r3.setForeground(Color.WHITE);
        r3.setBackground(Color.BLACK);

        // add radio buttons to the button group
        b1.add(r1);
        b1.add(r2);
        b1.add(r3);
        
        //panel for the radio buttons and its settings
        p1 = new JPanel();
        p1.setBounds(107, 250, 200, 40);
        p1.setBackground(Color.BLACK);
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        
        //code for load image
        ImageIcon i1 = new ImageIcon("C:\\Users\\Mhacee Caryl\\Desktop\\bubuy\\pital.jpg");
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        //label for the pic
        limg = new JLabel(i3);
        
        //panel for image on the ui and it setttings
        p2 = new JPanel();
        p2.setBounds(440, 200, 670, 400);
        p2.setBackground(Color.BLACK);
        
        //will add the label to the panel
        p2.add(limg);
        
        // add objects to the frame
        f1.add(p1);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l10);
        f1.add(l11);
        f1.add(tName);
        f1.add(l12);
        f1.add(tPass);
        f1.add(l13);
        f1.add(j1);
        f1.add(l14);
        f1.add(p2);
        f1.add(l15);
        
        //frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new System();
    }
}


