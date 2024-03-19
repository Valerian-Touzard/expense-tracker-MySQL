package fr.Valerian.ExpenseTracker.controller;

import fr.Valerian.ExpenseTracker.model.Transaction;
import fr.Valerian.ExpenseTracker.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/create")
    public Transaction add(@RequestBody Transaction transaction) {
        return transactionService.add(transaction);
    }

    @GetMapping("")
    public List<Transaction> getAllTransaction() {
        return transactionService.getAllTransaction();
    }
}
