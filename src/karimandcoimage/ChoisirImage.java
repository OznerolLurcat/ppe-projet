/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karimandcoimage;

import com.karimandco.mdp.JPanelConnexionNum;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.io.InputStream;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author metac
 */
public class ChoisirImage extends javax.swing.JPanel {

    /**
     * Creates new form ChoisirImage
     */
    DaoSIO connexion;
    JFileChooser fichier;
    InputStream stream;
    InputStream imagePrint;
    File file;

    public ChoisirImage() {
        initComponents();
        try {
            this.connexion = DaoSIO.getInstance();
        } catch (Exception e) {
            this.connexion = null;
        }
        fichier = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Images Uniquement", "jpg", "bmp", "jpeg", "png");
        fichier.setFileFilter(filter);
        stream = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSelectFile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelImages = new javax.swing.JLabel();
        jButtonSend = new javax.swing.JButton();
        jLabelSuccess = new javax.swing.JLabel();
        jLabelSelect = new javax.swing.JLabel();

        jButtonSelectFile.setText("Choisir l'image");
        jButtonSelectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSelectFileMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImages, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImages, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonSend.setText("Envoyer l'image");
        jButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendMouseClicked(evt);
            }
        });

        jLabelSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuccess.setText("...");

        jLabelSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSelect.setText("Aucun fichier sélectionné");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSuccess)
                        .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jButtonSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelSuccess))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(52, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelectFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelectFileMouseClicked
        this.file = null;
        int returnval = fichier.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            this.file = fichier.getSelectedFile();
            encodeToBlob();
            String pathFichier = this.file.getAbsolutePath();
            jLabelSelect.setText(pathFichier);
            try {
                byte[] imagebyte = new byte[stream.available()];
                imagePrint.read(imagebyte);
                //  Lire le Blob en tableau
                //  Convertion du tableau en image
                ImageIcon imageFini = new ImageIcon(new ImageIcon(imagebyte).getImage().getScaledInstance(250, -1, 0));
                jLabelImages.setIcon(imageFini);
            } catch (Exception e) {
                //Echec de la convertion
                System.out.println(e);;
            }

        }
    }//GEN-LAST:event_jButtonSelectFileMouseClicked

    private void jButtonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendMouseClicked
        try {
            this.connexion = DaoSIO.getInstance();
        } catch (Exception e) {
            this.connexion = null;
        }
        DaoSIOrequest daoReq = new DaoSIOrequest();
        com.karimandco.bdd.DaoSIO connexion = com.karimandco.bdd.DaoSIO.getInstance();
                String idutil = com.karimandco.mdp.JPanelConnexionNum.idUtilisater;
                ResultSet idu = connexion.requeteSelection("SELECT id FROM utilisateurs WHERE identifiant='"+idutil+"'");
        try {
            while(idu.next()){
                int id = idu.getInt(1);
                System.out.println(id);
                JPanelConnexionNum.idUtilisateur=id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChoisirImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.connexion.connexionActive()) {
            if (stream != null) {
                if (file.length() <= 3000000) {
                    String req = "select photo from utilisateurs where identifiant='"+idutil+"'";
                    System.out.println(JPanelConnexionNum.idUtilisateur+"8888888888888888888888888888888888888888888888888888888888888888888");

                    try {
                        ResultSet lesTuples = daoReq.requeteSelection(req);
                        if (lesTuples.next()) {
                            Integer update = daoReq.updateImage(stream, file);
                            if (update == 1) {
                                jLabelSuccess.setForeground(Color.green);
                                jLabelSuccess.setText("Image modifié !");
                            } else {
                                jLabelSuccess.setForeground(Color.red);
                                jLabelSuccess.setText("Echec de la modification !");
                            }
                        } else {
                            //                        System.out.println("rien n'est retouré....");
                            //                     juste pour avoir la date
                            java.util.Date date = new java.util.Date();
                            java.sql.Date today = new java.sql.Date(date.getTime());
                            //                    Échantillons test
//                            String reqIn = ("insert into utilisateurs values (null,0,'a','b','c','d','e','f'," + today + ",x'" + (InputStream) stream + "')");

                            Integer create = daoReq.insertImage(0, "a", "b", "c", "d", "e", "f", today, stream, file);
                            if (create == 1) {
                                jLabelSuccess.setForeground(Color.green);
                                jLabelSuccess.setText("Image enregistrée !");
                            } else {
                                jLabelSuccess.setForeground(Color.red);
                                jLabelSuccess.setText("Echec de l'enregistrement !");
                            }
                        }

                    } catch (SQLException ex) {
                        jLabelSuccess.setForeground(Color.red);
                        jLabelSuccess.setText("Echec du chargement, l'éxécution de la requête est un échec !!");
                        //  Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println(ex);
                    }
                } else {
                    jLabelSuccess.setForeground(Color.orange);
                    jLabelSuccess.setText("Image trop lourde !!");
                }
            } else {
                jLabelSuccess.setForeground(Color.red);
                jLabelSuccess.setText("Veuillez sélectionner une image !!");
            }
        } else {
            jLabelSuccess.setText("La connexion n'est pas active");
        }
    }//GEN-LAST:event_jButtonSendMouseClicked

    public void encodeToBlob() {
        try {
            this.stream = new FileInputStream(file);
            this.imagePrint = new FileInputStream(file);
//            Essai d'un code qui nous permettait d'obtenir l'image en base64 mais pas de l'envoyer.
//            byte[] bytes = new byte[(int)file.length()];
//            fileInputstreamReader.read(bytes);
//            encodedFile = new String(Base64.getEncoder().encode(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame test = new JFrame();
        ChoisirImage pannel = new ChoisirImage();
        test.getContentPane().add(pannel);
        test.setSize(800, 600);
        test.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelectFile;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabelImages;
    private javax.swing.JLabel jLabelSelect;
    private javax.swing.JLabel jLabelSuccess;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
