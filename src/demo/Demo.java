
package main;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class AreaCalcutatorOfShape extends javax.swing.JFrame {

    public AreaCalcutatorOfShape() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbShape = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblInput1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblInput2 = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        cmbCompute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Area Calculator of Shape");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 0, 460, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Select Shape :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 70, 140, 30);

        cmbShape.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbShape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangle", "Square", "Triangle", "Circle", "Parallelogram" }));
        cmbShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbShapeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbShape);
        cmbShape.setBounds(350, 70, 150, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 730, 110);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(null);

        lblInput1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblInput1.setText("Enter ");
        jPanel2.add(lblInput1);
        lblInput1.setBounds(110, 40, 300, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("Computed Area");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 190, 310, 40);

        lblInput2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblInput2.setText("Enter");
        jPanel2.add(lblInput2);
        lblInput2.setBounds(110, 120, 300, 40);

        txtInput1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(txtInput1);
        txtInput1.setBounds(420, 30, 190, 50);

        txtInput2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(txtInput2);
        txtInput2.setBounds(420, 110, 190, 50);

        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(txtResult);
        txtResult.setBounds(420, 180, 190, 50);

        cmbCompute.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbCompute.setText("Computed Area");
        cmbCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComputeActionPerformed(evt);
            }
        });
        jPanel2.add(cmbCompute);
        cmbCompute.setBounds(270, 270, 180, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 130, 730, 330);

        pack();
    }// </editor-fold>                        

    private void cmbComputeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
       try {
           
        if (cmbShape.getSelectedItem().equals ("Rectangle"))
        {
            double area = Double.parseDouble(txtInput1.getText()) * Double.parseDouble(txtInput2.getText());
            txtResult.setText(area+"");        
                    
        }
        else if (cmbShape.getSelectedItem().equals ("Square"))
        {
            double area =  Double.parseDouble(txtInput1.getText()) * Double.parseDouble(txtInput1.getText());
            txtResult.setText(area+"");        
                    
        }
        else if (cmbShape.getSelectedItem().equals ("Triangle"))
        {
            double area = .5 * Double.parseDouble(txtInput1.getText()) * Double.parseDouble(txtInput2.getText());
            txtResult.setText(area+"");        
                    
        }
        else if (cmbShape.getSelectedItem().equals ("Circle"))
        {
            double area = 3.14 * Double.parseDouble(txtInput1.getText());   
            txtResult.setText(area+"");        
                    
        }    
        else if (cmbShape.getSelectedItem().equals ("Paralellogram"))
        {
            double area = Double.parseDouble(txtInput1.getText()) * Double.parseDouble(txtInput2.getText());
            txtResult.setText(area+"");        
                    
        }     
        }
        catch (InputMismatchExpection e)
        {
            JOptionPane.showMessageDialog(null,e+"\nInvalid input, please try again. ");                    
        }    
        catch (NumberFormatExpection e)
        {
            JOptionPane.showMessageDialog(null,e+"\nInvalid input, please try again. ");                    
        }    
        
       
       
       
    }                                          

    private void cmbShapeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        if(cmbShape.getSelectedItem().equals("Rectangle"))
        {
          lblInput2.setVisible(true); 
          txtInput2.setVisible(true); 
          lblInput1.setText("Enter Length: "); 
          lblInput1.setText("Enter width: "); 
          
        }
        else if(cmbShape.getSelectedItem().equals("Square"))
        {
          lblInput1.setText("Enter length of sides: "); 
          lblInput1.setVisible(true); 
          lblInput2.setVisible(false); 
          txtInput2.setVisible(false); 
          
        }
         else if(cmbShape.getSelectedItem().equals("Triangle"))
        {
          lblInput2.setVisible(true); 
          txtInput2.setVisible(true); 
          lblInput1.setText("Enter base: ");
          lblInput1.setText("Enter Heights: ");
          
        }
         else if(cmbShape.getSelectedItem().equals("Cicle"))
        {
          lblInput2.setVisible(false); 
          txtInput2.setVisible(false); 
          lblInput1.setText("Enter raduis: ");
          txtInput2.setText(" ");
          
        }
         else if(cmbShape.getSelectedItem().equals("Parallelogram"))
        {
          lblInput2.setVisible(true); 
          txtInput2.setVisible(true); 
          lblInput1.setText("Enter width: ");
          lblInput1.setText("Enter height: ");
          
        }
        
        
        
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaCalcutatorOfShape.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaCalcutatorOfShape.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaCalcutatorOfShape.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaCalcutatorOfShape.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaCalcutatorOfShape().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cmbCompute;
    private javax.swing.JComboBox<String> cmbShape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInput1;
    private javax.swing.JLabel lblInput2;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration                   
}
