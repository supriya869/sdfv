package com.web.service;

import java.util.List;

import com.web.model.Bank;


public interface BankService {
	public Bank saveAccount(Bank bank);
	public Bank updateAccount(Bank bank);
	public void deleteAccount(int accno);
	public Bank getAccount(int accno);
	public List<Bank> getAllAccounts();
	//public List<Bank> transferMoney(String fromAccount, String toAccount, double tranfer_amount);
	//public Bank getToAccount(long targetAccno);
	//public Bank getTransfterAmount();
	public Bank getTransferAmount();
	
	
	
	
	
		
	
	
	

}
