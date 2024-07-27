package com.rnhint.sing_data_jpa_msql.Controller;

import com.rnhint.sing_data_jpa_msql.Dto.Account;
import com.rnhint.sing_data_jpa_msql.Dto.ResponseStructure;
import com.rnhint.sing_data_jpa_msql.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class AccountController {
    @Autowired
    AccountService accountService;

//    @GetMapping("/listAccount")
//    public List<Account> listAccount() {
//        return accountService.getAllAccounts();
//    }
//
//    @GetMapping("/{getAccountbyId}")
//    public Optional<Account> getAccountById(@PathVariable Long id) {
//        return accountService.getAccountById(id);
//    }

    @PostMapping("/createAccount")
    public ResponseStructure<Account> createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/getAllAccounts")
    public ResponseStructure<List<Account>> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/getAccountById/{id}")
    public ResponseStructure<Account> getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @PutMapping("updateAccount/{id}")
    public ResponseStructure<Account> updateAccount(@RequestBody Account account,@PathVariable Long id) {
        return accountService.updateAccount(account,id);
    }
}
