package hospitalmanagement;
import javax.swing.*;
import java.awt.*;

public class MainUi{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2,l4;
    private JRadioButton r1,r2,r3;
    private JTextField tName, tPass;

    MainUi() {
        //frame setting
        f1.setSize(1200, 700);
        
        //label settings
        l1 = new JLabel("Hospital Management System");
        l1.setBounds(110, 20, 1000, 100);
        l1.setFont(new Font("Cambria",Font.PLAIN,75));
        
        l4 = new JLabel("____________________________________________");
        l4.setBounds(0, 65, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,50));
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);

        // add objects to the frame
        f1.add(l1);
        f1.add(l4);
        f1.add(l2);
        
        //frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new System();
    }
}
