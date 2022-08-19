package me.rcjuancarlos.mybankdaw.controllers;

import me.rcjuancarlos.mybankdaw.models.AccountModel;
import me.rcjuancarlos.mybankdaw.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/account")
    public AccountModel addAccount(@RequestBody AccountModel account) {
        return this.accountService.addAccount(account);
    }

    @PutMapping("/account-balance")
    public AccountModel updateBalance(@RequestBody AccountModel account) {
        return this.accountService.updateBalance(account);
    }
}