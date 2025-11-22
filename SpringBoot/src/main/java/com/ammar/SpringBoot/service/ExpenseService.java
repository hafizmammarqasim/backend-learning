package com.ammar.SpringBoot.service;

import com.ammar.SpringBoot.model.Expense;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
@Component
public class ExpenseService {

    List<Expense> expenseList = Arrays.asList(
            new Expense(10, "Burger", 500),
            new Expense(10,"Hair Cut",300),
            new Expense(10, "Biryani", 500)
            );


    public List<Expense> getExpenseList(){
        return expenseList;
    }
}
