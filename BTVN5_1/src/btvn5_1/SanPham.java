
package btvn5_1;

import java.util.Scanner;

public class SanPham {
    protected int maSanPham;
    protected  String tenSanPham;
    protected String tenHangSanXuat; 
    protected int ngayNhap;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ma san pham : ");
        maSanPham = sc.nextInt();
        sc.nextLine();
        System.out.println("Ten san pham : ");
        tenSanPham = sc.nextLine();
        System.out.println("Ten hang san xuat : ");
        ngayNhap = sc.nextInt();
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", tenHangSanXuat=" + tenHangSanXuat + ", ngayNhap=" + ngayNhap + '}';
    }
    
    
    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String tenHangSanXuat, int ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSanXuat = tenHangSanXuat;
        this.ngayNhap = ngayNhap;
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
    
}
