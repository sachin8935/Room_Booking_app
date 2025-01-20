package com.example.profpride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.profpride.models.Expense;

@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}