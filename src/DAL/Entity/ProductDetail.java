/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Entity;

/**
 *
 * @author Minh
 */
public class ProductDetail {
    private String maSanPhamChiTiet;
    private String tenSanPham;
    private int soLuong;
    private String giaNhap;
    private String maSanPham;
    private String maTheLoai;
    private int maSize;
    private int maMau;
    private boolean trangThai;

    public ProductDetail() {
    }

    public ProductDetail(String maSanPhamChiTiet, String tenSanPham, int soLuong, String giaNhap, String maSanPham, String maTheLoai, int maSize, int maMau, boolean trangThai) {
        this.maSanPhamChiTiet = maSanPhamChiTiet;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.maSanPham = maSanPham;
        this.maTheLoai = maTheLoai;
        this.maSize = maSize;
        this.maMau = maMau;
        this.trangThai = trangThai;
    }

    public String getMaSanPhamChiTiet() {
        return maSanPhamChiTiet;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getGiaNhap() {
        return giaNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public int getMaSize() {
        return maSize;
    }

    public int getMaMau() {
        return maMau;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setMaSanPhamChiTiet(String maSanPhamChiTiet) {
        this.maSanPhamChiTiet = maSanPhamChiTiet;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaNhap(String giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

   
    
}
