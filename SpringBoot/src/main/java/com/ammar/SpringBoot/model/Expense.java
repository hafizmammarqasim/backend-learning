package com.ammar.SpringBoot.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expId;
    private String expDesciption;
    private int expAmount;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    public Expense(){

    }

    public Expense(String expDesciption, int expAmount, Category category) {
        this.expId = expId;
        this.expDesciption = expDesciption;
        this.expAmount = expAmount;
        this.category = category;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public String getExpDesciption() {
        return expDesciption;
    }

    public void setExpDesciption(String expDesciption) {
        this.expDesciption = expDesciption;
    }

    public int getExpAmount() {
        return expAmount;
    }

    public void setExpAmount(int expAmount) {
        this.expAmount = expAmount;
    }

    public String getCategoryName(){
        return category.getCategory();
    }
}
