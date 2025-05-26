package org.aritra.accounts.Service.Impl;

import lombok.AllArgsConstructor;
import org.aritra.accounts.DTO.CustomerDto;
import org.aritra.accounts.Repository.AccountRepository;
import org.aritra.accounts.Repository.CustomerRepository;
import org.aritra.accounts.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
