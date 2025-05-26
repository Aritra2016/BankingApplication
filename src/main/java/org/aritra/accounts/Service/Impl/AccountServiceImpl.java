package org.aritra.accounts.Service.Impl;

import lombok.AllArgsConstructor;
import org.aritra.accounts.Contant.AccountsConstants;
import org.aritra.accounts.DTO.CustomerDto;
import org.aritra.accounts.Entity.Account;
import org.aritra.accounts.Entity.Customer;
import org.aritra.accounts.Exception.CustomerAlreadyExistsException;
import org.aritra.accounts.Mapper.CustomerMapper;
import org.aritra.accounts.Repository.AccountRepository;
import org.aritra.accounts.Repository.CustomerRepository;
import org.aritra.accounts.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {


    private AccountRepository accountRepository;

    private CustomerRepository customerRepository;


    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer= CustomerMapper.mapToCustomer(customerDto, new Customer()); // CustomerDto will be converted to CustomerObject
Optional<Customer> optionalCustomer =customerRepository.findByMobileNumber(customerDto.getMobileNumber());
     if(optionalCustomer.isPresent()){
         throw new CustomerAlreadyExistsException("Customer is already there with mobileNumber "+ customerDto.getMobileNumber());
     }
        Customer savedCustomer= customerRepository.save(customer);
        accountRepository.save(createNewAccount(savedCustomer));
    }


       private Account createNewAccount(Customer customer){ // accept Customer entity in method parameter
        Account newAccount= new Account();
        newAccount.setCustomeId(customer.getCustomerId());// populating or setting in NewAccount
           long randomAccNumber = 1000000000L + new Random().nextInt(900000000); //seting random accountNumber


           newAccount.setAccountNumber(randomAccNumber);
           newAccount.setAccountType(AccountsConstants.SAVINGS);
           newAccount.setBranchAddress(AccountsConstants.ADDRESS);
           return newAccount;
       }
}
