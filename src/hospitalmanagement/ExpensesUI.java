package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class ExpensesUI{
    private JFrame f1;
    private JLabel l1, l2, l3, limg;
    private JPanel p1; 
    private JButton b1, b2, b3;
    private JTable tbl;
    private DefaultTableModel tblm;
    private JScrollPane sp1;
    
    //contructor
    public ExpensesUI() {
        f1 = new JFrame("Group8 OOP");
        f1.getContentPane().setBackground(Color.decode("#1f67ba"));
        
        // Label settings
        l1 = new JLabel("Manage Patient's Information");
        l1.setBounds(360, 0, 1000, 100);
        l1.setFont(new Font("Cambria",Font.BOLD,35));
        l1.setForeground(Color.WHITE);
        
        l2 = new JLabel("______________________________________________________________________________");
        l2.setBounds(0, 28, 2000, 100);
        l2.setFont(new Font("Arial",Font.BOLD,30));
        l2.setForeground(Color.WHITE);
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);
                
        // Table and its settings
        String[] columnNames = {"Date","Description","Amount","Encoder"};
        tblm = new DefaultTableModel(columnNames, 0);
        tbl = new JTable(tblm);
        tbl.setBounds(585, 170, 550, 390);
        
        // This to costumize the column size
        TableColumn id = tbl.getColumnModel().getColumn(0);
        id.setPreferredWidth(50);
        
        TableColumn age = tbl.getColumnModel().getColumn(2);
        age.setPreferredWidth(40); 

        TableColumn gender = tbl.getColumnModel().getColumn(3);
        gender.setPreferredWidth(50);
        
        sp1 = new JScrollPane(tbl);
        sp1.setBounds(585, 170, 550, 390);
        
       
        //code for load image
        ImageIcon i1 = new ImageIcon("Images//expenses.jpg");
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        //label for the pic
        limg = new JLabel(i3);
        
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.BLACK);
        
        //will add the label to the panel
        p1.add(limg);
        
        //buttons and its settings
        b1 = new JButton("Back");
        b1.setBounds(1060, 600, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }
        });
        
        b2 = new JButton("Add Expense Record");
        b2.setBounds(300, 550, 115, 35);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        b3 = new JButton("Delete Expense Record");
        b3.setBounds(425, 550, 115, 35);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        
        // Add objects to the frame
        f1.add(l1);
        f1.add(l3);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(sp1);
        f1.add(p1);
        f1.add(l2);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}