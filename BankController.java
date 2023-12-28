package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Bank;
import com.web.service.BankService;

@Controller
public class BankController {
	@Autowired
	private BankService service;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/home")
	public String userForm()
	{
		return "home";
	}
	@RequestMapping("newAccount")
	public String addAccount()
	{
		return "newAccount";
	}
	@RequestMapping("/register")
	public String response(Bank bank)
	{
		Bank b=service.saveAccount(bank);
		return "success";
	}
	
	@RequestMapping("/balance")
	public String balanceForm()
	{
		return "balance";
	}
	@RequestMapping("/balanceEnquiry")
	public String enquiry(ModelMap model, @RequestParam int accno)
	{
	    Bank account = service.getAccount(accno);

	    if (account != null) 
	    {
	        model.addAttribute("account", account); 
	        return "balanceEnquire";
	    } 
	    else
	    {
	        
	        model.addAttribute("error", "Account not found");
	        return "balance"; 
	    }
	}
	@RequestMapping("/viewAccounts")
	public String viewAllAccounts(ModelMap model)
	{
		model.put("viewall", service.getAllAccounts());
		return "viewAccounts";
	}
	@RequestMapping("/deposit")
	public String deposit()
	{
		return "deposit";
	}
	@RequestMapping("/afterDeposit")
	public String afterdepositing(ModelMap model, @RequestParam int accno, @RequestParam double deposit_amount) 
	{
	    Bank account = service.getAccount(accno);

	    if (account != null) 
	    {
	        
	        double currentBalance = account.getAmount();
	        double newBalance = currentBalance + deposit_amount;
	        account.setAmount(newBalance);
	        service.saveAccount(account);

	        
	        String formattedDepositAmount = String.format("$%.2f", deposit_amount);

	      
	        model.addAttribute("message", "Your account has increased by: " + formattedDepositAmount); 

	        
	        return "afterDeposit";
	    } 
	    else 
	    {
	        model.addAttribute("error", "Account not found");
	        return "error"; 
	    }
	}
	@RequestMapping("/withdraw")
	public String withdrawForm()
	{
		return "withdraw";
	}
	@RequestMapping("/afterWithdraw")
	public String withdrawAmount(ModelMap model, @RequestParam int accno, @RequestParam double withdraw_amount)
	{
		Bank account = service.getAccount(accno);

	    if (account != null)
	    {
	        
	        double currentBalance = account.getAmount();
	        double newBalance = currentBalance - withdraw_amount;
	        account.setAmount(newBalance);
	        service.saveAccount(account);

	        
	        String formattedWithdrawAmount = String.format("$%.2f", withdraw_amount);

	      
	        model.addAttribute("message", "Your account has decreased by: " + formattedWithdrawAmount); 

	        
	        return "afterWithdraw";
	    } 
	    else 
	    {
	        model.addAttribute("error", "Account not found");
	        return "error"; 
	    }
	}
	@RequestMapping("/transfer")
	public String transferForm()
	{
		return "transfer";
	}
	@RequestMapping("/afterTransfer")
	public String transferMoney(ModelMap model, @RequestParam int accno, @RequestParam double withdraw_amount,@RequestParam long targetAccno)
	{
		Bank account=service.getTransferAmount();
		double cur_bal=account.getAmount();
		double tr_amt=account.getTransfer_amount();
		return "redirect:/viewAccounts";
		
	}
	/*@PostMapping("/afterTransfer")
    public String transferMoney(
        @RequestParam("fromAccount") String fromAccount,
        @RequestParam("toAccount") String toAccount,
        @RequestParam("amount") double transferAmount,
        ModelMap model
    ) {
        try {
            service.transferMoney(fromAccount, toAccount, transferAmount);
            model.put("message", "Transfer success");
        } catch (IllegalArgumentException e) {
            model.put("error", e.getMessage());
        } catch (Exception e) {
            model.put("error", "Transfer failed");
        }
        model.put("afterTransfer", service.getAllAccounts());
        return "afterTransfer";
    }*/
	/*@RequestMapping(value = "/afterTransfer")
	public String transferMoney(@RequestBody(required = false) List<Bank> banks,@RequestParam("fromAccount") String fromAccount,@RequestParam("toAccount") String toAccount,@RequestParam("amount") double transfer_amount,ModelMap model)
	{
		//Bank account = service.getAccount(accno);
		model.put("afterTransfer", service.getAllAccounts());
		try {
			service.transferMoney(fromAccount,toAccount,transfer_amount);
			model.put("message", "transfer success");
		}
		catch(Exception e){
			model.put("error", "transfer failed");
		}
		return "afterTransfer";
	}
	
	*/
	
	@RequestMapping("/closeAccount")
	public String deleteAccount()
	{
		return "closeAccount";
	}
	@RequestMapping("/afterDeleting")
	public String afterDelete(@RequestParam int accno)
	{
		service.deleteAccount(accno);
		return "redirect:/viewAccounts";
	}
	@RequestMapping("/aboutUs")
	public String about()
	{
		return "aboutUs";
	}
	


}
