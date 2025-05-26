package org.aritra.accounts.Controller;

import lombok.AllArgsConstructor;
import org.aritra.accounts.Contant.AccountsConstants;
import org.aritra.accounts.DTO.AccountDto;
import org.aritra.accounts.DTO.CustomerDto;
import org.aritra.accounts.DTO.ResponseDto;
import org.aritra.accounts.Repository.AccountRepository;
import org.aritra.accounts.Service.IAccountService;
import org.aritra.accounts.Service.Impl.AccountServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api", produces= MediaType.APPLICATION_JSON_VALUE) //It means it supports ResponseType of JSON
@AllArgsConstructor

public class AccountController {

    private IAccountService iAccountService;

    /*
    1) @RequestBody= To accept request from Client( customer side) ,
     */

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount (@RequestBody CustomerDto customerDto){

        iAccountService.createAccount(customerDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.MESSAGE_201));
    }

}
