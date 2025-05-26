package org.aritra.accounts.Mapper;

import org.aritra.accounts.DTO.AccountDto;
import org.aritra.accounts.Entity.Account;

public class AccountMapper {

    //Entity to Dto
    public static AccountDto mapToAccountsDto(Account account, AccountDto accountDto){
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBranchAddress(account.getBranchAddress());

        return accountDto;
    }

    //Dto to Entity
    public static Account mapToAccount(AccountDto accountDto,Account account){
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBranchAddress(accountDto.getBranchAddress());

        return  account;
    }
}
