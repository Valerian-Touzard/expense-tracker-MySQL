package fr.Valerian.ExpenseTracker.repository;

import fr.Valerian.ExpenseTracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionReposi extends JpaRepository<Transaction, Long> {
}
