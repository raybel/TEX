/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maquetage;

/**
 *
 * @author Wolf
 */
public class Connexion extends javax.swing.JFrame {

    /**
     * Creates new form Connexion
     */
    public Connexion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSinscrire = new javax.swing.JButton();
        AuthenticateField = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        btSeConnecter = new javax.swing.JButton();
        TexIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btSinscrireConnexion = new javax.swing.JButton();
        pnAuthentification = new javax.swing.JPanel();
        lbLoginConnexion = new javax.swing.JLabel();
        lbMotDePasseConnexion = new javax.swing.JLabel();
        tfLoginConnexion = new javax.swing.JTextField();
        psMotDePasseConnexion = new javax.swing.JPasswordField();
        btSeConnecterConnexion = new javax.swing.JButton();
        lbIconeTEX = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        btSinscrire.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btSinscrire.setForeground(new java.awt.Color(68, 0, 238));
        btSinscrire.setText("S'inscrire");
        btSinscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSinscrireActionPerformed(evt);
            }
        });

        AuthenticateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LoginLabel.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(241, 0, 48));
        LoginLabel.setText("Login:");

        PasswordLabel.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(241, 0, 48));
        PasswordLabel.setText("Mot de passe");

        LoginTextField.setBackground(new java.awt.Color(240, 240, 240));
        LoginTextField.setForeground(new java.awt.Color(0, 0, 255));
        LoginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTextFieldActionPerformed(evt);
            }
        });

        PasswordTextField.setBackground(new java.awt.Color(240, 240, 240));
        PasswordTextField.setForeground(new java.awt.Color(0, 0, 255));
        PasswordTextField.setText("jPasswordField1");
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });

        btSeConnecter.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btSeConnecter.setForeground(new java.awt.Color(68, 0, 238));
        btSeConnecter.setText("Se Connecter");
        btSeConnecter.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btSeConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeConnecterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AuthenticateFieldLayout = new javax.swing.GroupLayout(AuthenticateField);
        AuthenticateField.setLayout(AuthenticateFieldLayout);
        AuthenticateFieldLayout.setHorizontalGroup(
            AuthenticateFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthenticateFieldLayout.createSequentialGroup()
                .addGroup(AuthenticateFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AuthenticateFieldLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btSeConnecter))
                    .addGroup(AuthenticateFieldLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AuthenticateFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AuthenticateFieldLayout.createSequentialGroup()
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AuthenticateFieldLayout.createSequentialGroup()
                                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(LoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        AuthenticateFieldLayout.setVerticalGroup(
            AuthenticateFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthenticateFieldLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(AuthenticateFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLabel)
                    .addComponent(LoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(AuthenticateFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btSeConnecter))
        );

        TexIcon.setText("TexIcon");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(688, 450));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);

        btSinscrireConnexion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btSinscrireConnexion.setForeground(new java.awt.Color(68, 0, 238));
        btSinscrireConnexion.setText("S'inscrire");
        btSinscrireConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSinscrireConnexionActionPerformed(evt);
            }
        });

        pnAuthentification.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAuthentification.setOpaque(false);

        lbLoginConnexion.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        lbLoginConnexion.setForeground(new java.awt.Color(241, 0, 48));
        lbLoginConnexion.setText("Login:");

        lbMotDePasseConnexion.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        lbMotDePasseConnexion.setForeground(new java.awt.Color(241, 0, 48));
        lbMotDePasseConnexion.setText("Mot de passe:");

        tfLoginConnexion.setBackground(new java.awt.Color(240, 240, 240));
        tfLoginConnexion.setForeground(new java.awt.Color(0, 0, 255));
        tfLoginConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginConnexionActionPerformed(evt);
            }
        });

        psMotDePasseConnexion.setBackground(new java.awt.Color(240, 240, 240));
        psMotDePasseConnexion.setForeground(new java.awt.Color(0, 0, 255));
        psMotDePasseConnexion.setText("jPasswordField1");
        psMotDePasseConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psMotDePasseConnexionActionPerformed(evt);
            }
        });

        btSeConnecterConnexion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btSeConnecterConnexion.setForeground(new java.awt.Color(68, 0, 238));
        btSeConnecterConnexion.setText("Se Connecter");
        btSeConnecterConnexion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btSeConnecterConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeConnecterConnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAuthentificationLayout = new javax.swing.GroupLayout(pnAuthentification);
        pnAuthentification.setLayout(pnAuthentificationLayout);
        pnAuthentificationLayout.setHorizontalGroup(
            pnAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAuthentificationLayout.createSequentialGroup()
                .addGroup(pnAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAuthentificationLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btSeConnecterConnexion))
                    .addGroup(pnAuthentificationLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnAuthentificationLayout.createSequentialGroup()
                                .addComponent(lbMotDePasseConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(psMotDePasseConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnAuthentificationLayout.createSequentialGroup()
                                .addComponent(lbLoginConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(tfLoginConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        pnAuthentificationLayout.setVerticalGroup(
            pnAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAuthentificationLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLoginConnexion)
                    .addComponent(tfLoginConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMotDePasseConnexion)
                    .addComponent(psMotDePasseConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btSeConnecterConnexion))
        );

        lbIconeTEX.setText("TexIcon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIconeTEX, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnAuthentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btSinscrireConnexion)))
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addComponent(lbIconeTEX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnAuthentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btSinscrireConnexion)
                .addGap(0, 85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 630, 428);

        lbBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wolf\\Desktop\\Maquetage\\src\\Images\\fond1.png")); // NOI18N
        getContentPane().add(lbBackground);
        lbBackground.setBounds(0, 0, 650, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSinscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSinscrireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSinscrireActionPerformed

    private void LoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void btSeConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeConnecterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSeConnecterActionPerformed

    private void btSinscrireConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSinscrireConnexionActionPerformed
        FormulaireInscription fi = new FormulaireInscription();
        fi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btSinscrireConnexionActionPerformed

    private void tfLoginConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginConnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginConnexionActionPerformed

    private void psMotDePasseConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psMotDePasseConnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psMotDePasseConnexionActionPerformed

    private void btSeConnecterConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeConnecterConnexionActionPerformed
        Interface1 accueil = new Interface1();
        accueil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btSeConnecterConnexionActionPerformed

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AuthenticateField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField LoginTextField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel TexIcon;
    private javax.swing.JButton btSeConnecter;
    private javax.swing.JButton btSeConnecterConnexion;
    private javax.swing.JButton btSinscrire;
    private javax.swing.JButton btSinscrireConnexion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbIconeTEX;
    private javax.swing.JLabel lbLoginConnexion;
    private javax.swing.JLabel lbMotDePasseConnexion;
    private javax.swing.JPanel pnAuthentification;
    private javax.swing.JPasswordField psMotDePasseConnexion;
    private javax.swing.JTextField tfLoginConnexion;
    // End of variables declaration//GEN-END:variables
}
