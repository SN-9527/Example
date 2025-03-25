package cc.nireus.simple.service;


import cc.nireus.simple.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    void deleteAccount(Long id);
    Account updateAccount(Account account);
    Account getAccountById(Long id);
    List<Account> getAllAccounts();
}