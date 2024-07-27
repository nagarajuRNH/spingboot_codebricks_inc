package com.rnhint.sing_data_jpa_msql.Repository;

import com.rnhint.sing_data_jpa_msql.Dto.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {


}
