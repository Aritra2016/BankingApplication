package org.aritra.accounts.Repository;

import org.aritra.accounts.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
