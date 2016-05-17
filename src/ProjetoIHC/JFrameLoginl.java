
package ProjetoIHC;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFrameLoginl extends javax.swing.JFrame {

   
    public JFrameLoginl() {
        super("Login - Constru MaX");
        setIcon();
        initComponents();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackageImagems/sair.png"))); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, -1));

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBox1.setText("Lembrar Senha");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackageImagems/ok.png"))); // NOI18N
        jButton1.setText("Conectar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 110, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Usuário:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        pfSenha.setForeground(new java.awt.Color(204, 204, 204));
        pfSenha.setText("123456");
        pfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfSenhaMouseClicked(evt);
            }
        });
        pfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });
        pfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(pfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackageImagems/Login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Usuario padrão: admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        tfUsuario.setText("Usuario");
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsuarioMouseClicked(evt);
            }
        });
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        tfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsuarioFocusGained(evt);
            }
        });
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 160, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setText("Senha Padrão: 123456");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed

        
    }//GEN-LAST:event_pfSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
                  
        if(tfUsuario.getText().equals("admin") && 
            new String (pfSenha.getPassword()).equals("123456")){
        dispose();
        new JFrameInicio().setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
    }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfSenhaMouseClicked
        pfSenha.setText("");
        if(tfUsuario.getText().equals("")){
            tfUsuario.setText("Usuario");
            
        }
    }//GEN-LAST:event_pfSenhaMouseClicked

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
       
        
        
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsuarioFocusGained
       //jTextField1.setText(null);
    }//GEN-LAST:event_tfUsuarioFocusGained

    private void tfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMouseClicked
       tfUsuario.setText("");
    }//GEN-LAST:event_tfUsuarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void pfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(tfUsuario.getText().equals("admin") && 
            new String (pfSenha.getPassword()).equals("123456")){
        dispose();
        new JFrameInicio().setVisible(true);
        } else {
        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
        }
        }
    }//GEN-LAST:event_pfSenhaKeyPressed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        int i = new Integer(jCheckBox1.getX());
        if(i!=0){
           tfUsuario.setText("admin");
           pfSenha.setText("123456");
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void tfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(tfUsuario.getText().equals("admin") && 
            new String (pfSenha.getPassword()).equals("123456")){
        dispose();
        new JFrameInicio().setVisible(true);
        } else {
        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
        }
        }
    }//GEN-LAST:event_tfUsuarioKeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFrameLoginl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLoginl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLoginl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/newpackageImagems/LOGO2.jpg")).getImage()); 
    }
}
