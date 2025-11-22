package com.ammar.SpringBoot.service;

import com.ammar.SpringBoot.model.Expense;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ExpenseService {

    //Arrays.asList creates a fixed size, so we wrapped it inside new ArrayList
    List<Expense> expenseList = new ArrayList<>(Arrays.asList(
            new Expense(10, "Burger", 500),
            new Expense(11,"Hair Cut",300),
            new Expense(12, "Biryani", 500)
            ));


    public List<Expense> getExpenseList(){
        return expenseList;
    }

    public void addExpense(Expense e){
        expenseList.add(e);
    }

    public Expense getExpenseById(int id){
        for(Expense e:expenseList){
            if(e.getExpId()==id){
                System.out.println(e.getExpId()+ " "+e.getExpDesciption());
                return e;
            }
        }
        return null;
    }

    public void updateExpense(Expense e){
        //We don't have function for update, so we have to manually write logic
        int index = findIndexById(e.getExpId());
        //Check whether the expense exists?
        if(index > -1){
            //list.add() add the the product at that index and move others one step ahead
            //expenseList.add(index,e);
            expenseList.set(index,e);
        }
    }

    public void deleteExpense(int id){
        //We need index to delete by expenseList.remove() function
        int index = findIndexById(id);

        if(index > -1){
            expenseList.remove(index);
            System.out.println("Expense removed successfully");
        }

    }

    //Helping function to find index of specific id
    public int findIndexById(int id){

        for(int i=0; i<expenseList.size(); i++){
            if(expenseList.get(i).getExpId() == id)
                return i;
        }
        return -1;
    }
}
