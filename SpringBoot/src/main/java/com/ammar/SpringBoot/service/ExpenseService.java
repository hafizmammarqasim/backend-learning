package com.ammar.SpringBoot.service;

import com.ammar.SpringBoot.model.Expense;
import com.ammar.SpringBoot.repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ExpenseService {
    ExpenseRepo expRepo;

    @Autowired
    public ExpenseService(ExpenseRepo expRepo){
        this.expRepo = expRepo;
    }

    //Arrays.asList creates a fixed size, so we wrapped it inside new ArrayList
//    List<Expense> expenseList = new ArrayList<>(Arrays.asList(
//            new Expense(10, "Burger", 500),
//            new Expense(11,"Hair Cut",300),
//            new Expense(12, "Biryani", 500)
//            ));


    public List<Expense> getExpenseList(){
        return expRepo.findAll();
    }

    public void addExpense(Expense e){
        expRepo.save(e);
    }

    public Expense getExpenseById(int id){
        return expRepo.findById(id).orElse(new Expense());
    }

    public void updateExpense(Expense e){
        expRepo.save(e);
    }

    public void deleteExpense(int id){
        expRepo.deleteById(id);
    }

    //Helping function to find index of specific id
//    public int findIndexById(int id){
//
//        for(int i=0; i<expenseList.size(); i++){
//            if(expenseList.get(i).getExpId() == id)
//                return i;
//        }
//        return -1;
//    }
}
