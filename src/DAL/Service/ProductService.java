/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Service;

import DAL.Entity.Product;
import java.util.List;
import Utils.JdbcHelper;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Minh
 */
public class ProductService implements WareHouse<Product, String>{

    @Override
    public void insert(Product entity) {
        String sql ="insert into Product(MaSanPham, TenSanPham, MaTheLoai, Anh, GhiChu, TrangThai, IsDelete) values (?,?, ?, ?,?,?,?)";
        JdbcHelper.executeUpdate(sql, entity.getMaSanPham(), 
                                    entity.getTenSanPham(),
                                    entity.getMaTheLoai(),
                                    entity.getAnh(),
                                    entity.getGhiChu(),
                                    entity.getTrangThai(),
                                    entity.isIsDelete());
    }
    @Override
    public void update(Product entity) {
        String sql  = "update Product set TenSanPham=?, MaTheLoai =?, Anh= ?, GhiChu=?, TrangThai =? , IsDelete = ? where MaSanPham= ?";
        JdbcHelper.executeUpdate(sql, entity.getTenSanPham(),
                                    entity.getMaTheLoai(),
                                    entity.getAnh(),
                                    entity.getGhiChu(),
                                    entity.getTrangThai(),
                                    entity.isIsDelete(),
                                    entity.getMaSanPham());
    }

    @Override
    public void delete(String key) {
            String sql = "delete from Product where MaSanPham=?";
            JdbcHelper.executeUpdate(sql, key);
    }

    @Override
    public List<Product> selectALL() {
        return selectbySQL("Select * from Product");
     }
    @Override
    public Product select_by_id(String key) {
         List<Product> list= selectbySQL("Select * from Product where MaSanPham=?", key);
         if(list.isEmpty()){
             return null;
    }
           return list.get(0);
    }
    public List<Product> selectbySQL(String sql, Object... arg) {
         List<Product> listProduct =new ArrayList<>();
        try {
           
            ResultSet rs = JdbcHelper.executeQuery(sql, arg);
            while (rs.next()) {
                Product product = new Product();
                product.setMaSanPham(rs.getString("MaSanPham"));
                product.setTenSanPham(rs.getString("TenSanPham"));
                product.setMaTheLoai(rs.getString("MaTheLoai"));
                product.setAnh(rs.getString("Anh"));
                product.setGhiChu(rs.getString("GhiChu"));
                product.setTrangThai(rs.getInt("TrangThai"));
                product.setIsDelete(rs.getBoolean("IsDelete"));
                listProduct.add(product);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProduct;
        
    }  
    
    
}
