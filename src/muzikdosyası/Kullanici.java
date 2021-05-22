
package muzikdosyası;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Kullanici {
    private String kullaniciAd;
    private String kullaniciSifre;

    public Kullanici() {
    }

    
    
    public Kullanici(String kullaniciAd, String kullaniciSifre) {
        this.kullaniciAd = kullaniciAd;
        this.kullaniciSifre = kullaniciSifre;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }
    
    
    
}
