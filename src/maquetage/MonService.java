/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maquetage;

import java.awt.Dimension;

/**
 *
 * @author Wolf
 */
public class MonService extends javax.swing.JFrame {

    /**
     * Creates new form MonService
     */
    public MonService() {
        initComponents();
        /*jPanel2.setSize(613, 121);
        jLabel14.setSize(572, 89);*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMonService = new javax.swing.JPanel();
        lbMesTokensMonService = new javax.swing.JLabel();
        lbLienObtenirTokensMonService = new javax.swing.JLabel();
        lbTitrePublicationMonService = new javax.swing.JLabel();
        lbParMonService = new javax.swing.JLabel();
        lbNomEtPrenomMonService = new javax.swing.JLabel();
        lbDatePublicationMonService = new javax.swing.JLabel();
        lbDateDemandeeMonService = new javax.swing.JLabel();
        ffDatePublicationMonService = new javax.swing.JFormattedTextField();
        ffDateDemandeeMonService = new javax.swing.JFormattedTextField();
        lbTokensDemandesMonService = new javax.swing.JLabel();
        lbCategorieMonService = new javax.swing.JLabel();
        lbRegionMonService = new javax.swing.JLabel();
        pnDescriptionMonService = new javax.swing.JPanel();
        lbDescriptionMonService = new javax.swing.JLabel();
        pnPhotosMonService = new javax.swing.JPanel();
        lbPhoto1MonService = new javax.swing.JLabel();
        lbPhoto2MonService = new javax.swing.JLabel();
        lbPhoto3MonService = new javax.swing.JLabel();
        spPostulantsMonService = new javax.swing.JScrollPane();
        tbPostulantsMonService = new javax.swing.JTable();
        lbBackgroundMonService = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(650, 490));
        setPreferredSize(new java.awt.Dimension(650, 490));
        getContentPane().setLayout(null);

        pnMonService.setOpaque(false);

        lbMesTokensMonService.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mes Tokens", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lbLienObtenirTokensMonService.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLienObtenirTokensMonService.setText("Obtenir plus de Tokens");

        lbTitrePublicationMonService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitrePublicationMonService.setText("Titre: Ma publication");

        lbParMonService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbParMonService.setText("par :");

        lbNomEtPrenomMonService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNomEtPrenomMonService.setText("Mon nom et Prenom");

        lbDatePublicationMonService.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDatePublicationMonService.setText("Date de publication :");

        lbDateDemandeeMonService.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDateDemandeeMonService.setText("Date demandée :");

        ffDatePublicationMonService.setText(".. / .. / ..");

        ffDateDemandeeMonService.setText(".. / .. / ..");

        lbTokensDemandesMonService.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTokensDemandesMonService.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tokens demandés", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lbCategorieMonService.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCategorieMonService.setText("Catégorie");
        lbCategorieMonService.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbRegionMonService.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbRegionMonService.setText("Région");
        lbRegionMonService.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnDescriptionMonService.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Description", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pnDescriptionMonService.setOpaque(false);

        lbDescriptionMonService.setText("Desciption Desciption Desciption Desciption Description Description");
        lbDescriptionMonService.setMinimumSize(new java.awt.Dimension(25, 14));

        javax.swing.GroupLayout pnDescriptionMonServiceLayout = new javax.swing.GroupLayout(pnDescriptionMonService);
        pnDescriptionMonService.setLayout(pnDescriptionMonServiceLayout);
        pnDescriptionMonServiceLayout.setHorizontalGroup(
            pnDescriptionMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescriptionMonServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDescriptionMonService, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnDescriptionMonServiceLayout.setVerticalGroup(
            pnDescriptionMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDescriptionMonServiceLayout.createSequentialGroup()
                .addComponent(lbDescriptionMonService, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPhotosMonService.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Photos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pnPhotosMonService.setOpaque(false);

        lbPhoto1MonService.setText("photo 1");

        lbPhoto2MonService.setText("photo 2");

        lbPhoto3MonService.setText("photo 3");

        javax.swing.GroupLayout pnPhotosMonServiceLayout = new javax.swing.GroupLayout(pnPhotosMonService);
        pnPhotosMonService.setLayout(pnPhotosMonServiceLayout);
        pnPhotosMonServiceLayout.setHorizontalGroup(
            pnPhotosMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhotosMonServiceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbPhoto1MonService, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPhoto2MonService, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPhoto3MonService, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnPhotosMonServiceLayout.setVerticalGroup(
            pnPhotosMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhotosMonServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPhotosMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lbPhoto1MonService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPhoto2MonService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPhoto3MonService, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        spPostulantsMonService.setOpaque(false);

        tbPostulantsMonService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Login", "Nom", "Prenom", "Nombre de services", "Moyenne"
            }
        ));
        spPostulantsMonService.setViewportView(tbPostulantsMonService);

        javax.swing.GroupLayout pnMonServiceLayout = new javax.swing.GroupLayout(pnMonService);
        pnMonService.setLayout(pnMonServiceLayout);
        pnMonServiceLayout.setHorizontalGroup(
            pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMonServiceLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMonServiceLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMonServiceLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lbCategorieMonService)
                                .addGap(18, 18, 18)
                                .addComponent(lbRegionMonService)
                                .addGap(313, 313, 313))
                            .addGroup(pnMonServiceLayout.createSequentialGroup()
                                .addComponent(lbDatePublicationMonService)
                                .addGap(20, 20, 20)
                                .addComponent(ffDatePublicationMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDateDemandeeMonService)
                                .addGap(29, 29, 29)
                                .addComponent(ffDateDemandeeMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnMonServiceLayout.createSequentialGroup()
                        .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spPostulantsMonService)
                            .addGroup(pnMonServiceLayout.createSequentialGroup()
                                .addComponent(pnDescriptionMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(pnPhotosMonService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnMonServiceLayout.createSequentialGroup()
                                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMonServiceLayout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(lbNomEtPrenomMonService))
                                    .addGroup(pnMonServiceLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(lbTitrePublicationMonService)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbParMonService)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMonServiceLayout.createSequentialGroup()
                                        .addComponent(lbTokensDemandesMonService, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMesTokensMonService, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addComponent(lbLienObtenirTokensMonService, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        pnMonServiceLayout.setVerticalGroup(
            pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMonServiceLayout.createSequentialGroup()
                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMonServiceLayout.createSequentialGroup()
                        .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitrePublicationMonService)
                            .addComponent(lbParMonService))
                        .addGap(18, 18, 18)
                        .addComponent(lbNomEtPrenomMonService))
                    .addComponent(lbTokensDemandesMonService, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMesTokensMonService, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLienObtenirTokensMonService)
                    .addComponent(lbDateDemandeeMonService)
                    .addComponent(lbDatePublicationMonService)
                    .addComponent(ffDatePublicationMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffDateDemandeeMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRegionMonService)
                    .addComponent(lbCategorieMonService))
                .addGap(17, 17, 17)
                .addGroup(pnMonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnDescriptionMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPhotosMonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(spPostulantsMonService, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(pnMonService);
        pnMonService.setBounds(10, 20, 630, 428);

        lbBackgroundMonService.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wolf\\Desktop\\Maquetage\\src\\Images\\fond1.png")); // NOI18N
        lbBackgroundMonService.setText("jLabel13");
        getContentPane().add(lbBackgroundMonService);
        lbBackgroundMonService.setBounds(0, 0, 650, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(MonService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonService().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ffDateDemandeeMonService;
    private javax.swing.JFormattedTextField ffDatePublicationMonService;
    private javax.swing.JLabel lbBackgroundMonService;
    private javax.swing.JLabel lbCategorieMonService;
    private javax.swing.JLabel lbDateDemandeeMonService;
    private javax.swing.JLabel lbDatePublicationMonService;
    private javax.swing.JLabel lbDescriptionMonService;
    private javax.swing.JLabel lbLienObtenirTokensMonService;
    private javax.swing.JLabel lbMesTokensMonService;
    private javax.swing.JLabel lbNomEtPrenomMonService;
    private javax.swing.JLabel lbParMonService;
    private javax.swing.JLabel lbPhoto1MonService;
    private javax.swing.JLabel lbPhoto2MonService;
    private javax.swing.JLabel lbPhoto3MonService;
    private javax.swing.JLabel lbRegionMonService;
    private javax.swing.JLabel lbTitrePublicationMonService;
    private javax.swing.JLabel lbTokensDemandesMonService;
    private javax.swing.JPanel pnDescriptionMonService;
    private javax.swing.JPanel pnMonService;
    private javax.swing.JPanel pnPhotosMonService;
    private javax.swing.JScrollPane spPostulantsMonService;
    private javax.swing.JTable tbPostulantsMonService;
    // End of variables declaration//GEN-END:variables
}
