/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maquetage;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Wolf
 */
public class ModifierProfil extends javax.swing.JFrame {

    /**
     * Creates new form ModifierProfil
     */
    public ModifierProfil() {
        initComponents();
        this.setTitle("TEX: Tunisian EXchange services (Modifier profil)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTokensModifierProfil = new javax.swing.JLabel();
        lbModifierProfil = new javax.swing.JLabel();
        btEnregistrerModificationModifierProfil = new javax.swing.JButton();
        pnInformationsGenerales = new javax.swing.JPanel();
        lbNomModifierProfil = new javax.swing.JLabel();
        tfNomModifierProfil = new javax.swing.JTextField();
        tfPrenomModifierProfil = new javax.swing.JTextField();
        lbPrenomModifierProfil = new javax.swing.JLabel();
        tfEmailModifierProfil = new javax.swing.JTextField();
        tfTelephoneModifierProfil = new javax.swing.JTextField();
        lbTelephoneModifierProfil = new javax.swing.JLabel();
        tfLoginModifierProfil = new javax.swing.JTextField();
        lbLoginModifierProfil = new javax.swing.JLabel();
        lbMDPModifierProfil = new javax.swing.JLabel();
        tfMDPModifierProfil = new javax.swing.JPasswordField();
        lbAdresseModifierProfil = new javax.swing.JLabel();
        tfAdresseModifierProfil = new javax.swing.JTextField();
        lbEmailModifierProfil = new javax.swing.JLabel();
        lbLienTokensModifierProfil = new javax.swing.JLabel();
        lbPhotoProfilModifierProfil = new javax.swing.JLabel();
        btModifierPhotoProfil = new javax.swing.JButton();
        spCompetenceModifierProfil = new javax.swing.JScrollPane();
        lsCompetencesModifierProfil = new javax.swing.JList();
        lbCompetencesModifierProfil = new javax.swing.JLabel();
        cbCompetencesModifierProfil = new javax.swing.JComboBox();
        btAjouterCompetenceModifierProfil = new javax.swing.JButton();
        lbBackgroundModifierProfil = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(650, 490));
        setPreferredSize(new java.awt.Dimension(650, 490));
        getContentPane().setLayout(null);

        lbTokensModifierProfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tokens", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(lbTokensModifierProfil);
        lbTokensModifierProfil.setBounds(470, 11, 129, 58);

        lbModifierProfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbModifierProfil.setText("Modifier Profil");
        getContentPane().add(lbModifierProfil);
        lbModifierProfil.setBounds(70, 70, 138, 25);

        btEnregistrerModificationModifierProfil.setText("Enregistrer les modifications");
        getContentPane().add(btEnregistrerModificationModifierProfil);
        btEnregistrerModificationModifierProfil.setBounds(270, 420, 167, 23);

        pnInformationsGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informations générales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnInformationsGenerales.setOpaque(false);

        lbNomModifierProfil.setText("Nom :");

        tfNomModifierProfil.setText("Nom_Utilisateur");
        tfNomModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomModifierProfilActionPerformed(evt);
            }
        });

        tfPrenomModifierProfil.setText("Prenom_Utilisateur");
        tfPrenomModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrenomModifierProfilActionPerformed(evt);
            }
        });

        lbPrenomModifierProfil.setText("Prénom :");

        tfEmailModifierProfil.setText("Email_Utilisateur");
        tfEmailModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailModifierProfilActionPerformed(evt);
            }
        });

        tfTelephoneModifierProfil.setText("Numero_Utilisateur");
        tfTelephoneModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelephoneModifierProfilActionPerformed(evt);
            }
        });

        lbTelephoneModifierProfil.setText("Téléphone :");

        tfLoginModifierProfil.setText("Login_Utilisateur");
        tfLoginModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginModifierProfilActionPerformed(evt);
            }
        });

        lbLoginModifierProfil.setText("Login :");

        lbMDPModifierProfil.setText("Mot de passe :");

        tfMDPModifierProfil.setText("jPasswordField1");

        lbAdresseModifierProfil.setText("Adresse :");

        tfAdresseModifierProfil.setText("Adresse_Utilisateur");
        tfAdresseModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAdresseModifierProfilActionPerformed(evt);
            }
        });

        lbEmailModifierProfil.setText("Email :");

        javax.swing.GroupLayout pnInformationsGeneralesLayout = new javax.swing.GroupLayout(pnInformationsGenerales);
        pnInformationsGenerales.setLayout(pnInformationsGeneralesLayout);
        pnInformationsGeneralesLayout.setHorizontalGroup(
            pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformationsGeneralesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAdresseModifierProfil)
                    .addComponent(lbMDPModifierProfil)
                    .addComponent(lbLoginModifierProfil)
                    .addComponent(lbTelephoneModifierProfil)
                    .addComponent(lbEmailModifierProfil)
                    .addComponent(lbPrenomModifierProfil)
                    .addComponent(lbNomModifierProfil))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPrenomModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmailModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelephoneModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLoginModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMDPModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAdresseModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnInformationsGeneralesLayout.setVerticalGroup(
            pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformationsGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomModifierProfil)
                    .addComponent(tfNomModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPrenomModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrenomModifierProfil))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmailModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmailModifierProfil))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelephoneModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelephoneModifierProfil))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLoginModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoginModifierProfil))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMDPModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMDPModifierProfil))
                .addGap(18, 18, 18)
                .addGroup(pnInformationsGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAdresseModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdresseModifierProfil))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(pnInformationsGenerales);
        pnInformationsGenerales.setBounds(60, 100, 380, 310);

        lbLienTokensModifierProfil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLienTokensModifierProfil.setText("Obtenir plus de Tokens");
        getContentPane().add(lbLienTokensModifierProfil);
        lbLienTokensModifierProfil.setBounds(470, 80, 129, 14);

        lbPhotoProfilModifierProfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wolf\\Desktop\\Maquetage\\src\\Images\\Avatar.png")); // NOI18N
        lbPhotoProfilModifierProfil.setText("Photo de profil");
        lbPhotoProfilModifierProfil.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(lbPhotoProfilModifierProfil);
        lbPhotoProfilModifierProfil.setBounds(500, 100, 85, 81);

        btModifierPhotoProfil.setText("Modifier photo de profil");
        btModifierPhotoProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifierPhotoProfilActionPerformed(evt);
            }
        });
        getContentPane().add(btModifierPhotoProfil);
        btModifierPhotoProfil.setBounds(480, 200, 143, 23);

        spCompetenceModifierProfil.setOpaque(false);

        lsCompetencesModifierProfil.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        lsCompetencesModifierProfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lsCompetencesModifierProfil.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Compétence 1", "Compétence 2", "Compétence 3", "Compétence 4", "Compétence 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spCompetenceModifierProfil.setViewportView(lsCompetencesModifierProfil);

        getContentPane().add(spCompetenceModifierProfil);
        spCompetenceModifierProfil.setBounds(490, 270, 121, 85);

        lbCompetencesModifierProfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCompetencesModifierProfil.setText("Compétences");
        getContentPane().add(lbCompetencesModifierProfil);
        lbCompetencesModifierProfil.setBounds(510, 240, 82, 15);

        cbCompetencesModifierProfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "compétence 5", "compétence 6", "compétence 7", "compétence 8" }));
        getContentPane().add(cbCompetencesModifierProfil);
        cbCompetencesModifierProfil.setBounds(500, 370, 92, 20);

        btAjouterCompetenceModifierProfil.setText("Ajouter Compétence");
        btAjouterCompetenceModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjouterCompetenceModifierProfilActionPerformed(evt);
            }
        });
        getContentPane().add(btAjouterCompetenceModifierProfil);
        btAjouterCompetenceModifierProfil.setBounds(490, 410, 131, 23);

        lbBackgroundModifierProfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wolf\\Desktop\\Maquetage\\src\\Images\\fond1.png")); // NOI18N
        getContentPane().add(lbBackgroundModifierProfil);
        lbBackgroundModifierProfil.setBounds(0, 0, 650, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAdresseModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAdresseModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAdresseModifierProfilActionPerformed

    private void tfLoginModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginModifierProfilActionPerformed

    private void tfTelephoneModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelephoneModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelephoneModifierProfilActionPerformed

    private void tfEmailModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailModifierProfilActionPerformed

    private void tfPrenomModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrenomModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrenomModifierProfilActionPerformed

    private void tfNomModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomModifierProfilActionPerformed

    private void btAjouterCompetenceModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjouterCompetenceModifierProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAjouterCompetenceModifierProfilActionPerformed

    private void btModifierPhotoProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifierPhotoProfilActionPerformed
        ModifierPhoto modifPhoto = new ModifierPhoto();
        modifPhoto.setVisible(true);
    }//GEN-LAST:event_btModifierPhotoProfilActionPerformed

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
            java.util.logging.Logger.getLogger(ModifierProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifierProfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ModifierProfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ModifierProfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ModifierProfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierProfil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjouterCompetenceModifierProfil;
    private javax.swing.JButton btEnregistrerModificationModifierProfil;
    private javax.swing.JButton btModifierPhotoProfil;
    private javax.swing.JComboBox cbCompetencesModifierProfil;
    private javax.swing.JLabel lbAdresseModifierProfil;
    private javax.swing.JLabel lbBackgroundModifierProfil;
    private javax.swing.JLabel lbCompetencesModifierProfil;
    private javax.swing.JLabel lbEmailModifierProfil;
    private javax.swing.JLabel lbLienTokensModifierProfil;
    private javax.swing.JLabel lbLoginModifierProfil;
    private javax.swing.JLabel lbMDPModifierProfil;
    private javax.swing.JLabel lbModifierProfil;
    private javax.swing.JLabel lbNomModifierProfil;
    private javax.swing.JLabel lbPhotoProfilModifierProfil;
    private javax.swing.JLabel lbPrenomModifierProfil;
    private javax.swing.JLabel lbTelephoneModifierProfil;
    private javax.swing.JLabel lbTokensModifierProfil;
    private javax.swing.JList lsCompetencesModifierProfil;
    private javax.swing.JPanel pnInformationsGenerales;
    private javax.swing.JScrollPane spCompetenceModifierProfil;
    private javax.swing.JTextField tfAdresseModifierProfil;
    private javax.swing.JTextField tfEmailModifierProfil;
    private javax.swing.JTextField tfLoginModifierProfil;
    private javax.swing.JPasswordField tfMDPModifierProfil;
    private javax.swing.JTextField tfNomModifierProfil;
    private javax.swing.JTextField tfPrenomModifierProfil;
    private javax.swing.JTextField tfTelephoneModifierProfil;
    // End of variables declaration//GEN-END:variables
}
