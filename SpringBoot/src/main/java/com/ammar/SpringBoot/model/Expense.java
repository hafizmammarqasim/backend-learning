package com.ammar.SpringBoot.model;

//@Component
public class Expense {
    private int expId;
    private String expDesciption;
    private int expAmount;

    public Expense(int expId, String expDesciption, int expAmount) {
        this.expId = expId;
        this.expDesciption = expDesciption;
        this.expAmount = expAmount;
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
}
