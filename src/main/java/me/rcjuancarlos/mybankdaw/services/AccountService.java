package me.rcjuancarlos.mybankdaw.services;

import me.rcjuancarlos.mybankdaw.models.AccountModel;
import me.rcjuancarlos.mybankdaw.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.sql.Date;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public AccountModel addAccount(AccountModel account){
        java.util.Date now = new java.util.Date();
        Date date = new Date(now.getTime());
        account.setOpenedIn(date);
        return this.accountRepository.save(account);
    }

    public AccountModel updateBalance(AccountModel account) {
        Optional<AccountModel> acc = this.accountRepository.findById(account.getId());
        if(acc.isEmpty()) return null;
        AccountModel newAcc = acc.get();
        newAcc.setBalance(account.getBalance());
        return this.accountRepository.save(newAcc);
    }
}
