package views;

import Controllers.DivisaController;

/**
 *
 * @author angel
 */
public class ConversionDivisas extends javax.swing.JFrame {

    /**
     * Creates new form InputView
     */
    public ConversionDivisas() {
        initComponents();
        setSize(460, 300);
        setTitle("Datos");
        setResizable(false);
        setLocationRelativeTo(null);
        this.repaint();

        //Controlador de la vista
        DivisaController divisa_controller = new DivisaController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_data_divisa = new javax.swing.JTextField();
        btn_continue_data = new javax.swing.JButton();
        btn_back_data = new javax.swing.JButton();
        cmb_currency_conversion_option = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setLabelFor(txt_data_divisa);
        jLabel1.setText("Ingrese la cantidad que desea convertir:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txt_data_divisa.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jPanel1.add(txt_data_divisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, 350, -1));

        btn_continue_data.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btn_continue_data.setText("Ok");
        jPanel1.add(btn_continue_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 25));

        btn_back_data.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btn_back_data.setText("Regresar");
        btn_back_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_dataActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 210, 110, 26));

        cmb_currency_conversion_option.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        cmb_currency_conversion_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a a Won sul-coreano", "De Dolar a Pesos", "De Euros a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sul-coreano a Pesos" }));
        jPanel1.add(cmb_currency_conversion_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 155, 300, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setLabelFor(cmb_currency_conversion_option);
        jLabel2.setText("Elija el tipo de moneda al que desea convertir:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_dataActionPerformed
        MenuView view_menu = new MenuView();
        view_menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_back_dataActionPerformed

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
            java.util.logging.Logger.getLogger(ConversionDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_data;
    public javax.swing.JButton btn_continue_data;
    public javax.swing.JComboBox<String> cmb_currency_conversion_option;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_data_divisa;
    // End of variables declaration//GEN-END:variables
}
