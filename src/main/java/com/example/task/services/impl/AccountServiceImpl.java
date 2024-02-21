package com.example.task.services.impl;

import com.example.task.domain.Account;
import com.example.task.reposities.AccountRepository;
import com.example.task.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;
    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account create(Account account) {
        return repository.save(account);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}
