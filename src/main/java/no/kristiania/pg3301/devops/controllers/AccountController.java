package no.kristiania.pg3301.devops.controllers;

import no.kristiania.pg3301.devops.entities.Account;
import no.kristiania.pg3301.devops.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(path = "/ping")
    public String ping() {
        return "pong";
    }

    @RequestMapping(path = "/pong")
    public String pong() {
        return "ping";
    }

    @RequestMapping(path = "/accounts/{ssn}")
    public List<Account> getAccounts(@PathVariable("ssn") String ssn) {
        return accountRepository.findByPersonalNumber(ssn);
    }
}
