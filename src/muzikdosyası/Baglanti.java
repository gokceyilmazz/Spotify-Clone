
package muzikdosyası;


import java.awt.Font;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Gökçe Yılmaz
 */
public class Baglanti {
    
    public static int sarkiId,albumId,sanatciId,kullaniciId;
    
    public static int b=0,c=0;
    
    public static ArrayList <Kullanici> kullanici =new ArrayList<>();
    public static ArrayList <Admin> admin =new ArrayList<>();
    public static ArrayList <Integer> Idsarki =new ArrayList<>();
    
    public static ArrayList <Integer> Idalbum =new ArrayList<>();
    
    public static ArrayList <Integer> Idsanatci =new ArrayList<>();
    
    public static ArrayList <Integer> Idkullanici =new ArrayList<>();
    
    public static Connection myConn;
	public static Statement myStat;
    
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "spotify";
    
    private String host = "localhost";
    
    private int port= 3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    
    
    public int preparedKullanicilariGetir(String kullaniciad,String parola){
    
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From kullanici";
            
            ResultSet rs  = statement.executeQuery(sorgu);
            
            while(rs.next()){

               Kullanici a= new Kullanici(rs.getString("kullaniciAdi"),rs.getString("sifre"));
                
                kullanici.add(a);
                
                Idkullanici.add(rs.getInt("kullaniciId"));
               
    
            }
            
             for (int i = 0; i <kullanici.size(); i++) { 
            if(kullanici.get(i).getKullaniciAd().equals(kullaniciad) && kullanici.get(i).getKullaniciSifre().equals(parola)){ 
                return 1; 
            }
            
        }
             int depo = Idkullanici.get(0);
            for (int i = 0; i < Idkullanici.size() ; i++) {
                if (Idkullanici.get(i) > depo) {
                depo = Idkullanici.get(i);
            }
            }
            
            kullaniciId=depo+1;
        return 0; 
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
         
        }
          return 0;
       
    }
    public int adminBilgi(String adminad,String parola){
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * From admin";
            ResultSet rs  = statement.executeQuery(sorgu);
            while(rs.next()){

               Admin a= new Admin(rs.getString("adminadi"),rs.getString("sifre"));
                
                admin.add(a);
              
            }
            for (int i = 0; i <admin.size(); i++) { 
            if(admin.get(i).getAdminadi().equals(adminad) && admin.get(i).getSifre().equals(parola)){ 
                return 1; 
            }
            
        }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public String kullaniciIdBul(String kullaniciad){
           String id="";
     
            
        try {
            statement = con.createStatement();
            String sorgu = "Select * From kullanici where kullaniciAdi = '"+kullaniciad+"'";
            
            ResultSet rs  = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
                id=rs.getString("kullaniciId");
                
            
            }
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            return id;
       
    }
    public String sarkiIdBul(String sarkiad){
           String id="";
     
            
        try {
            statement = con.createStatement();
            String sorgu = "Select * From sarki where sarkiAdi = '"+sarkiad+"'";
            
            ResultSet rs  = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
                id=rs.getString("sarkiId");
                
            
            }
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            return id;
       
    }
    public void sarkilariGetir(){
    
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From sarki";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
               
               
                Idsarki.add(rs.getInt("sarkiId"));
            }
            
            int depo = Idsarki.get(0);
            for (int i = 0; i < Idsarki.size() ; i++) {
                if (Idsarki.get(i) > depo) {
                depo = Idsarki.get(i);
            }
            }
            
            sarkiId=depo+1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
   public void albumleriGetir(){
    
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From album";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
               
                Idalbum.add(rs.getInt("albumId"));
            }
            
            int depo = Idalbum.get(0);
            for (int i = 0; i < Idalbum.size() ; i++) {
                if (Idalbum.get(i) > depo) {
                depo = Idalbum.get(i);
            }
            }
            
            albumId=depo+1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
   
   public void sanatcilariGetir(){
   
        try {
            statement = con.createStatement();
            String sorgu = "Select * From sanatci";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
               
                Idsanatci.add(rs.getInt("sanatciId"));
            }
            
            int depo = Idsanatci.get(0);
            for (int i = 0; i < Idsanatci.size() ; i++) {
                if (Idsanatci.get(i) > depo) {
                depo = Idsanatci.get(i);
            }
            }
            
            sanatciId=depo+1;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
   
       
   }
    
  
    public void sarkiEkle(String sarkiAdi,String tarih,String sanatci,String album,String tur,String sure){
    
        String turalbum = albumTurBul(album);
        if(turalbum.equals(tur)){
        String a= Integer.toString(sarkiId);
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("INSERT INTO sarki(sarkiId,sarkiAdi,tarih,sanatci,album,tur,sure,dinlenmeSayisi) VALUES (?,?,?,?,?,?,?,?)");
            st.setString(1,a);
            st.setString(2,sarkiAdi);
            st.setString(3,tarih);
            st.setString(4,sanatci);
            st.setString(5,album);
            st.setString(6,tur);
            st.setString(7,sure);
            st.setString(8,"0");
            st.executeUpdate();

            System.out.println("Başarıyla Eklendi");
            b=1;
            sarkiId=sarkiId+1;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Id:"+sarkiId);
        }
        else{
        b=2;
            System.out.println("tur album:"+turalbum+ "tur sarki:");
        }
    
    }
    
    public void albumEkle(String albumAdi,String sanatci,String tarih,String tur){
    
        String a= Integer.toString(albumId);
        PreparedStatement st = null;
        
        try {
            st = con.prepareStatement("INSERT INTO album(albumId,albumAdi,sanatci,tarih,tur) VALUES (?,?,?,?,?)");
            st.setString(1,a);
            st.setString(2,albumAdi);
            st.setString(3,sanatci);
            st.setString(4,tarih);
            st.setString(5,tur);
            st.executeUpdate();
            
            System.out.println("Başarıyla Eklendi");
            c=1;
            albumId=+1;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    }
    
    public void sanatciEkle(String sanatciAdi,String sanatciUlke){
    
        String a= Integer.toString(sanatciId);
        PreparedStatement st = null;
        
        try {
            st = con.prepareStatement("INSERT INTO sanatci(sanatciId,sanatciAdi,sanatciUlke) VALUES (?,?,?)");
            st.setString(1,a);
            st.setString(2,sanatciAdi);
            st.setString(3,sanatciUlke);
            st.executeUpdate();
            
            System.out.println("Başarıyla Eklendi");
            c=1;
            sanatciId=+1;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void sil(String yer,String yeradi,String ad){
    
        try {
            statement = con.createStatement();
            
            
            String sorgu = "Delete from " + yer + " where " + yeradi + " = '" +ad +"'" ;
            
            
            statement.executeUpdate(sorgu);
            
            b=1;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void sarkiguncelle(String id,String ad,String tarih,String sanatci,String album,String tur,String sure){
    
        try {
            statement= con.createStatement();
            
            String sorgu = "UPDATE sarki SET sarkiAdi= '"+ad+"', tarih= '"+tarih+"', sanatci= '"+sanatci+"', album= '"+album+"', tur= '"+tur+"', sure= '"+sure+"' WHERE sarkiId= '"+id+"'";
            
            statement.executeUpdate(sorgu);
            System.out.println(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void albumguncelle(String id,String ad,String sanatci,String tarih,String tur){
    
        try {
            statement= con.createStatement();
            
            String sorgu = "UPDATE album SET albumAdi= '"+ad+"', sanatci= '"+sanatci+"', tarih= '"+tarih+"', tur= '"+tur+"' WHERE albumId= '"+id+"'";
            
            statement.executeUpdate(sorgu);
            System.out.println(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sanatciguncelle(String id,String sanatci,String ulke){
    
        try {
            statement= con.createStatement();
            
            String sorgu = "UPDATE sanatci SET sanatciAdi= '"+sanatci+"', sanatciUlke= '"+ulke+"' WHERE sanatciId= '"+id+"'";
            
            statement.executeUpdate(sorgu);
            System.out.println(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void dinlenmeGuncelle(String sarkiAdi){
    
        try {
            statement = con.createStatement();
            String sorgu = "UPDATE sarki SET dinlenmeSayisi=dinlenmeSayisi+1 WHERE sarkiAdi= '"+sarkiAdi+"'";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void kullanicilariGetir(){
    
        String sorgu = "Select * From kullanici ";
        
        
        try {
            statement = con.createStatement();
            
            ResultSet rs =   statement.executeQuery(sorgu);
            
            while(rs.next()){
            
                int id = rs.getInt("kullaniciId");
                String kullaniciad = rs.getString("kullaniciAdi");
                String email = rs.getString("email");
                String sifre = rs.getString("sifre");
                String abonelik = rs.getString("abonelikTuru");
                String ulke = rs.getString("ulke");
                
                System.out.println("Id: " + id + " , kullanıcı adı: " + kullaniciad + " , email: " + email + " , abonelik türü: " + abonelik + " , ülke: " +ulke);
                
            }
                 
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    public ResultSet list(String kullanici,String tur){
    
        
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            String sorgu = "SELECT sarkiAdi,tarih,sanatci,album,tur,sure,dinlenmeSayisi FROM sarki where tur='"+tur+"' and sarkiId in(SELECT sarkiId FROM calmalistesi WHERE kullaniciId='"+kullanici+"')";
            
             rs = statement.executeQuery(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public ResultSet KullaniciAra(String kullaniciad){
    
       
        ResultSet rs = null;
        
        try {
            statement = con.createStatement();
            String sorgu = "Select * From kullanici where kullaniciAdi like '"+kullaniciad+"%'";
             rs =   statement.executeQuery(sorgu);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public ResultSet sarkiTabloAra(String yer,String ad){
    
       
        ResultSet rs = null;
        
        try {
            statement = con.createStatement();
            String sorgu = "Select * From sarki where "+yer+" like '"+ad+"%'";
             rs =   statement.executeQuery(sorgu);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public void takipciEkle(String kullaniciad,String takip){
    
       PreparedStatement st = null;
       
        try {
            st = con.prepareStatement("INSERT INTO takiplistesi(takipciId,takipId) VALUES (?,?)");
            st.setString(1,kullaniciad);
            st.setString(2,takip);
            st.executeUpdate();
            
            System.out.println("Takip edildi");
            c=1;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public ResultSet takipciGetir(String kullanici){
    
        
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            String sorgu = "SELECT kullaniciAdi FROM kullanici where kullaniciId in(SELECT takipId FROM takiplistesi WHERE takipciId='"+kullanici+"')";
            
             rs = statement.executeQuery(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public ResultSet ulkeGetir(){
    
        
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            String sorgu = "SELECT ulkeAdi FROM ulke";
            
             rs = statement.executeQuery(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public void calmaListesiEkle(String sarkiId,String kullaniciId, String turId){
    
        
        PreparedStatement st = null;
        
        try {
            st = con.prepareStatement("INSERT INTO calmalistesi(sarkiId,kullaniciId,turId) VALUES (?,?,?)");
            st.setString(1,sarkiId);
            st.setString(2,kullaniciId);
            st.setString(3,turId);
            st.executeUpdate();
            
            System.out.println("Çalma Listenize Eklendi");
            c=1;
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void kullaniciEkle(String kullaniciAdi,String email, String sifre,String abonelikTuru,String ulke){
    
        
        PreparedStatement st = null;
        String a=Integer.toString(kullaniciId);
        try {
            st = con.prepareStatement("INSERT INTO kullanici(kullaniciId,kullaniciAdi,email,sifre,abonelikTuru,ulke) VALUES (?,?,?,?,?,?)");
            st.setString(1,a);
            st.setString(2,kullaniciAdi);
            st.setString(3,email);
            st.setString(4,sifre);
            st.setString(5,abonelikTuru);
            st.setString(6,ulke);
            st.executeUpdate();
            
            System.out.println("Başarıyla Kaydoldunuz!!");
         
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String abonelikBul(String id){
    
        String abonelik="";
        try {
            statement = con.createStatement();
            String sorgu = "Select abonelikTuru From kullanici where kullaniciId= '"+id+"'";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
                abonelik= rs.getString("abonelikTuru");
            }
            return abonelik;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return abonelik;
    }
    public ResultSet turTopOn(String tur){
    
        
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM sarki where tur= '"+tur+"' ORDER BY dinlenmeSayisi DESC,sarkiAdi LIMIT 0,10";
            
             rs = statement.executeQuery(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet genelTopOn(){
    
        
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM sarki ORDER BY dinlenmeSayisi DESC,sarkiAdi LIMIT 0,10";
            
             rs = statement.executeQuery(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet ulkeTopOn(String ulke){
    
        
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM sarki where sanatci in (SELECT sanatciAdi FROM sanatci where sanatciUlke= '"+ulke+"') ORDER BY dinlenmeSayisi DESC,sarkiAdi LIMIT 0,10";
            
             rs = statement.executeQuery(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public String albumTurBul(String albumadi){
    
    String tur="";
        try {
            statement = con.createStatement();
            String sorgu = "Select tur From album where albumAdi= '"+albumadi+"'";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
                tur= rs.getString("tur");
            }
            return tur;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tur;
    
    }
    public Baglanti(){
    
    String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi ;
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }   catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı!!!!");
        }
    
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Baglanti başarısız!!!!");
        }
    
    }
    
    public static void main(String[] args) {
        
        Baglanti baglanti = new Baglanti();
        
        baglanti.sarkilariGetir();
        
        baglanti.albumleriGetir();
        
        baglanti.sanatcilariGetir();
        
        baglanti.preparedKullanicilariGetir("", "");
        
        System.out.println("kullaniciid:" + kullaniciId);
        
        
       
        
         
       
           
        
    }
}
