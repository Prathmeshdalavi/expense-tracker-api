
package com.example.expensetracker.repository;
import com.example.expensetracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ExpenseRepository extends JpaRepository<Expense, Long> {}
