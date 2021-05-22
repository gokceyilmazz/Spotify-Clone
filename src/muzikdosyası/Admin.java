/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muzikdosyası;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Admin {
    private String adminadi;
    private String sifre;

    public Admin() {
    }

    
    public Admin(String adminadi, String sifre) {
        this.adminadi = adminadi;
        this.sifre = sifre;
    }

    public String getAdminadi() {
        return adminadi;
    }

    public void setAdminadi(String adminadi) {
        this.adminadi = adminadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}
