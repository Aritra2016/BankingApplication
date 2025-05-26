package org.aritra.accounts.Service;

import org.aritra.accounts.DTO.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);


}
