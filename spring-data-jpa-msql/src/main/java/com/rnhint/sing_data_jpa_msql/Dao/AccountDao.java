package com.rnhint.sing_data_jpa_msql.Dao;

import com.rnhint.sing_data_jpa_msql.Repository.AccountRepository;
import com.rnhint.sing_data_jpa_msql.Dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AccountDao {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        Optional<Account> optional = accountRepository.findById(id);
        if(optional.isEmpty()) {
            return null;
        } else return optional.get();
    }
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
    public Account updateAccount(Account account,Long id) {
        Account existingaccount= getAccountById(id);
        if(existingaccount != null) {
            existingaccount.setId(account.getId());
            existingaccount.setName(account.getName());
            return accountRepository.save(existingaccount);
        } else return null;
    }
}
