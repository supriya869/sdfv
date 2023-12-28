package com.web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {

	//Bank findByAccno(String fromAccount);

	// Bank findByAccno(String accno);
	//Bank findByTargetAccno(String targetAccno);


	

}
