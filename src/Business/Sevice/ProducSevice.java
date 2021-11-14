/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Sevice;

import Business.DTO.ProducDetailDTO;
import DAL.Entity.Product;
import DAL.Entity.ProductDetail;
import DAL.Service.ProductDetailService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Tue
 */
public class ProducSevice {

    ProductDetailService seviceProduc = new ProductDetailService();

    public List<ProducDetailDTO> getAll() {
        List<ProductDetail> listProduct = seviceProduc.selectALL();
        List<ProducDetailDTO> lisProDTO = new ArrayList<>();
        for (ProductDetail x : listProduct) {
            ProducDetailDTO proDTO = new ProducDetailDTO();
            proDTO.setTenSanpham(x.getTenSanPham());
            lisProDTO.add(proDTO);
        }
        return lisProDTO;
    }
}
