package org.aritra.accounts.DTO;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AccountDto {
    //Don't want to flow Id data in UI & different
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
