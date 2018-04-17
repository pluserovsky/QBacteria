/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import qbacteria.ExaminedEntity;
import qbacteria.ExaminedList;

/**
 *
 * @author Luk
 */
public class App extends javax.swing.JFrame {

    Object[] options = {"OK",
        "Cancel"};
    Connection con;
    ExaminedList examinedList = new ExaminedList();
    ArrayList<Integer> alphaList = new ArrayList();
    ArrayList<Integer> betaList = new ArrayList();
    ArrayList<Integer> gammaList = new ArrayList();

    /**
     * Creates new form App
     */
    public App() {
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

        connectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examinedTextArea = new javax.swing.JTextArea();
        getExaminedButton = new javax.swing.JButton();
        addExaminationsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        genotypeTextField = new javax.swing.JTextField();
        classTextField = new javax.swing.JTextField();
        addExaminedButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();
        saveXmlButton = new javax.swing.JButton();
        loadXmlButton = new javax.swing.JButton();
        GenerateFTButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QBacteria");
        setLocationByPlatform(true);
        setResizable(false);

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("examined:");

        examinedTextArea.setColumns(20);
        examinedTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        examinedTextArea.setLineWrap(true);
        examinedTextArea.setRows(5);
        examinedTextArea.setTabSize(6);
        examinedTextArea.setMinimumSize(new java.awt.Dimension(4, 10));
        jScrollPane1.setViewportView(examinedTextArea);

        getExaminedButton.setText("Get examined");
        getExaminedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getExaminedButtonActionPerformed(evt);
            }
        });

        addExaminationsButton.setText("Examine more");
        addExaminationsButton.setEnabled(false);
        addExaminationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExaminationsButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Genotype:");

        jLabel3.setText("Class:");

        genotypeTextField.setText("123456");
        genotypeTextField.setToolTipText("6 integers format");

        classTextField.setToolTipText("int char format");

        addExaminedButton.setText("Examine");
        addExaminedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExaminedButtonActionPerformed(evt);
            }
        });

        disconnectButton.setText("Disconnect");
        disconnectButton.setEnabled(false);
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectButtonActionPerformed(evt);
            }
        });

        saveXmlButton.setText("Save to XML");
        saveXmlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveXmlButtonActionPerformed(evt);
            }
        });

        loadXmlButton.setText("Load XML");
        loadXmlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadXmlButtonActionPerformed(evt);
            }
        });

        GenerateFTButton.setText("Generate F&T");
        GenerateFTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateFTButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Status:");

        statusLabel.setText("Connect to database before start.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(genotypeTextField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(classTextField)))
                            .addComponent(loadXmlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveXmlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getExaminedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addExaminationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addExaminedButton)
                            .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(disconnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GenerateFTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(disconnectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getExaminedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addExaminationsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveXmlButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadXmlButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genotypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addExaminedButton)
                            .addComponent(GenerateFTButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        JTextField dbUrlField = new JTextField(20);
        dbUrlField.setText("jdbc:mysql://localhost:3306/qbacteria");
        JTextField dbUserField = new JTextField(10);
        dbUserField.setText("bacteria");
        JPasswordField userPassField = new JPasswordField(10);
        userPassField.setText("pass");

        JPanel myPanel = new JPanel();

        myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
        myPanel.add(new JLabel("Database Address:"));
        myPanel.add(dbUrlField);
        myPanel.add(Box.createVerticalStrut(15)); // a spacer
        myPanel.add(new JLabel("User:"));
        myPanel.add(dbUserField);
        myPanel.add(Box.createVerticalStrut(15));
        myPanel.add(new JLabel("Password:"));
        myPanel.add(userPassField);
        myPanel.add(Box.createVerticalStrut(15));

        //int result = JOptionPane.showConfirmDialog(null, myPanel, "Zaloguj się", JOptionPane.OK_CANCEL_OPTION);
        int result = JOptionPane.showOptionDialog(null, myPanel, "Connect", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (result == JOptionPane.OK_OPTION) {
            try {
                con = DriverManager.getConnection(
                        dbUrlField.getText(), dbUserField.getText(), userPassField.getText());
                Statement stmt = con.createStatement();
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `flagella` (\n"
                        + "  `alpha` INT UNSIGNED NOT NULL,\n"
                        + "  `beta` INT UNSIGNED NOT NULL,\n"
                        + "  `number` INT UNSIGNED NOT NULL)");
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `toughness` (\n"
                        + "  `beta` INT UNSIGNED NOT NULL,\n"
                        + "  `gamma` INT NOT NULL,\n"
                        + "  `rank` CHAR NOT NULL)");
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `examined` (\n"
                        + "  `genotype` INT UNSIGNED NOT NULL,\n"
                        + "  `class` VARCHAR(2) NOT NULL)");
                PreparedStatement pstmt = con.prepareStatement("select alpha from flagella;");
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    alphaList.add(rs.getInt(1));
                }
                pstmt = con.prepareStatement("select beta from flagella;");
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    betaList.add(rs.getInt(1));
                }
                pstmt = con.prepareStatement("select gamma from toughness;");
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    gammaList.add(rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        statusLabel.setText("Connected to database.");
        disconnectButton.setEnabled(true);
    }//GEN-LAST:event_connectButtonActionPerformed

    private void getExaminedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getExaminedButtonActionPerformed
        String output = "Genotype:\tClass:\n";
        try {
            PreparedStatement stmt = con.prepareStatement("select * from examined;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                output += rs.getInt(1) + "\t" + rs.getNString(2) + "\n";
                ExaminedEntity ee = new ExaminedEntity(rs.getInt(1), rs.getNString(2));
                examinedList.add(ee);
            }
            examinedTextArea.setText(output);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_getExaminedButtonActionPerformed

    private void addExaminationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExaminationsButtonActionPerformed
        String genotype;
        String decoded;
        try {
            PreparedStatement examinedPstmt = con.prepareStatement("insert into examined ( `genotype`, `class`) VALUES (?,?)");

            for (int i = 0; i < examinedList.getExaminedEntityList().size(); i++) {
                genotype = String.valueOf(examinedList.getExaminedEntityList().get(i).getGenotype());
                decoded = decodeGenotype(genotype);
                examinedList.getExaminedEntityList().get(i).setClasS(decoded);
                examinedPstmt.setInt(1, Integer.parseInt(genotype));
                examinedPstmt.setString(2, decoded);
                examinedPstmt.addBatch();
            }
            examinedPstmt.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        statusLabel.setText("Examinations from XML calculated.");
    }//GEN-LAST:event_addExaminationsButtonActionPerformed

    private void addExaminedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExaminedButtonActionPerformed
        String genotype = genotypeTextField.getText();

        try {
            String decoded = decodeGenotype(genotype);
            examinedList.add(new ExaminedEntity(Integer.parseInt(genotype), decoded));
            PreparedStatement examinedPstmt = con.prepareStatement("insert into examined ( `genotype`, `class`) VALUES (?,?)");
            examinedPstmt.setInt(1, Integer.parseInt(genotype));
            examinedPstmt.setString(2, decoded);
            examinedPstmt.execute();
            classTextField.setText(decoded);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addExaminedButtonActionPerformed

    private void disconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectButtonActionPerformed
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        statusLabel.setText("Disconnected.");
    }//GEN-LAST:event_disconnectButtonActionPerformed

    private void saveXmlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveXmlButtonActionPerformed
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(ExaminedList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(examinedList, new File("items.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveXmlButtonActionPerformed

    private void loadXmlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadXmlButtonActionPerformed
        File file = new File("items.xml");
        String output = "From XML\nGenotype:\tClass:\n";
        if (file.exists()) {
            JAXBContext jaxbContext;
            try {

                jaxbContext = JAXBContext.newInstance(ExaminedList.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                examinedList = (ExaminedList) jaxbUnmarshaller.unmarshal(file);
            } catch (JAXBException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < examinedList.getExaminedEntityList().size(); i++) {
                output += examinedList.getExaminedEntityList().get(i).getGenotype() + "\t" + examinedList.getExaminedEntityList().get(i).getClasS() + "\n";
            }
            examinedTextArea.setText(output);
        }
        addExaminationsButton.setEnabled(true);
    }//GEN-LAST:event_loadXmlButtonActionPerformed

    private void GenerateFTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateFTButtonActionPerformed
        try {
            PreparedStatement flagellaPstmt = con.prepareStatement("insert into flagella ( `alpha`, `beta`, `number`) VALUES (?,?,?);");
            PreparedStatement toughnessPstmt = con.prepareStatement("insert into toughness ( `beta`, `gamma`, `rank`) VALUES (?,?,?);");
            Random generator = new Random();
            statusLabel.setText("Filling tables with random data...");
            for (int i = 0; i < 100; i++) {
                flagellaPstmt.setInt(1, generator.nextInt(89) + 10);
                flagellaPstmt.setInt(2, generator.nextInt(89) + 10);
                flagellaPstmt.setInt(3, generator.nextInt(9) + 1);
                flagellaPstmt.addBatch();
                toughnessPstmt.setInt(1, generator.nextInt(89) + 10);
                toughnessPstmt.setInt(2, generator.nextInt(89) + 10);
                char c = (char) (generator.nextInt(26) + 'a');
                toughnessPstmt.setString(3, String.valueOf(c));
                toughnessPstmt.addBatch();
            }
            flagellaPstmt.executeBatch();
            toughnessPstmt.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        statusLabel.setText("Succes, filled tables with random data.");
    }//GEN-LAST:event_GenerateFTButtonActionPerformed

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
            // Set cross-platform Java L&F (also called "Metal")
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerateFTButton;
    private javax.swing.JButton addExaminationsButton;
    private javax.swing.JButton addExaminedButton;
    private javax.swing.JTextField classTextField;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton disconnectButton;
    private javax.swing.JTextArea examinedTextArea;
    private javax.swing.JTextField genotypeTextField;
    private javax.swing.JButton getExaminedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadXmlButton;
    private javax.swing.JButton saveXmlButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    private String decodeGenotype(String genotype) throws SQLException {
        String clasS = "", classChar = null;
        String[] decodedGenotype = genotype.split("");
        int alpha, beta, gamma, classInt = 0, distance, curr = Integer.MAX_VALUE, idx = 0;
        alpha = Integer.parseInt(decodedGenotype[0] + decodedGenotype[5]); // flagella alpha
        beta = Integer.parseInt(decodedGenotype[1] + decodedGenotype[4]); // flagella & toughness beta 
        gamma = Integer.parseInt(decodedGenotype[2] + decodedGenotype[3]); // toughness gamma 
        for (int i = 0; i < alphaList.size(); i++) {
            distance = (int) (sqrt(pow(alphaList.get(i) - alpha, 2) + pow(betaList.get(i) - beta, 2)));
            if (distance < curr) {
                curr = distance;
                idx = i;
            }
        }
        PreparedStatement pstmt = con.prepareStatement("select number from flagella where alpha = '" + alphaList.get(idx) + "'");
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            classInt = rs.getInt(1);
        }
        for (int i = 0; i < alphaList.size(); i++) {
            distance = (int) (sqrt(pow(betaList.get(i) - beta, 2) + pow(gammaList.get(i) - gamma, 2)));
            if (distance < curr) {
                curr = distance;
                idx = i;
            }
        }
        pstmt = con.prepareStatement("select rank from toughness where gamma = '" + gammaList.get(idx) + "'");
        rs = pstmt.executeQuery();
        if (rs.next()) {
            classChar = rs.getString(1);
        }
        clasS = classInt + classChar;
        return clasS;

    }
}
