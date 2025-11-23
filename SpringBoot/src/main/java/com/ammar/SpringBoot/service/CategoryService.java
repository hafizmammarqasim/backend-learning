package com.ammar.SpringBoot.service;

import com.ammar.SpringBoot.model.Category;
import com.ammar.SpringBoot.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    CategoryRepo catRepo;

    @Autowired
    public CategoryService(CategoryRepo catRepo) {
        this.catRepo = catRepo;
    }

    public List<Category> getAllCategories(){
        return catRepo.findAll();
    }

    public Category getCategoryById(int id){
        return catRepo.findById(id).orElse(new Category());
    }

    public void addCategory(Category c){
        catRepo.save(c);
    }
}
