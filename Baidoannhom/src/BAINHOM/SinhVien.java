
package BAINHOM;

import java.io.Serializable;


public class SinhVien implements Serializable{
    private String masv;
    private String hoten;
    private int namsinh;
    private String email;
    private double GPA;
    private String anh;
    private String nganh;

    public SinhVien(String masv, String hoten, int namsinh, String email, double GPA, String anh, String nganh) {
        this.masv = masv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.email = email;
        this.GPA = GPA;
        this.anh = anh;
        this.nganh = nganh;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getEmail() {
        return email;
    }

    public double getGPA() {
        return GPA;
    }

    public String getAnh() {
        return anh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public SinhVien(){
        
    }

    void getAnh(String dJavaanh1jpg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
