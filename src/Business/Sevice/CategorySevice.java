/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Sevice;

import Business.DTO.CategoryDTO;
import java.util.List;
import DAL.Entity.Category;
import DAL.Service.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author Hoang Tue
 */
public class CategorySevice {
    CategoryService categorysevice = new CategoryService();
    public List<CategoryDTO> getAll(){
    List<Category> ListCategory = categorysevice.selectALL();
    List<CategoryDTO> ListCateDTO = new ArrayList<>();
                for (Category x : ListCategory) {
            CategoryDTO cateDTO = new CategoryDTO();
            cateDTO.setMaTheloai(x.getMaTheLoai());
            cateDTO.setTenTheloai(x.getTenTheLoai());
            cateDTO.setTrangThai(false);
            ListCateDTO.add(cateDTO);
        }
                return ListCateDTO;
    }
   
}
