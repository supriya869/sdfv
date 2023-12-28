package com.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {
	@Autowired
	private BankRepo repo;
	
	@Override
    public Bank saveAccount(Bank bank) {
        double depositAmount = bank.getDeposit_amount();
        double currentBalance = bank.getAmount();
        double newBalance = currentBalance + depositAmount;
        bank.setAmount(newBalance);
        Bank updatedAccount = repo.save(bank);
        String formattedDepositAmount = String.format("$%.2f", depositAmount);
        System.out.println("Your account has increased by: " + formattedDepositAmount);
        return updatedAccount;
    }
	
	@Override
	public List<Bank> getAllAccounts() {
		List<Bank> listofAccounts=(List<Bank>) repo.findAll();
		return listofAccounts;
	}
	
	@Override
	public void deleteAccount(int accno) {
		repo.deleteById(accno);		
	}
	
	@Override
	public Bank getAccount(int accno) {
		Bank get=repo.findById(accno).get();
		return get;
	}


	@Override
	public Bank updateAccount(Bank bank) {
		return null;
		
	}
	/*@Override
    @Transactional
    public List<Bank> transferMoney(String fromAccount, String toAccount, double transferAmount) {
        Bank from = repo.findByAccno(fromAccount);
        Bank to = repo.findByAccno(toAccount);

        if (from == null || to == null) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if (transferAmount <= 0) {
            throw new IllegalArgumentException("Invalid transfer amount");
        }

        if (from.getAmount() < transferAmount) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        try {
            // Deduct from the source account
            from.setAmount(from.getAmount() - transferAmount);

            // Add to the target account
            to.setAmount(to.getAmount() + transferAmount);

            // Save both accounts within a single transaction
            repo.save(from);
            repo.save(to);

            // Return a list of updated bank accounts
            return getAllAccounts(); // Assuming you have a getAllAccounts() method
        } catch (Exception e) {
            throw new RuntimeException("Error occurred during the transfer", e);
        }
    }

	*/
	/*@Transactional
    public List<Bank> transferMoney(String fromAccount, String toAccount, double transferAmount) {
        Bank from = repo.findByAccno(fromAccount);
        Bank to = repo.findByTargetAccno(toAccount);

        if (from == null || to == null) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if (from.getAmount() < transferAmount) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        try {
            
            from.setAmount(from.getAmount() - transferAmount);
            to.setAmount(to.getAmount() + transferAmount);

            
            List<Bank> updatedAccounts = (List<Bank>) repo.saveAll(List.of(from, to));

            return updatedAccounts;
        } catch (Exception e) {
            
            throw new RuntimeException("Error occurred during the transfer", e);
        }
        
        
    }
	*/

	@Override
	public Bank getTransferAmount(Bank bank) {
		double cur_bal=bank.getAmount();
		return null;
	}

	
	

	
	
}
	
