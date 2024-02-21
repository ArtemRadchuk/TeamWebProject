package com.example.task.services;

import com.example.task.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();
    Account create(Account account);
}
