
package btvn5_1;

import java.util.Scanner;

public class Dieuhoa  extends SanPham implements Comparable <Dieuhoa>{
    private int congSuat;
    private int giaBan;

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cong suat : ");
        congSuat= sc.nextInt();
        System.out.println("Gia Ban : ");
        giaBan = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()  + "Dieuhoa{" + "congSuat=" + congSuat + ", giaBan=" + giaBan + '}';
    }
    
    public Dieuhoa() {
    }

    public Dieuhoa(int congSuat, int giaBan) {
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public Dieuhoa(int congSuat, int giaBan, int maSanPham, String tenSanPham, String tenHangSanXuat, int ngayNhap) {
        super(maSanPham, tenSanPham, tenHangSanXuat, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

//    @Override
//    public int compareTo(Dieuhoa o) {
//        int min = 40;
//        for(int i = 0; i<o.giaBan;i++){
//            if(this.giaBan<min){
//                min = this.giaBan;              
//            }
//        }
//        return this.giaBan;

    public int compareTo(Dieuhoa min) {
        return 0;
        
    }
         
    }


    

