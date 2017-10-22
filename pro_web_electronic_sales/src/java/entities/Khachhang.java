package entities;
// Generated Oct 22, 2017 11:52:34 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Khachhang generated by hbm2java
 */
public class Khachhang  implements java.io.Serializable {


     private int maKh;
     private String hoten;
     private String email;
     private String password;
     private String sodienthoai;
     private String diachi;
     private Set donhangs = new HashSet(0);

    public Khachhang() {
    }

	
    public Khachhang(int maKh) {
        this.maKh = maKh;
    }
    public Khachhang(int maKh, String hoten, String email, String password, String sodienthoai, String diachi, Set donhangs) {
       this.maKh = maKh;
       this.hoten = hoten;
       this.email = email;
       this.password = password;
       this.sodienthoai = sodienthoai;
       this.diachi = diachi;
       this.donhangs = donhangs;
    }
   
    public int getMaKh() {
        return this.maKh;
    }
    
    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public Set getDonhangs() {
        return this.donhangs;
    }
    
    public void setDonhangs(Set donhangs) {
        this.donhangs = donhangs;
    }




}


