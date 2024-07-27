package com.rnhint.sing_data_jpa_msql.Service;

import com.rnhint.sing_data_jpa_msql.Dao.AccountDao;
import com.rnhint.sing_data_jpa_msql.Dto.ResponseStructure;
import com.rnhint.sing_data_jpa_msql.Repository.AccountRepository;
import com.rnhint.sing_data_jpa_msql.Dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public ResponseStructure<Account> createAccount(Account account) {
        ResponseStructure<Account> responseStructure = new ResponseStructure<Account>();
        Account account1 = accountDao.createAccount(account);
        if (account1 != null) {
            responseStructure.setData(account1);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Account created Successfully");
        } else {
            responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
        }
        return responseStructure;
    }

    public ResponseStructure<List<Account>> getAllAccounts() {
        ResponseStructure<List<Account>> responseStructure = new ResponseStructure<>();
        List<Account> accounts = accountDao.getAllAccounts();
        if (accounts != null) {
            responseStructure.setData(accounts);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("List of Accounts from Accounts Table");
        } else {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("No Records found in Accounts Table");
        }
        return responseStructure;
    }




}
