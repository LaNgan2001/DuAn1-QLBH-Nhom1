/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DTO;

/**
 *
 * @author Hoang Tue
 */
public class ProducDetailDTO {
    private String tenSanpham;
    private String moTa;
    private boolean trangThai = false;

    public ProducDetailDTO() {
    }

    public ProducDetailDTO(String tenSanpham, String moTa) {
        this.tenSanpham = tenSanpham;
        this.moTa = moTa;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ProducDetailDTO{" + "tenSanpham=" + tenSanpham + ", moTa=" + moTa + ", trangThai=" + trangThai + '}';
    }
    
}
