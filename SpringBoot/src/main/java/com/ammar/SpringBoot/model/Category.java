package com.ammar.SpringBoot.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Automatic Id increment
    private int categoryId;
    private String category;

    // THE RELATIONSHIP (The Parent Side)
    // "mappedBy" tells Hibernate: "Go look at the 'category' field in the Expense class to find the configuration."
    // cascade = ALL means: If I delete a Category, delete all its expenses too (Optional, but useful).
    @OneToMany(mappedBy = "category",
            cascade = CascadeType.ALL)
    private List<Expense> expenses;

    public Category(){

    }

    public Category(String category, List<Expense> expenses) {
        this.category = category;
        this.expenses = expenses;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
