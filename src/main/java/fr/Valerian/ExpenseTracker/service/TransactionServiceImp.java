package fr.Valerian.ExpenseTracker.service;

import fr.Valerian.ExpenseTracker.model.Transaction;
import fr.Valerian.ExpenseTracker.repository.TransactionReposi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImp implements TransactionService{

    private final TransactionReposi transactionRepository;

    public TransactionServiceImp(TransactionReposi transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction add(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }
}
