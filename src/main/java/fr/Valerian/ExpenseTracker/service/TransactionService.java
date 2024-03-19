package fr.Valerian.ExpenseTracker.service;

import fr.Valerian.ExpenseTracker.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction add(Transaction transaction);

    List<Transaction> getAllTransaction();
}
