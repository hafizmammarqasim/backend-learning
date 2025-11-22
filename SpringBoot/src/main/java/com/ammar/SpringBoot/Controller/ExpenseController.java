package com.ammar.SpringBoot.Controller;

import com.ammar.SpringBoot.service.ExpenseService;
import com.ammar.SpringBoot.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("expenses")
    public List<Expense> getExpense(){
        return expenseService.getExpenseList();
    }

    // @PostMapping
    // We use POST when we want to SEND data to the server (like submitting a form).
    // @RequestBody
    // This tells Spring: "Hey, don't look in the URL. Look inside the actual box (Body) of the
    @PostMapping("expenses")
    public void addExpense(@RequestBody Expense e){
        expenseService.addExpense(e);
    }

    @GetMapping("expenses/{id}")
    public Expense getExpenseById(@PathVariable int id){
        return expenseService.getExpenseById(id);
    }

    @PutMapping("expenses")
    public void updateExpense(@RequestBody Expense e){
        expenseService.updateExpense(e);
    }

    @DeleteMapping("expenses/{expId}")
    public void deleteExpenseById(@PathVariable int expId){
        expenseService.deleteExpense(expId);
    }
}
