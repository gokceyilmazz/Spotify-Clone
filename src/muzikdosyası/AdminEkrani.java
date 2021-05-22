
package muzikdosyası;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import static muzikdosyası.girisEkran.btn1;
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTabbedPane;
import static muzikdosyası.girisEkran.lblNewLabel;

/**
 *
 * @author Gökçe Yılmaz
 */
public class AdminEkrani extends JFrame {
   
    Kullanici kullanici = new Kullanici();
    
    
    public static String[][] veri = new String [50][8];
    Object[] satirlar = new Object[8];
    Object[] satirlar2 = new Object[5];
    Object[] satirlar3 = new Object[3];
    Object[] kolonlar = {"ŞARKI ID","ŞARKI ADI","TARİH","SANATÇI","ALBUM","TÜR","SÜRE","DİNLENME SAYISI"};
    Object[] kolonlar2 = {"ALBÜM ID","ALBÜM ADI","SANATÇI","TARİH","TÜR"};
    Object[] kolonlar3 = {"SANATÇI ID","SANATÇI ADI","ÜLKE"};
    
    private JTable table;
    private JTable table2;
    private JTable table3;
    
    private JPanel contentPane;
    
    DefaultTableModel modelim = new DefaultTableModel();
    DefaultTableModel modelim2 = new DefaultTableModel();
    DefaultTableModel modelim3 = new DefaultTableModel();
    
    public void listele(){
    
        modelim.setRowCount(0);

				ResultSet myRs = Database.yap("sarki");
                                
                            try {
                                while(myRs.next()) {
                                    satirlar[0] = myRs.getString("sarkiId");
                                    satirlar[1] = myRs.getString("sarkiAdi");
                                    satirlar[2] = myRs.getString("tarih");
                                    satirlar[3] = myRs.getString("sanatci");
                                    satirlar[4] = myRs.getString("album");
                                    satirlar[5] = myRs.getString("tur");
                                    satirlar[6] = myRs.getString("sure");
                                    satirlar[7] = myRs.getString("dinlenmeSayisi");
                                   
                                    modelim.addRow(satirlar);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(AdminEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }



				table.setModel(modelim);
    }
    
    public void listele2(){
    
        modelim2.setRowCount(0);

				ResultSet myRs = Database.yap("album");
                                
                            try {
                                while(myRs.next()) {
                                    satirlar2[0] = myRs.getString("albumId");
                                    satirlar2[1] = myRs.getString("albumAdi");
                                    satirlar2[2] = myRs.getString("sanatci");
                                    satirlar2[3] = myRs.getString("tarih");
                                    satirlar2[4] = myRs.getString("tur");
                                    
                                   
                                    modelim2.addRow(satirlar2);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(AdminEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }



				table2.setModel(modelim2);
    }
    
    public void listele3(){
    
        modelim3.setRowCount(0);

				ResultSet myRs = Database.yap("sanatci");
                                
                            try {
                                while(myRs.next()) {
                                    satirlar3[0] = myRs.getString("sanatciId");
                                    satirlar3[1] = myRs.getString("sanatciAdi");
                                    satirlar3[2] = myRs.getString("sanatciUlke");
                                    
                                   
                                    modelim3.addRow(satirlar3);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(AdminEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }



				table3.setModel(modelim3);
    }
     
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminEkrani frame = new AdminEkrani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
                
               Baglanti baglanti  = new Baglanti();
               baglanti.sarkilariGetir();
               baglanti.albumleriGetir();
               baglanti.sanatcilariGetir();
                
                

                 
                 
	}

    
    public AdminEkrani(){
    
               Baglanti baglanti  = new Baglanti();
               baglanti.sarkilariGetir();
               baglanti.albumleriGetir();
               baglanti.sanatcilariGetir();
               
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 830);
		JPanel contentPane = new JPanel();
                
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                
		setContentPane(contentPane);
		contentPane.setLayout(null);
                contentPane.setBackground(Color.BLACK);
                
                
                JPanel p1= new JPanel();
                JPanel p2= new JPanel();
                JPanel p3= new JPanel();
                
                JTabbedPane tp = new JTabbedPane();
                tp.setBounds(20, 100, 1400, 750);
                tp.add("Şarkılar",p1);
                tp.add("Albümler",p2);
                tp.add("Sanatçılar",p3);
                
                contentPane.add(tp);
                p1.setLayout(null);
                p1.setBackground(Color.BLACK);
                
                p2.setLayout(null);
                p2.setBackground(Color.BLACK);
                
                p3.setLayout(null);
                p3.setBackground(Color.BLACK);
                
                JFormattedTextField sarkiara = new JFormattedTextField();
		sarkiara.setBounds(350, 20, 150, 25);
		contentPane.add(sarkiara);
                
                btn1 = new JButton("Ara");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
			}
                        
		});
		btn1.setBounds(520, 20, 70, 25);
		contentPane.add(btn1);
    
                JScrollPane scrollPane = new JScrollPane();		
		scrollPane.setBounds(100, 50, 800, 271);
		p1.add(scrollPane);
                
                table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
                
                table.setBounds(158, 219, 256, 123);
		scrollPane.setViewportView(table);
                
                
                
                JButton btnListele = new JButton("Listele");
		btnListele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            listele();
			}
		});
		btnListele.setBounds(1000, 200, 97, 25);
		p1.add(btnListele);
                
                
                JPanel sar1= new JPanel();
                JPanel sar2= new JPanel();
                JPanel sar3= new JPanel();
                sar1.setLayout(null);
                sar1.setBackground(Color.BLACK);
                
                sar2.setLayout(null);
                sar2.setBackground(Color.BLACK);
                
                sar3.setLayout(null);
                sar3.setBackground(Color.BLACK);
                
                JTabbedPane tp2 = new JTabbedPane();
                tp2.setBounds(100, 350, 600, 500);
                tp2.add("Ekle",sar1);
                tp2.add("Sil",sar2);
                tp2.add("Düzenle",sar3);
                
                p1.add(tp2);
               
                
                
                lblNewLabel = new JLabel("Şarkı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 10, 100, 20);
		sar1.add(lblNewLabel);
                
                
                JFormattedTextField ad = new JFormattedTextField();
		ad.setBounds(150, 10, 150, 25);
		sar1.add(ad);
                
                lblNewLabel = new JLabel("Tarih:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 50, 100, 20);
		sar1.add(lblNewLabel);
                
                JFormattedTextField tar = new JFormattedTextField();
		tar.setBounds(150, 50, 150, 25);
		sar1.add(tar);
                
                lblNewLabel = new JLabel("Sanatçı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 90, 100, 20);
		sar1.add(lblNewLabel);
                
                JFormattedTextField snt = new JFormattedTextField();
		snt.setBounds(150, 90, 150, 25);
		sar1.add(snt);
                
                lblNewLabel = new JLabel("Albüm:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 130, 100, 20);
		sar1.add(lblNewLabel);
                
                JFormattedTextField alb = new JFormattedTextField();
		alb.setBounds(150, 130, 150, 25);
		sar1.add(alb);
                
                lblNewLabel = new JLabel("Tür:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 170, 100, 20);
		sar1.add(lblNewLabel);
                
                JFormattedTextField tr = new JFormattedTextField();
		tr.setBounds(150, 170, 150, 25);
		sar1.add(tr);
                
                lblNewLabel = new JLabel("Süre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 210, 100, 20);
		sar1.add(lblNewLabel);
                
                JFormattedTextField sr = new JFormattedTextField();
		sr.setBounds(150, 210, 150, 25);
		sar1.add(sr);
                
                
                
                
                JButton btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                        
                            String sarkiadi= ad.getText();
                            String tarih = tar.getText();
                            String sanatci= snt.getText();
                            String album= alb.getText();
                            String tur = tr.getText();
                            String sure = sr.getText();
                           
                            baglanti.sarkiEkle(sarkiadi, tarih, sanatci, album, tur, sure);
                           
                            if(Baglanti.b==1){
                        JOptionPane.showMessageDialog(contentPane, "Başarıyla Eklendi");
                            ad.setText(null);
                            tar.setText(null);
                            snt.setText(null);
                            alb.setText(null);
                            tr.setText(null);
                            sr.setText(null);
                            }
                            else if(Baglanti.b==2){
                            JOptionPane.showMessageDialog(contentPane, "Albüme farklı türde bir şarkı ekleyemezsiniz!!!");
                            }
                            else if(Baglanti.b==0)
                        JOptionPane.showMessageDialog(contentPane, "Girdilerinizi kontrol ediniz!!!");
                            
                            Baglanti.b=0;
                            
                            listele();
                        }
                       
		});
                
                btnEkle.setBounds(350, 150, 97, 25);
		sar1.add(btnEkle);
                
                lblNewLabel = new JLabel("Şarkı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 50, 100, 20);
		sar2.add(lblNewLabel);
                
                JFormattedTextField adsil = new JFormattedTextField();
		adsil.setBounds(150, 50, 150, 25);
		sar2.add(adsil);
    
                JButton btnSilSarki = new JButton("Sil");
		btnSilSarki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                         String yer= "sarki";
                         String yeradi="sarkiAdi";
                         String ad = adsil.getText();
                         baglanti.sil(yer, yeradi, ad);
                         
                         if(Baglanti.b==1){
                        JOptionPane.showMessageDialog(contentPane, "Başarıyla Silindi");
                        adsil.setText(null);
                         }
                            else if(Baglanti.b==0)
                        JOptionPane.showMessageDialog(contentPane, "Şarkı adını kontrol ediniz!!!");
                            
                            Baglanti.b=0;
                            listele();
                }  
		});
                btnSilSarki.setBounds(350, 50, 97, 25);
		sar2.add(btnSilSarki);
                
                lblNewLabel = new JLabel("Şarkı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 10, 100, 20);
		sar3.add(lblNewLabel);
                
                
                JFormattedTextField ad3 = new JFormattedTextField();
		ad3.setBounds(150, 10, 150, 25);
		sar3.add(ad3);
                
                lblNewLabel = new JLabel("Tarih:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 50, 100, 20);
		sar3.add(lblNewLabel);
                
                JFormattedTextField tar3 = new JFormattedTextField();
		tar3.setBounds(150, 50, 150, 25);
		sar3.add(tar3);
                
                lblNewLabel = new JLabel("Sanatçı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 90, 100, 20);
		sar3.add(lblNewLabel);
                
                JFormattedTextField snt3 = new JFormattedTextField();
		snt3.setBounds(150, 90, 150, 25);
		sar3.add(snt3);
                
                lblNewLabel = new JLabel("Albüm:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 130, 100, 20);
		sar3.add(lblNewLabel);
                
                JFormattedTextField alb03 = new JFormattedTextField();
		alb03.setBounds(150, 130, 150, 25);
		sar3.add(alb03);
                
                lblNewLabel = new JLabel("Tür:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 170, 100, 20);
		sar3.add(lblNewLabel);
                
                JFormattedTextField tr3 = new JFormattedTextField();
		tr3.setBounds(150, 170, 150, 25);
		sar3.add(tr3);
                
                lblNewLabel = new JLabel("Süre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 210, 100, 20);
		sar3.add(lblNewLabel);
                
                JFormattedTextField sr3 = new JFormattedTextField();
		sr3.setBounds(150, 210, 150, 25);
		sar3.add(sr3);
                
                JButton btnduzen = new JButton("Güncelle");
		btnduzen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String id=table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
                            String ad= ad3.getText();
                            String tarih = tar3.getText();
                            String sanatci= snt3.getText();
                            String album= alb03.getText();
                            String tur = tr3.getText();
                            String sure = sr3.getText();
                            
                            baglanti.sarkiguncelle(id,ad, tarih, sanatci, album, tur, sure);
                            listele();
                        }
		});
		btnduzen.setBounds(350, 100, 97, 25);
		sar3.add(btnduzen);
                
      
                JScrollPane scrollPane2 = new JScrollPane();		
		scrollPane2.setBounds(100, 50, 800, 271);
		p2.add(scrollPane2);
                
                table2 = new JTable();
		modelim2.setColumnIdentifiers(kolonlar2);
                
                table2.setBounds(158, 219, 256, 123);
		scrollPane2.setViewportView(table2);
                
                JButton btnListele2 = new JButton("Listele");
		btnListele2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                             listele2();
			}
		});
		btnListele2.setBounds(1000, 200, 97, 25);
		p2.add(btnListele2);
                
                JPanel alb1= new JPanel();
                JPanel alb2= new JPanel();
                JPanel alb3= new JPanel();
                alb1.setLayout(null);
                alb1.setBackground(Color.BLACK);
                
                alb2.setLayout(null);
                alb2.setBackground(Color.BLACK);
                
                alb3.setLayout(null);
                alb3.setBackground(Color.BLACK);
                
                JTabbedPane tp3 = new JTabbedPane();
                tp3.setBounds(100, 350, 600, 500);
                tp3.add("Ekle",alb1);
                tp3.add("Sil",alb2);
                tp3.add("Düzenle",alb3);
                
                p2.add(tp3);
                
                lblNewLabel = new JLabel("Albüm Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 30, 150, 20);
		alb1.add(lblNewLabel);
                
                JFormattedTextField albumad = new JFormattedTextField();
		albumad.setBounds(150, 30, 150, 25);
		alb1.add(albumad);
                
                lblNewLabel = new JLabel("Sanatçı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 70, 150, 20);
		alb1.add(lblNewLabel);
                
                JFormattedTextField albumsnt = new JFormattedTextField();
		albumsnt.setBounds(150, 70, 150, 25);
		alb1.add(albumsnt);
                
                lblNewLabel = new JLabel("Tarih:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 110, 100, 20);
		alb1.add(lblNewLabel);
                
                JFormattedTextField albumtar = new JFormattedTextField();
		albumtar.setBounds(150, 110, 150, 25);
		alb1.add(albumtar);
                
                lblNewLabel = new JLabel("Tür:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 150, 100, 20);
		alb1.add(lblNewLabel);
                
                JFormattedTextField albumtur = new JFormattedTextField();
		albumtur.setBounds(150, 150, 150, 25);
		alb1.add(albumtur);
                
                JButton btnEkle2 = new JButton("Ekle");
		btnEkle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                        
                            String albumadi= albumad.getText();
                            String sanatci= albumsnt.getText();
                            String tarih = albumtar.getText();
                            String tur = albumtur.getText();
                            
                           
                            baglanti.albumEkle(albumadi, sanatci, tarih, tur);
                           
                            if(Baglanti.c==1){
                        JOptionPane.showMessageDialog(contentPane, "Başarıyla Eklendi");
                            albumad.setText(null);
                            albumtar.setText(null);
                            albumsnt.setText(null);
                            albumtur.setText(null);
                            }
                            else if(Baglanti.c==0)
                        JOptionPane.showMessageDialog(contentPane, "Girdilerinizi kontrol ediniz!!!");
                            
                            Baglanti.c=0;
                            listele2();
                            
                        }
                       
		});
                
                btnEkle2.setBounds(350, 150, 97, 25);
		alb1.add(btnEkle2);
                
                lblNewLabel = new JLabel("Albüm Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 50, 150, 20);
		alb2.add(lblNewLabel);
                
                JFormattedTextField albumsil = new JFormattedTextField();
		albumsil.setBounds(150, 50, 150, 25);
		alb2.add(albumsil);
    
                JButton btnSilAlbum = new JButton("Sil");
		btnSilAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                         String yer= "album";
                         String yeradi="albumAdi";
                         String ad = albumsil.getText();
                         baglanti.sil(yer, yeradi, ad);
                         
                         if(Baglanti.b==1){
                        JOptionPane.showMessageDialog(contentPane, "Başarıyla Silindi");
                        albumsil.setText(null);
                         }
                            else if(Baglanti.b==0)
                        JOptionPane.showMessageDialog(contentPane, "Albüm adını kontrol ediniz!!!");
                            
                            Baglanti.b=0;
                            listele2();
                }      
		});
                btnSilAlbum.setBounds(350, 50, 97, 25);
		alb2.add(btnSilAlbum);
                
                lblNewLabel = new JLabel("Albüm Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 30, 150, 20);
		alb3.add(lblNewLabel);
                
                JFormattedTextField albumad3 = new JFormattedTextField();
		albumad3.setBounds(150, 30, 150, 25);
		alb3.add(albumad3);
                
                lblNewLabel = new JLabel("Sanatçı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 70, 150, 20);
		alb3.add(lblNewLabel);
                
                JFormattedTextField albumsnt3 = new JFormattedTextField();
		albumsnt3.setBounds(150, 70, 150, 25);
		alb3.add(albumsnt3);
                
                lblNewLabel = new JLabel("Tarih:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 110, 100, 20);
		alb3.add(lblNewLabel);
                
                JFormattedTextField albumtar3 = new JFormattedTextField();
		albumtar3.setBounds(150, 110, 150, 25);
		alb3.add(albumtar3);
                
                lblNewLabel = new JLabel("Tür:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 150, 100, 20);
		alb3.add(lblNewLabel);
                
                JFormattedTextField albumtur3 = new JFormattedTextField();
		albumtur3.setBounds(150, 150, 150, 25);
		alb3.add(albumtur3);
                
                JButton btnduzen2 = new JButton("Güncelle");
		btnduzen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String id=table2.getModel().getValueAt(table2.getSelectedRow(), 0).toString();
                            String ad= albumad3.getText();
                            String sanatci= albumsnt3.getText();
                            String tarih = albumtar3.getText();
                            String tur = albumtur3.getText();
                            
                            
                            baglanti.albumguncelle(id, ad, sanatci, tarih, tur);
                            listele2();
                        }
		});
		btnduzen2.setBounds(350, 100, 97, 25);
		alb3.add(btnduzen2);
                
                JScrollPane scrollPane3 = new JScrollPane();		
		scrollPane3.setBounds(100, 50, 800, 271);
		p3.add(scrollPane3);
                
                table3 = new JTable();
		modelim3.setColumnIdentifiers(kolonlar3);
                
                table3.setBounds(158, 219, 256, 123);
		scrollPane3.setViewportView(table3);
                
                JButton btnListele3 = new JButton("Listele");
		btnListele3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            listele3();
			}
		});
		btnListele3.setBounds(1000, 200, 97, 25);
		p3.add(btnListele3);
                
                JPanel san1= new JPanel();
                JPanel san2= new JPanel();
                JPanel san3= new JPanel();
                san1.setLayout(null);
                san1.setBackground(Color.BLACK);
                
                san2.setLayout(null);
                san2.setBackground(Color.BLACK);
                
                san3.setLayout(null);
                san3.setBackground(Color.BLACK);
                
                JTabbedPane tp4 = new JTabbedPane();
                tp4.setBounds(100, 350, 600, 500);
                tp4.add("Ekle",san1);
                tp4.add("Sil",san2);
                tp4.add("Düzenle",san3);
                
                p3.add(tp4);
                
                lblNewLabel = new JLabel("Sanatçı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 30, 150, 20);
		san1.add(lblNewLabel);
                
                JFormattedTextField sanatciad = new JFormattedTextField();
		sanatciad.setBounds(155, 30, 150, 25);
		san1.add(sanatciad);
                
                lblNewLabel = new JLabel("Ülke:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 70, 150, 20);
		san1.add(lblNewLabel);
                
                JFormattedTextField ulke = new JFormattedTextField();
		ulke.setBounds(155, 70, 150, 25);
		san1.add(ulke);
                
                JButton btnEkle3 = new JButton("Ekle");
		btnEkle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                        
                            String sanatciadi= sanatciad.getText();
                            String sanatciUlke= ulke.getText();
                            
                            baglanti.sanatciEkle(sanatciadi, sanatciUlke);
                           
                            if(Baglanti.c==1){
                        JOptionPane.showMessageDialog(contentPane, "Başarıyla Eklendi");
                            sanatciad.setText(null);
                            ulke.setText(null);
                            
                            }
                            else if(Baglanti.c==0)
                        JOptionPane.showMessageDialog(contentPane, "Girdilerinizi kontrol ediniz!!!");
                            
                            Baglanti.c=0;
                            listele3();
                            
                        }
                       
		});
                
                btnEkle3.setBounds(150, 150, 97, 25);
		san1.add(btnEkle3);
                
                lblNewLabel = new JLabel("Sanatçı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 50, 150, 20);
		san2.add(lblNewLabel);
                
                JFormattedTextField sanatcisil = new JFormattedTextField();
		sanatcisil.setBounds(155, 50, 150, 25);
		san2.add(sanatcisil);
    
                JButton btnSilSanatci = new JButton("Sil");
		btnSilSanatci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                         String yer= "sanatci";
                         String yeradi="sanatciAdi";
                         String ad = sanatcisil.getText();
                         baglanti.sil(yer, yeradi, ad);
                         
                         if(Baglanti.b==1){
                        JOptionPane.showMessageDialog(contentPane, "Başarıyla Silindi");
                        sanatcisil.setText(null);
                         }
                            else if(Baglanti.b==0)
                        JOptionPane.showMessageDialog(contentPane, "Sanatçı adını kontrol ediniz!!!");
                            
                            Baglanti.b=0;
                            listele3();
                }      
		});
                btnSilSanatci.setBounds(350, 50, 97, 25);
		san2.add(btnSilSanatci);
                
                lblNewLabel = new JLabel("Sanatçı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 30, 150, 20);
		san3.add(lblNewLabel);
                
                JFormattedTextField sanatciad3 = new JFormattedTextField();
		sanatciad3.setBounds(155, 30, 150, 25);
		san3.add(sanatciad3);
                
                lblNewLabel = new JLabel("Ülke:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 70, 150, 20);
		san3.add(lblNewLabel);
                
                JFormattedTextField ulke3 = new JFormattedTextField();
		ulke3.setBounds(155, 70, 150, 25);
		san3.add(ulke3);
                
                JButton btnduzen3 = new JButton("Güncelle");
		btnduzen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String id=table3.getModel().getValueAt(table3.getSelectedRow(), 0).toString();
                            String sanatci= sanatciad3.getText();
                            String ulke= ulke3.getText();
                            
                            
                            
                            baglanti.sanatciguncelle(id, sanatci, ulke);
                            listele3();
                        }
		});
		btnduzen3.setBounds(350, 100, 97, 25);
		san3.add(btnduzen3);
                
                table.addMouseListener(new MouseAdapter() {
          
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e); 
                       System.out.println(table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
                       ad3.setText(table.getModel().getValueAt(table.getSelectedRow(), 1).toString());
                       tar3.setText(table.getModel().getValueAt(table.getSelectedRow(), 2).toString());
                       snt3.setText(table.getModel().getValueAt(table.getSelectedRow(), 3).toString());
                       alb03.setText(table.getModel().getValueAt(table.getSelectedRow(), 4).toString());
                       tr3.setText(table.getModel().getValueAt(table.getSelectedRow(), 5).toString());
                       sr3.setText(table.getModel().getValueAt(table.getSelectedRow(), 6).toString());
                    }
                });
                
                table2.addMouseListener(new MouseAdapter() {
          
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e); 
                       System.out.println(table2.getModel().getValueAt(table2.getSelectedRow(), 0).toString());
                       albumad3.setText(table2.getModel().getValueAt(table2.getSelectedRow(), 1).toString());
                       albumsnt3.setText(table2.getModel().getValueAt(table2.getSelectedRow(), 2).toString());
                       albumtar3.setText(table2.getModel().getValueAt(table2.getSelectedRow(), 3).toString());
                       albumtur3.setText(table2.getModel().getValueAt(table2.getSelectedRow(), 4).toString());
                       
                    }
                });
                table3.addMouseListener(new MouseAdapter() {
          
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e); 
                       System.out.println(table3.getModel().getValueAt(table3.getSelectedRow(), 0).toString());
                       sanatciad3.setText(table3.getModel().getValueAt(table3.getSelectedRow(), 1).toString());
                       ulke3.setText(table3.getModel().getValueAt(table3.getSelectedRow(), 2).toString());
                       
                       
                    }
                });
                 
    }
    
    
    
}
