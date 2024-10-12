*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package bloodbank;

/**
 *
 * @author johncalkins
 */

public class BloodBank extends javax.swing.JFrame {
// get the type and quantity
    private int A_pos = 10;
    private int A_neg = 5;
    private int B_pos = 8;
    private int B_neg = 3;
    private int AB_pos = 4;
    private int AB_neg = 2;
    private int O_pos = 12;
    private int O_neg = 6;

    public BloodBank() {
        initComponents();
        // have to display them
        displayBloodQuantities();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel = new JPanel();
        jScrollPane = new JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank");

        jMenu1.setText("Home");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Add Blood");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Logout");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);
        // create layout 
        jPanel.setLayout(new GridLayout(0, 2)); 
        jScrollPane.setViewportView(jPanel); 

        add(jScrollPane); 

        pack();
    }
// create class for the quantities
    private void displayBloodQuantities() {

        jPanel.removeAll();

        
        jPanel.add(new JLabel("A+ :"));
        jPanel.add(new JLabel(String.valueOf(A_pos)));

        jPanel.add(new JLabel("A- :"));
        jPanel.add(new JLabel(String.valueOf(A_neg)));

        jPanel.add(new JLabel("B+ :"));
        jPanel.add(new JLabel(String.valueOf(B_pos)));

        jPanel.add(new JLabel("B- :"));
        jPanel.add(new JLabel(String.valueOf(B_neg)));

        jPanel.add(new JLabel("AB+ :"));
        jPanel.add(new JLabel(String.valueOf(AB_pos)));

        jPanel.add(new JLabel("AB- :"));
        jPanel.add(new JLabel(String.valueOf(AB_neg)));

        jPanel.add(new JLabel("O+ :"));
        jPanel.add(new JLabel(String.valueOf(O_pos)));

        jPanel.add(new JLabel("O- :"));
        jPanel.add(new JLabel(String.valueOf(O_neg)));

        
        jPanel.revalidate();
        jPanel.repaint();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new BloodBank().setVisible(true));
    }

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private JPanel jPanel;
    private JScrollPane jScrollPane;
}

