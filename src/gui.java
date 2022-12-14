/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author koron
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        TablaFeltolt(jTable1);
        VarosFeltolt(varos);
        VarosFeltolt(varos1);
        jTable1.setAutoCreateRowSorter(true);
        Date date = new Date();
        datumGet.setDate(date);
        getContentPane().setBackground(new java.awt.Color(30, 30, 50));
        jTable1.setSelectionBackground(new java.awt.Color(30,30,70));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nev = new javax.swing.JTextField();
        diaksz = new javax.swing.JTextField();
        anyjaneve = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lakcim = new javax.swing.JTextField();
        varos = new javax.swing.JComboBox<>();
        keresett = new javax.swing.JTextField();
        keres = new javax.swing.JButton();
        keresoKiir = new javax.swing.JLabel();
        datumGet = new com.toedter.calendar.JDateChooser();
        varos1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("N??v");

        jLabel2.setText("Di??k ig. sz??m");

        jLabel3.setText("Anyja neve");

        jLabel4.setText("Sz??l. v??ros ??s id??");

        jLabel5.setText("E-Mail");

        jLabel6.setText("Lakc??m");

        update.setBackground(new java.awt.Color(153, 255, 153));
        update.setText("Felvitel");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 153, 153));
        delete.setText("T??rl??s");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N??v", "Di??k Ig. sz??m", "Anyja neve", "E-Mail", "Lakhely", "Lakc??m", "Sz??l. V??ros", "Sz??l. Id??"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        keres.setBackground(new java.awt.Color(102, 204, 255));
        keres.setText("Keres??s");
        keres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keresActionPerformed(evt);
            }
        });

        datumGet.setToolTipText("V??laszd ki a sz??let??si d??tumod.\n");
        datumGet.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diaksz, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anyjaneve, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varos1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lakcim, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datumGet, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nev, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(keresett, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(keres, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(keresoKiir, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(464, 464, 464))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(diaksz, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(anyjaneve, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lakcim, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varos)
                            .addComponent(datumGet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keres)
                            .addComponent(keresett, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keresoKiir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Boolean nevB, diakB, anyjaB, emailekB, lakcimekB, dateB;
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
        
        String nevek = Auth.encrypt(nev.getText());
        String diakigszam = Auth.encrypt(diaksz.getText());
        int varosleker = varos.getSelectedIndex();
        String anyja = Auth.encrypt(anyjaneve.getText());
        String emailek = Auth.encrypt(email.getText());
        int varosleker2 = varos1.getSelectedIndex();
        String lakcimek = Auth.encrypt(lakcim.getText());
        
        if(datumGet.getDate() == null){
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Adjon meg egy d??tumot!");
            dateB = false;
        }else{
            dateB = true;
        }
        if(lakcim.getText().equals("")){
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Adjon meg utc??t, h??zsz??mot!");
            lakcimekB = false;
        }else{
            lakcimekB = true;
        }
        if(email.getText().equals("")){
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Adjon meg egy E-Mailt!");
            emailekB = false;
        }else{
            if(!email.getText().contains("@") && email.getText().contains(".")){
                keresoKiir.setForeground(Color.red);
                keresoKiir.setText("Adjon meg egy helyes emailt!");
                emailekB=false;
            }else{
                emailekB = true;
            }
        }
        if(anyjaneve.getText().equals("")){
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Adja meg a tanul?? anyja nev??t!");
            anyjaB=false;
        }else{
            anyjaB = true;
        }
        if(diaksz.getText().equals("")){
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Adjon meg egy di??kigazolv??ny sz??mot!");
            diakB=false;
        }else{
            if(diaksz.getText().length()!= 11){
                keresoKiir.setForeground(Color.red);
                keresoKiir.setText("Adjon meg egy ??rv??nyes di??kigazolv??nysz??mot!");
                diakB = false;
            }else{
                diakB=true;
            }
        }
        if(nev.getText().equals("")){
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Adjon meg egy nevet!");
            nevB =false;
        }else{
            nevB=true;
        }
        
        if(nevB && diakB && anyjaB && emailekB && lakcimekB && dateB){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","");
            Statement smt = conn.createStatement();
            smt.executeUpdate("INSERT INTO diak(Nev,diakSzam,anyjaNeve,email,varos,lakcim,szulVaros,szulido) "
                    + "VALUES('"+nevek+"','"+diakigszam+"','"+anyja+"','"+emailek+"','"+(varosleker+1)+"','"+lakcimek+"','"+(varosleker2+1)+"','"+SDF.format(datumGet.getDate())+"')");
            nev.setText("");
            diaksz.setText("");
            anyjaneve.setText("");
            email.setText("");
            lakcim.setText("");
            Date date = new Date();
            datumGet.setDate(date);
            TablaFeltolt(jTable1);
            
        }catch(Exception E){System.out.println("Hiba a felt??lt??sn??l! "+E);}
        }else{
            System.out.println("Felt??lt??s nem siker??lt mert egy vagy t??bb mez?? ??res!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","");
        Statement smt = conn.createStatement();
        smt.executeUpdate("DELETE FROM diak WHERE diakSzam = '"+Auth.encrypt(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString())+"'");
        TablaFeltolt(jTable1);

        }catch(Exception E){
            System.out.println("Hiba a t??rl??sn??l! " +E);
        }
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void keresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keresActionPerformed
        String keresoAdat = keresett.getText();
        
        try{
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Statement sql1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","").createStatement();
        ResultSet rs1 = sql1.executeQuery("SELECT Nev,diakSzam,anyjaNeve,email,varos,lakcim,szulVaros,szulido from diak");
        String[] rekord = new String[8];
        String szulhely, szulvaros;
        TablaTorol(jTable1);
        while(rs1.next()){
            String nev = Auth.decrypt(rs1.getString("nev"));
            String diakszam = Auth.decrypt(rs1.getString("diakSzam"));
            String anyjaNeve = Auth.decrypt(rs1.getString("anyjaNeve"));
            String email = Auth.decrypt(rs1.getString("email"));
            String lakcim = Auth.decrypt(rs1.getString("lakcim"));
            String szulido = rs1.getString("szulido");
            
            szulhely = rs1.getString("varos");
            szulvaros = rs1.getString("szulVaros");
            
            Statement sql2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","").createStatement();
            ResultSet rs2 = sql2.executeQuery("SELECT varosNev FROM varosok WHERE varosId = '"+szulhely+"'");
            rs2.next();
            szulhely = rs2.getString("varosNev");
            
            Statement sql3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","").createStatement();
            ResultSet rs3 = sql3.executeQuery("SELECT varosNev FROM varosok WHERE varosId = '"+szulvaros+"'");
            rs3.next();
            szulvaros= rs3.getString("varosNev");
                    
            if(nev.toLowerCase().contains(keresett.getText()) || 
             diakszam.contains(keresett.getText()) || 
             anyjaNeve.toLowerCase().contains(keresett.getText()) ||
             email.toLowerCase().contains(keresett.getText()) ||
             szulhely.toLowerCase().contains(keresett.getText()) ||
             lakcim.toLowerCase().contains(keresett.getText()) ||
             szulvaros.toLowerCase().contains(keresett.getText()) ||
             szulido.contains(keresett.getText())){
                rekord[0] = Auth.decrypt(rs1.getString("nev"));
                rekord[1] = Auth.decrypt(rs1.getString("diakSzam"));
                rekord[2] = Auth.decrypt(rs1.getString("anyjaNeve"));
                rekord[3] = Auth.decrypt(rs1.getString("email"));
                rekord[4] = szulhely;
                rekord[5] = Auth.decrypt(rs1.getString("lakcim"));
                rekord[6] = szulvaros;
                rekord[7] = rs1.getString("szulido");
                
                model.addRow(rekord);
            }

        }
        keresoKiir.setForeground(Color.green);
        keresoKiir.setText("Sikeres Keres??s!");
        }catch(Exception E){
            System.out.println("Hiba a keres??sn??l! "+E);
            keresoKiir.setForeground(Color.red);
            keresoKiir.setText("Hiba a keres??sn??l!");
        }
    }//GEN-LAST:event_keresActionPerformed

    public static void TablaFeltolt (JTable input){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","");
            Statement smt = conn.createStatement();
            DefaultTableModel model = (DefaultTableModel) input.getModel();
            ResultSet rs = smt.executeQuery("SELECT Nev,diakSzam,anyjaNeve,email,varos,lakcim,szulVaros,szulido FROM diak");
            String[] rekord = new String[8];
            
            int sorszam = model.getRowCount();
            for (int i = 0; i < sorszam; i++) {
                model.removeRow(0);
            }
            String szulhely, szulvaros;
            while(rs.next()){
//                for (int i = 0; i < mezon.length; i++) {
//                    rekord[i] = rs.getString(mezon[i]);
//                }
                szulhely = rs.getString("varos");
                szulvaros = rs.getString("szulVaros");

                rekord[0] = Auth.decrypt(rs.getString("Nev"));
                rekord[1] = Auth.decrypt(rs.getString("diakSzam"));
                rekord[2] = Auth.decrypt(rs.getString("anyjaNeve"));
                
                Statement conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","").createStatement();
                ResultSet rs2 = conn2.executeQuery("SELECT varosId,varosNev FROM varosok WHERE varosId = '"+szulhely+"'");
                rs2.next();
                szulhely = rs2.getString("varosNev");
                
                rekord[3] = Auth.decrypt(rs.getString("email"));
                rekord[4] = szulhely;
                rekord[5] = Auth.decrypt(rs.getString("lakcim"));
                
                Statement conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","").createStatement();
                ResultSet rs3 = conn3.executeQuery("SELECT varosId,varosNev FROM varosok WHERE varosId = '"+szulvaros+"'");
                rs3.next();
                szulvaros = rs3.getString("varosNev");
                
                rekord[6] = szulvaros;
                rekord[7] = rs.getString("szulido");
                model.addRow(rekord);
            }
            conn.close();
        }catch(Exception E){
            System.out.println("Hiba a t??bla bet??lt??s??n??l! " +E);
        }
    }
    public static void VarosFeltolt (JComboBox input){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diakok?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8","root","");
            Statement smt = conn.createStatement();
            ResultSet rsVarosok = smt.executeQuery("SELECT varosNev,iranyitoszam FROM varosok");
            while(rsVarosok.next()){
                input.addItem(rsVarosok.getString("varosNev")+", "+rsVarosok.getString("iranyitoszam"));
            }
            input.setSelectedItem("Tatab??nya, 2800");
            conn.close();
        }catch(Exception E){
            System.out.println("Hiba a v??rosok felt??lt??s??n??l! " +E);
        }
    }
    public static void TablaTorol (JTable delete){
        DefaultTableModel model = (DefaultTableModel) delete.getModel();
        int sorszam = model.getRowCount();
            for (int i = 0; i < sorszam; i++) {
                model.removeRow(0);
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anyjaneve;
    private com.toedter.calendar.JDateChooser datumGet;
    private javax.swing.JButton delete;
    private javax.swing.JTextField diaksz;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keres;
    private javax.swing.JTextField keresett;
    private javax.swing.JLabel keresoKiir;
    private javax.swing.JTextField lakcim;
    private javax.swing.JTextField nev;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> varos;
    private javax.swing.JComboBox<String> varos1;
    // End of variables declaration//GEN-END:variables
}