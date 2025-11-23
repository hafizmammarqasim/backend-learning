package com.ammar.SpringBoot.repository;

import com.ammar.SpringBoot.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense, Integer> {

}
