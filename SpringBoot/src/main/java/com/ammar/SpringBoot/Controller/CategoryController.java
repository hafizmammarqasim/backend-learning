package com.ammar.SpringBoot.Controller;

import com.ammar.SpringBoot.model.Category;
import com.ammar.SpringBoot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    CategoryService catService;

    @Autowired
    public CategoryController(CategoryService catService){
        this.catService = catService;
    }

    @PostMapping("category")
    public void addCategory(@RequestBody Category category){
        catService.addCategory(category);
    }

    @GetMapping("category")
    public List<Category> getAllCategories(){
        return catService.getAllCategories();
    }

}
