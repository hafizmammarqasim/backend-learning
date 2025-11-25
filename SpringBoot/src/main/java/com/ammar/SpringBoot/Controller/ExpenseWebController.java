package com.ammar.SpringBoot.Controller;

import com.ammar.SpringBoot.model.Expense;
import com.ammar.SpringBoot.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExpenseWebController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/")
    public String getExpenses(Model model) {
        List<Expense> expList = expenseService.getExpenseList();

        model.addAttribute("allExpenses",expList);
        return "index";
    }

}
