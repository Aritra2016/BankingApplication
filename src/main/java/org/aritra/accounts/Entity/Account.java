package org.aritra.accounts.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Account extends BaseEntity{

    private Long customeId;

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
