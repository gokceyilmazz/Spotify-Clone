/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muzikdosyası;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gökçe Yılmaz
 */
public class KullaniciEkrani extends javax.swing.JFrame {

    /**
     * Creates new form KullaniciEkrani
     */
    public static String a;
    String kullanici;
    Baglanti baglanti = new Baglanti();
    Database db = new Database();
    DefaultTableModel modelim = new DefaultTableModel();
    DefaultTableModel modelim2 = new DefaultTableModel();
    DefaultTableModel modelim3 = new DefaultTableModel();
    DefaultTableModel modelim4 = new DefaultTableModel();
    DefaultTableModel modelim5 = new DefaultTableModel();
    DefaultTableModel modelim6 = new DefaultTableModel();
    DefaultTableModel modelim7 = new DefaultTableModel();
    DefaultTableModel modelim8 = new DefaultTableModel();
    DefaultTableModel modelim9 = new DefaultTableModel();
    DefaultTableModel modelim10 = new DefaultTableModel();
    DefaultTableModel modelim11 = new DefaultTableModel();
    DefaultTableModel modelim12 = new DefaultTableModel();
    DefaultTableModel modelim13 = new DefaultTableModel();
    DefaultTableModel modelim14 = new DefaultTableModel();
    DefaultTableModel modelim15 = new DefaultTableModel();
    DefaultTableModel modelim16 = new DefaultTableModel();
    Object[] kolonlar = {"Şarkı","Tarih","Sanatçı","Albüm","Tür","Süre","Dinlenme Sayısı"};
    Object[] kolonlar4 = {""};
    Object[] kolonlar5 = {"Takip Edilen Kullanıcılar"};
    Object[] satirlar = new Object[7];
    Object[] satirlar2 = new Object[7];
    Object[] satirlar3 = new Object[7];
    Object[] satirlar4 = new Object[1];
    Object[] satirlar5 = new Object[1];
    Object[] satirlar6 = new Object[7];
    Object[] satirlar7 = new Object[7];
    Object[] satirlar8 = new Object[7];
    Object[] satirlar9 = new Object[7];
    Object[] satirlar10 = new Object[7];
    Object[] satirlar11 = new Object[7];
    Object[] satirlar12 = new Object[7];
    Object[] satirlar13 = new Object[7];
    Object[] satirlar14 = new Object[7];
    Object[] satirlar15 = new Object[7];
    Object[] satirlar16 = new Object[7];

    public KullaniciEkrani() {
        initComponents();
        
        modelim.setColumnIdentifiers(kolonlar);
        modelim2.setColumnIdentifiers(kolonlar);
        modelim3.setColumnIdentifiers(kolonlar);
        modelim4.setColumnIdentifiers(kolonlar4);
        modelim5.setColumnIdentifiers(kolonlar5);
        modelim6.setColumnIdentifiers(kolonlar);
        modelim7.setColumnIdentifiers(kolonlar);
        modelim8.setColumnIdentifiers(kolonlar);
        modelim9.setColumnIdentifiers(kolonlar);
        modelim10.setColumnIdentifiers(kolonlar);
        modelim11.setColumnIdentifiers(kolonlar);
        modelim12.setColumnIdentifiers(kolonlar);
        modelim13.setColumnIdentifiers(kolonlar);
        modelim14.setColumnIdentifiers(kolonlar);
        modelim15.setColumnIdentifiers(kolonlar);
        modelim16.setColumnIdentifiers(kolonlar);
        jLabel1.setIcon(new ImageIcon ("src\\calinan.png"));
        
        Baglanti baglanti = new Baglanti();
        baglanti.preparedKullanicilariGetir("", "");
        
        
        ResultSet rs = baglanti.ulkeGetir();
        
        try {
            while(rs.next()){
               
               jComboBox1.addItem(rs.getString("ulkeAdi"));
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void listele(){
    modelim.getDataVector().removeAllElements();
        System.out.println("K:"+kullanici);
        String id=baglanti.kullaniciIdBul(kullanici);
        ResultSet rs = baglanti.list(id,"Pop");
        
       
       
        try {
            while(rs.next()){
                satirlar[0]=rs.getString("sarkiAdi");
                satirlar[1]=rs.getString("tarih");
                satirlar[2]=rs.getString("sanatci");
                satirlar[3]=rs.getString("album");
                satirlar[4]=rs.getString("tur");
                satirlar[5]=rs.getString("sure");
                satirlar[6]=rs.getString("dinlenmeSayisi");
                
                modelim.addRow(satirlar);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable1.setModel(modelim);
    }
    
    public void listele2(){
    
         modelim2.getDataVector().removeAllElements();
        System.out.println("K:"+kullanici);
        String id=baglanti.kullaniciIdBul(kullanici);
        
        
        
        ResultSet rs2 = baglanti.list(id,"Jazz");
        
        try {
            while(rs2.next()){
            
                satirlar2[0]=rs2.getString("sarkiAdi");
                satirlar2[1]=rs2.getString("tarih");
                satirlar2[2]=rs2.getString("sanatci");
                satirlar2[3]=rs2.getString("album");
                satirlar2[4]=rs2.getString("tur");
                satirlar2[5]=rs2.getString("sure");
                satirlar2[6]=rs2.getString("dinlenmeSayisi");
                
                modelim2.addRow(satirlar2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable3.setModel(modelim2);
    }
    
    public void listele3(){
     modelim3.getDataVector().removeAllElements();  
        System.out.println("K:"+kullanici);
        String id=baglanti.kullaniciIdBul(kullanici);
        ResultSet rs = baglanti.list(id,"Klasik");
        
       
       
        try {
            while(rs.next()){
                satirlar3[0]=rs.getString("sarkiAdi");
                satirlar3[1]=rs.getString("tarih");
                satirlar3[2]=rs.getString("sanatci");
                satirlar3[3]=rs.getString("album");
                satirlar3[4]=rs.getString("tur");
                satirlar3[5]=rs.getString("sure");
                satirlar3[6]=rs.getString("dinlenmeSayisi");
                
                modelim3.addRow(satirlar3);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable4.setModel(modelim3);
    }
    public void listele4(){
    modelim5.getDataVector().removeAllElements();  
        System.out.println("K:"+kullanici);
        String id=baglanti.kullaniciIdBul(kullanici);
        ResultSet rs = baglanti.takipciGetir(id);
        
        try {
            while(rs.next()){
                satirlar5[0]=rs.getString("kullaniciAdi");
                
                
                modelim5.addRow(satirlar5);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable2.setModel(modelim5);
    }
    public void listele5(){
        modelim12.getDataVector().removeAllElements();
        
        ResultSet rs2 = baglanti.turTopOn("Pop");
        
        try {
            while(rs2.next()){
            
                satirlar12[0]=rs2.getString("sarkiAdi");
                satirlar12[1]=rs2.getString("tarih");
                satirlar12[2]=rs2.getString("sanatci");
                satirlar12[3]=rs2.getString("album");
                satirlar12[4]=rs2.getString("tur");
                satirlar12[5]=rs2.getString("sure");
                satirlar12[6]=rs2.getString("dinlenmeSayisi");
                
                modelim12.addRow(satirlar12);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable12.setModel(modelim12);
    }
    public void listele6(){
        modelim13.getDataVector().removeAllElements();
        
        ResultSet rs2 = baglanti.turTopOn("Jazz");
        
        try {
            while(rs2.next()){
            
                satirlar13[0]=rs2.getString("sarkiAdi");
                satirlar13[1]=rs2.getString("tarih");
                satirlar13[2]=rs2.getString("sanatci");
                satirlar13[3]=rs2.getString("album");
                satirlar13[4]=rs2.getString("tur");
                satirlar13[5]=rs2.getString("sure");
                satirlar13[6]=rs2.getString("dinlenmeSayisi");
                
                modelim13.addRow(satirlar13);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable13.setModel(modelim13);
    }
    public void listele7(){
        modelim14.getDataVector().removeAllElements();
        
        ResultSet rs2 = baglanti.turTopOn("Klasik");
        
        try {
            while(rs2.next()){
            
                satirlar14[0]=rs2.getString("sarkiAdi");
                satirlar14[1]=rs2.getString("tarih");
                satirlar14[2]=rs2.getString("sanatci");
                satirlar14[3]=rs2.getString("album");
                satirlar14[4]=rs2.getString("tur");
                satirlar14[5]=rs2.getString("sure");
                satirlar14[6]=rs2.getString("dinlenmeSayisi");
                
                modelim14.addRow(satirlar14);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable14.setModel(modelim14);
    }
    public void listele8(){
        modelim15.getDataVector().removeAllElements();
        
        ResultSet rs2 = baglanti.genelTopOn();
        
        try {
            while(rs2.next()){
            
                satirlar15[0]=rs2.getString("sarkiAdi");
                satirlar15[1]=rs2.getString("tarih");
                satirlar15[2]=rs2.getString("sanatci");
                satirlar15[3]=rs2.getString("album");
                satirlar15[4]=rs2.getString("tur");
                satirlar15[5]=rs2.getString("sure");
                satirlar15[6]=rs2.getString("dinlenmeSayisi");
                
                modelim15.addRow(satirlar15);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable15.setModel(modelim15);
    }
    public void listele9(){
        modelim16.getDataVector().removeAllElements();
        
        ResultSet rs2 = baglanti.ulkeTopOn(jComboBox1.getSelectedItem().toString());
        
        try {
            while(rs2.next()){
            
                satirlar16[0]=rs2.getString("sarkiAdi");
                satirlar16[1]=rs2.getString("tarih");
                satirlar16[2]=rs2.getString("sanatci");
                satirlar16[3]=rs2.getString("album");
                satirlar16[4]=rs2.getString("tur");
                satirlar16[5]=rs2.getString("sure");
                satirlar16[6]=rs2.getString("dinlenmeSayisi");
                
                modelim16.addRow(satirlar16);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable16.setModel(modelim16);
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1500, 830));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 830));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(modelim);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Listele");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(821, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Pop", jPanel4);

        jTable3.setModel(modelim2);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton3.setText("Listele");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jazz", jPanel5);

        jTable4.setModel(modelim3);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton4.setText("Listele");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Klasik", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Çalma Listelerim", jPanel2);

        jTable2.setModel(modelim5);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton5.setText("Listele");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton5)
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Takip Ettiklerim", jPanel3);

        jButton9.setText("Ara");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable9.setModel(modelim9);
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable9);

        jButton13.setText("Albümü Takip Et");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton13)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Albüm Bul", jPanel14);

        jButton10.setText("Ara");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTable10.setModel(modelim10);
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable10);

        jButton14.setText("Sanatçıyı Takip Et");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Sanatçı Bul", jPanel15);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jButton11.setText("Ara");

        jTable11.setModel(modelim11);
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Şarkı Bul", jPanel16);

        jTable12.setModel(modelim12);
        jTable12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable12MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTable12);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Pop Top 10", jPanel7);

        jTable13.setModel(modelim13);
        jTable13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable13MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable13);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Jazz Top 10", jPanel8);

        jTable14.setModel(modelim14);
        jTable14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable14MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTable14);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Klasik Top 10", jPanel9);

        jTable15.setModel(modelim15);
        jScrollPane15.setViewportView(jTable15);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Top 10", jPanel10);

        jTable16.setModel(modelim16);
        jScrollPane16.setViewportView(jTable16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jButton12.setText("Ara");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Ülkeler Top 10", jPanel17);

        jTabbedPane4.addTab("Spotify Çalma Listeleri", jTabbedPane3);

        jTable5.setModel(modelim4);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jTable5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable5KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jTable6.setModel(modelim6);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jButton6.setText("Tümünü Ekle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Pop", jPanel11);

        jTable8.setModel(modelim7);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable8);

        jButton7.setText("Tümünü Ekle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Jazz", jPanel12);

        jTable7.setModel(modelim8);
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jButton8.setText("Tümünü Ekle");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Klasik", jPanel13);

        jTabbedPane5.addTab("", jTabbedPane6);

        jLabel1.setMinimumSize(new java.awt.Dimension(341, 77));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listele(); 
        listele5();
        listele6();
        listele7();
        listele8();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       listele2();
       listele5();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       listele3();
       listele5();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        modelim4.getDataVector().removeAllElements();
        String k= jTextField1.getText();
        ResultSet rs = baglanti.KullaniciAra(k);
        try {
            while(rs.next()){
                satirlar4[0]=rs.getString("kullaniciAdi");
               
                
                modelim4.addRow(satirlar4);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable5.setModel(modelim4); 
        
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTable5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable5KeyPressed
       
    }//GEN-LAST:event_jTable5KeyPressed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
       String id=baglanti.kullaniciIdBul(kullanici);
       String takipedilen=jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 0).toString();
       String id2=baglanti.kullaniciIdBul(takipedilen);
       String abone=baglanti.abonelikBul(id2);
        System.out.println("abone:"+abone);
        if(abone.equals("Premium")){
       baglanti.takipciEkle(id, id2);
       if(Baglanti.c==1){
                        JOptionPane.showMessageDialog(rootPane, "Takip edildi");
                          
                            }
         
        }
        else if(abone.equals("Normal")){
        
            JOptionPane.showMessageDialog(rootPane, "Premium Kullanıcı değil takip edilemez!!!");
        
        }
        listele4();
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        listele4();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        a=jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString();
        jTabbedPane5.addTab(a, jTabbedPane6);
        
        modelim6.getDataVector().removeAllElements();
        
        String id=baglanti.kullaniciIdBul(a);
        ResultSet rs = baglanti.list(id,"Pop");
        
       
       
        try {
            while(rs.next()){
                satirlar6[0]=rs.getString("sarkiAdi");
                satirlar6[1]=rs.getString("tarih");
                satirlar6[2]=rs.getString("sanatci");
                satirlar6[3]=rs.getString("album");
                satirlar6[4]=rs.getString("tur");
                satirlar6[5]=rs.getString("sure");
                satirlar6[6]=rs.getString("dinlenmeSayisi");
                
                modelim6.addRow(satirlar6);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable6.setModel(modelim6);
        
        modelim7.getDataVector().removeAllElements();
        
        
        ResultSet rs2 = baglanti.list(id,"Jazz");
        
       
       
        try {
            while(rs2.next()){
                satirlar7[0]=rs2.getString("sarkiAdi");
                satirlar7[1]=rs2.getString("tarih");
                satirlar7[2]=rs2.getString("sanatci");
                satirlar7[3]=rs2.getString("album");
                satirlar7[4]=rs2.getString("tur");
                satirlar7[5]=rs2.getString("sure");
                satirlar7[6]=rs2.getString("dinlenmeSayisi");
                
                modelim7.addRow(satirlar7);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable8.setModel(modelim7);
        
        modelim8.getDataVector().removeAllElements();
        
        
        ResultSet rs3 = baglanti.list(id,"Klasik");
        
       
       
        try {
            while(rs3.next()){
                satirlar8[0]=rs3.getString("sarkiAdi");
                satirlar8[1]=rs3.getString("tarih");
                satirlar8[2]=rs3.getString("sanatci");
                satirlar8[3]=rs3.getString("album");
                satirlar8[4]=rs3.getString("tur");
                satirlar8[5]=rs3.getString("sure");
                satirlar8[6]=rs3.getString("dinlenmeSayisi");
                
                modelim8.addRow(satirlar8);
                
            }} catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTable7.setModel(modelim8);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
       String kullaniciId=baglanti.kullaniciIdBul(kullanici);
       String srk=jTable6.getModel().getValueAt(jTable6.getSelectedRow(), 0).toString();
       String sarkiId=baglanti.sarkiIdBul(srk);
       baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
       if(Baglanti.c==1)
       JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
       Baglanti.c=0;
       listele();
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
       String kullaniciId=baglanti.kullaniciIdBul(kullanici);
       String srk=jTable8.getModel().getValueAt(jTable8.getSelectedRow(), 0).toString();
       String sarkiId=baglanti.sarkiIdBul(srk);
       baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
       if(Baglanti.c==1)
       JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
       Baglanti.c=0;
       listele2();
    }//GEN-LAST:event_jTable8MouseClicked

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
       String kullaniciId=baglanti.kullaniciIdBul(kullanici);
       String srk=jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString();
       String sarkiId=baglanti.sarkiIdBul(srk);
       baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
       if(Baglanti.c==1)
       JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
       Baglanti.c=0;
       listele3();
    }//GEN-LAST:event_jTable7MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String srk=jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString();
        baglanti.dinlenmeGuncelle(srk);
        
        listele();
        jLabel2.setText("Şu anda dinlenen: "+srk);
        listele5();
        listele6();
        listele7();
        listele8();
        listele9();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        String srk=jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0).toString();
        baglanti.dinlenmeGuncelle(srk);
        listele2();
        jLabel2.setText("Şu anda dinlenen: "+srk);
        listele5();
        listele6();
        listele7();
        listele8();
        listele9();
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        String srk=jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0).toString();
        baglanti.dinlenmeGuncelle(srk);
        listele3();
        jLabel2.setText("Şu anda dinlenen: "+srk);
        listele5();
        listele6();
        listele7();
        listele8();
        listele9();
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String kullaniciId=baglanti.kullaniciIdBul(kullanici);
        for (int i = 0; i < jTable6.getModel().getRowCount(); i++) {
            String srk=jTable6.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
        }
        if(Baglanti.c==1)
        JOptionPane.showMessageDialog(this,"Şarkılar Çalma Listenize Eklendi");
        Baglanti.c=0;
        listele();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String kullaniciId=baglanti.kullaniciIdBul(kullanici);
        for (int i = 0; i < jTable8.getModel().getRowCount(); i++) {
            String srk=jTable8.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
        }
        if(Baglanti.c==1)
        JOptionPane.showMessageDialog(this,"Şarkılar Çalma Listenize Eklendi");
        Baglanti.c=0;
        listele2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String kullaniciId=baglanti.kullaniciIdBul(kullanici);
        for (int i = 0; i < jTable7.getModel().getRowCount(); i++) {
            String srk=jTable7.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
        }
        if(Baglanti.c==1)
        JOptionPane.showMessageDialog(this,"Şarkılar Çalma Listenize Eklendi");
        Baglanti.c=0;
        listele3();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        modelim9.getDataVector().removeAllElements();
        String ad= jTextField2.getText();
        ResultSet rs2 = baglanti.sarkiTabloAra("album",ad);
        
        try {
            while(rs2.next()){
            
                satirlar9[0]=rs2.getString("sarkiAdi");
                satirlar9[1]=rs2.getString("tarih");
                satirlar9[2]=rs2.getString("sanatci");
                satirlar9[3]=rs2.getString("album");
                satirlar9[4]=rs2.getString("tur");
                satirlar9[5]=rs2.getString("sure");
                satirlar9[6]=rs2.getString("dinlenmeSayisi");
                
                modelim9.addRow(satirlar9);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable9.setModel(modelim9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       modelim10.getDataVector().removeAllElements();
        String ad= jTextField3.getText();
        ResultSet rs2 = baglanti.sarkiTabloAra("sanatci",ad);
        
        try {
            while(rs2.next()){
            
                satirlar10[0]=rs2.getString("sarkiAdi");
                satirlar10[1]=rs2.getString("tarih");
                satirlar10[2]=rs2.getString("sanatci");
                satirlar10[3]=rs2.getString("album");
                satirlar10[4]=rs2.getString("tur");
                satirlar10[5]=rs2.getString("sure");
                satirlar10[6]=rs2.getString("dinlenmeSayisi");
                
                modelim10.addRow(satirlar10);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable10.setModel(modelim10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        modelim11.getDataVector().removeAllElements();
        String ad= jTextField4.getText();
        ResultSet rs2 = baglanti.sarkiTabloAra("sarkiAdi",ad);
        
        try {
            while(rs2.next()){
            
                satirlar11[0]=rs2.getString("sarkiAdi");
                satirlar11[1]=rs2.getString("tarih");
                satirlar11[2]=rs2.getString("sanatci");
                satirlar11[3]=rs2.getString("album");
                satirlar11[4]=rs2.getString("tur");
                satirlar11[5]=rs2.getString("sure");
                satirlar11[6]=rs2.getString("dinlenmeSayisi");
                
                modelim11.addRow(satirlar11);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable11.setModel(modelim11);
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        String tur=jTable9.getModel().getValueAt(jTable9.getSelectedRow(), 4).toString();
        System.out.println("Tür:"+tur);
        if(tur.equals("Pop")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable9.getModel().getValueAt(jTable9.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele();
        }
        else if(tur.equals("Jazz")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable9.getModel().getValueAt(jTable9.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele2();
        }
        else if(tur.equals("Klasik")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable9.getModel().getValueAt(jTable9.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele3();
        }
    }//GEN-LAST:event_jTable9MouseClicked

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        String tur=jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 4).toString();
        System.out.println("Tür:"+tur);
        if(tur.equals("Pop")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele();
        }
        else if(tur.equals("Jazz")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele2();
        }
        else if(tur.equals("Klasik")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele3();
        }
    }//GEN-LAST:event_jTable10MouseClicked

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
       String tur=jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 4).toString();
        System.out.println("Tür:"+tur);
        if(tur.equals("Pop")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele();
        }
        else if(tur.equals("Jazz")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele2();
        }
        else if(tur.equals("Klasik")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
            if(Baglanti.c==1)
            JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
            Baglanti.c=0;
            listele3();
        }
    }//GEN-LAST:event_jTable11MouseClicked

    private void jTable12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable12MouseClicked
        String kullaniciId=baglanti.kullaniciIdBul(kullanici);
       String srk=jTable12.getModel().getValueAt(jTable12.getSelectedRow(), 0).toString();
       String sarkiId=baglanti.sarkiIdBul(srk);
       baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
       if(Baglanti.c==1)
       JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
       Baglanti.c=0;
       listele();
    }//GEN-LAST:event_jTable12MouseClicked

    private void jTable13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable13MouseClicked
        String kullaniciId=baglanti.kullaniciIdBul(kullanici);
       String srk=jTable13.getModel().getValueAt(jTable13.getSelectedRow(), 0).toString();
       String sarkiId=baglanti.sarkiIdBul(srk);
       baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
       if(Baglanti.c==1)
       JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
       Baglanti.c=0;
       listele2();
    }//GEN-LAST:event_jTable13MouseClicked

    private void jTable14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable14MouseClicked
       String kullaniciId=baglanti.kullaniciIdBul(kullanici);
       String srk=jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0).toString();
       String sarkiId=baglanti.sarkiIdBul(srk);
       baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
       if(Baglanti.c==1)
       JOptionPane.showMessageDialog(this,"Çalma Listenize Eklendi");
       Baglanti.c=0;
       listele3();
    }//GEN-LAST:event_jTable14MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        listele9();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        for (int i = 0; i < jTable9.getModel().getRowCount(); i++) {
            String tur=jTable9.getModel().getValueAt(i, 4).toString();
        System.out.println("Tür:"+tur);
        if(tur.equals("Pop")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable9.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
            if(Baglanti.c==1)
            
            Baglanti.c=0;
            listele();
        }
        else if(tur.equals("Jazz")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable9.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
            if(Baglanti.c==1)
            
            Baglanti.c=0;
            listele2();
        }
        else if(tur.equals("Klasik")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable9.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
            if(Baglanti.c==1)
            
            Baglanti.c=0;
            listele3();
        }
        
        }
       JOptionPane.showMessageDialog(this,"Albüm takip edildi şarkılar çalma listenize eklendi");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        for (int i = 0; i < jTable10.getModel().getRowCount(); i++) {
            String tur=jTable10.getModel().getValueAt(i, 4).toString();
        System.out.println("Tür:"+tur);
        if(tur.equals("Pop")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable10.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "1");
            if(Baglanti.c==1)
            
            Baglanti.c=0;
            listele();
        }
        else if(tur.equals("Jazz")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable10.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "2");
            if(Baglanti.c==1)
            
            Baglanti.c=0;
            listele2();
        }
        else if(tur.equals("Klasik")){
        
            String kullaniciId=baglanti.kullaniciIdBul(kullanici);
            String srk=jTable10.getModel().getValueAt(i, 0).toString();
            String sarkiId=baglanti.sarkiIdBul(srk);
            baglanti.calmaListesiEkle(sarkiId, kullaniciId, "3");
            if(Baglanti.c==1)
            
            Baglanti.c=0;
            listele3();
        }
        
        }
       JOptionPane.showMessageDialog(this,"Sanatçı takip edildi şarkıları çalma listenize eklendi");
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
