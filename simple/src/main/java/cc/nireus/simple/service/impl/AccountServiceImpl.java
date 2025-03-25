package cc.nireus.simple.service.impl;

import cc.nireus.simple.mapper.AccountMapper;
import cc.nireus.simple.model.Account;
import cc.nireus.simple.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional
    public Account createAccount(Account account) {
        accountMapper.insert(account);
        return account;
    }

    @Override
    @Transactional
    public void deleteAccount(Long id) {
        accountMapper.deleteById(id);
    }

    @Override
    @Transactional
    public Account updateAccount(Account account) {
        accountMapper.update(account);
        return account;
    }

    @Override
    public Account getAccountById(Long id) {
        return accountMapper.findById(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountMapper.findAll();
    }
}