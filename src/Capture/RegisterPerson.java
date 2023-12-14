
package Capture;

/**
 *
 * @author makss
 */
public class RegisterPerson extends javax.swing.JFrame {
    
    User.ConnectDB conn = new User.ConnectDB();
    User.ControlPerson cod;
    User.ModelPerson mod;
    
    public RegisterPerson() {
        initComponents();
        showIDUser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_id_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtWantedArt = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDob = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Реєстрація особи");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_label.setText("1");
        jPanel2.add(txt_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 550, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtWantedArt.setToolTipText("");
        jPanel3.add(txtWantedArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 210, -1));

        txtFatherName.setToolTipText("");
        jPanel3.add(txtFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        txtFirstName.setToolTipText("");
        jPanel3.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        txtLastName.setToolTipText("");
        jPanel3.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Ім'я");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Розшук за статею КК");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Прізвище");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("По-батькові");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Дата народження");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        txtPob.setToolTipText("");
        jPanel3.add(txtPob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Місце народження");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Далі");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        try {
            txtDob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 210, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 550, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        setSize(new java.awt.Dimension(590, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cod = new User.ControlPerson();
        mod = new User.ModelPerson();
        mod.setFirstName(txtFirstName.getText());
        mod.setLastName(txtLastName.getText());
        mod.setFatherName(txtFatherName.getText());
        mod.setdOb(txtDob.getText());
        mod.setpOb(txtPob.getText());
        mod.setWantedArticle(txtWantedArt.getText());
        cod.insert(mod);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JFormattedTextField txtDob;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPob;
    private javax.swing.JTextField txtWantedArt;
    private javax.swing.JLabel txt_id_label;
    // End of variables declaration//GEN-END:variables

    private void showIDUser() {
        conn.connect();
        try{
            conn.executeSQL("SELECT * FROM person ORDER BY id DESC LIMIT 1");
            conn.rs.first();
            txt_id_label.setText(String.valueOf(conn.rs.getInt("id")));
            int id = Integer.parseInt(txt_id_label.getText());
            id++;
            txt_id_label.setText(String.valueOf(id));
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

}
