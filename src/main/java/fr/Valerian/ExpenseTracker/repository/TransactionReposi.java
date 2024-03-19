package fr.Valerian.ExpenseTracker.repository;

import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionReposi extends JpaRepository<Transaction, Long> {
}
