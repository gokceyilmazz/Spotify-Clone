
package muzikdosyası;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Gökçe Yılmaz
 */

public class girisEkran extends JFrame {

       public int d=0;
       Baglanti baglanti  = new Baglanti();
     
        public static int a;
	private JPanel contentPane;
	
	static JButton btn1;
	static JLabel lblNewLabel;
	private JPasswordField passwordField;
        

        String kullaniciAdi,sifre;
        Object kullaniciTuru;
        
        AdminEkrani ekran1=new AdminEkrani();
        KullaniciEkrani ekran2 = new KullaniciEkrani();
        Kaydol ekran3 = new Kaydol();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					
                                        new girisEkran().setVisible(true);
                                        
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
               
             
	}

	
	public girisEkran() {
           
             
            
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                contentPane.setBackground(Color.BLACK);
                
		
		lblNewLabel = new JLabel("MÜZİK DOSYAM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(600, 10, 500, 200);
		contentPane.add(lblNewLabel);
                
                JLabel icon3 = new JLabel();
		icon3.setIcon(new ImageIcon ("src\\logo.png"));
		icon3.setBounds(600, 130, 250, 250);
		contentPane.add(icon3);
               
		JComboBox admin = new JComboBox();
                admin.setBounds(650, 400, 150, 25);
                admin.addItem("Admin");
                admin.addItem("Kullanıcı");
                contentPane.add(admin);
		
                JLabel icon1 = new JLabel();
		icon1.setIcon(new ImageIcon ("src\\kullanici.png"));
		icon1.setBounds(540, 460, 100, 100);
		contentPane.add(icon1);
                
                JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(650, 500, 150, 25);
		contentPane.add(formattedTextField);
                
                JLabel icon2 = new JLabel();
		icon2.setIcon(new ImageIcon ("src\\sifre.png"));
		icon2.setBounds(560, 545, 100, 100);
		contentPane.add(icon2);
                
		passwordField = new JPasswordField();
		passwordField.setBounds(650, 580, 150, 25);
		contentPane.add(passwordField);
		
		btn1 = new JButton("Giriş Yap");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                            kullaniciTuru= admin.getSelectedItem();
                             if(formattedTextField.getText().isEmpty() && passwordField.getText().isEmpty()){
        JLabel message=new JLabel("Kullanıcı adınızı ve şifrenizi giriniz!!");
        message.setFont(new Font("Arial",Font.BOLD,48));
        JOptionPane.showMessageDialog(null, message);
        }
                             else{
				if(formattedTextField.getText().isEmpty()){
        JLabel message=new JLabel("Kullanıcı adı boş bırakılamaz!");
        message.setFont(new Font("Arial",Font.BOLD,48));
        JOptionPane.showMessageDialog(null, message);
        }
        else{
         kullaniciAdi=formattedTextField.getText();
                                    System.out.println("Kullanıcı adı: "+kullaniciAdi);
                                }
                                
                                if(passwordField.getText().isEmpty()){
        JLabel message=new JLabel("Lütfen Şiffrenizi giriniz!!");
        message.setFont(new Font("Arial",Font.BOLD,48));
        JOptionPane.showMessageDialog(null, message);
        }
        else{
         sifre=passwordField.getText();
         
                                    System.out.println("Şifre: "+sifre);
                                    System.out.println("Kullanıcı türü: "+kullaniciTuru);
                                    if(admin.getSelectedItem().equals("Admin")){
                                        a=baglanti.adminBilgi(kullaniciAdi, sifre);
                                        System.out.println("durum:"+a);
                                        if(a==0){
                                        JLabel message=new JLabel("Kullanıcı adı veya şifre hatalı!!");
                                        message.setFont(new Font("Arial",Font.BOLD,48));
                                        JOptionPane.showMessageDialog(null, message);
                                        }
                                        else{
                                         System.out.println("Admin sayfası açılıyor...");
                                        ekran1.setVisible(true);
                                        d=1;
                                        }
                                    }
                                    else if(admin.getSelectedItem().equals("Kullanıcı")){
                                        a= baglanti.preparedKullanicilariGetir(kullaniciAdi,sifre);
                                        System.out.println("durum:"+a);
                                        if(a==0){
                                        JLabel message=new JLabel("Kullanıcı adı veya şifre hatalı!!");
                                        message.setFont(new Font("Arial",Font.BOLD,48));
                                        JOptionPane.showMessageDialog(null, message);
                                        }
                                        else{
                                        System.out.println("Kullanıcı sayfası açılıyor...");
                                        
                                        
                                        ekran2.setVisible(true);
                                        ekran2.kullanici=kullaniciAdi;
                                        d=1;
                                        }
                                    }
                                }
                                
                             }
              
			}
                        
		});
		btn1.setBounds(680, 630, 97, 25);
		contentPane.add(btn1);
		
               JButton btn2 = new JButton("Kaydol");
               btn2.addActionListener(new ActionListener() {
	       public void actionPerformed(ActionEvent e) {
                   
                   ekran3.setVisible(true);
                   
               }
                   });
		btn2.setBounds(680, 670, 97, 25);
		contentPane.add(btn2);
                
                
	}

   

   
	
	
}
