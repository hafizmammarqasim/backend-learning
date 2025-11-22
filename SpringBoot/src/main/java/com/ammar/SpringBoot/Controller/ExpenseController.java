package com.ammar.SpringBoot.Controller;

import com.ammar.SpringBoot.service.ExpenseService;
import com.ammar.SpringBoot.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("expenses")
    public List<Expense> getExpense(){
        return expenseService.getExpenseList();
    }
}
