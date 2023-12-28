package com.web.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SDFC_Banking_application")
public class Bank {
	@Id
	private int accno;
	private long targetAccno;
	private String name;
	private String password;
	private String c_password;
	private double amount;
	private String address;
	private long mno;
	private double transfer_amount;
	private double deposit_amount;
	private double withdraw_amount;
	private double new_balance;
	private String fromAccount;
	private String toAccount;
	public Bank() {
		super();
	}
	public Bank(int accno, long targetAccno, String name, String password, String c_password, double amount,
			String address, long mno, double transfer_amount, double deposit_amount, double withdraw_amount,
			double new_balance, String fromAccount, String toAccount) {
		super();
		this.accno = accno;
		this.targetAccno = targetAccno;
		this.name = name;
		this.password = password;
		this.c_password = c_password;
		this.amount = amount;
		this.address = address;
		this.mno = mno;
		this.transfer_amount = transfer_amount;
		this.deposit_amount = deposit_amount;
		this.withdraw_amount = withdraw_amount;
		this.new_balance = new_balance;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public long getTargetAccno() {
		return targetAccno;
	}
	public void setTargetAccno(long targetAccno) {
		this.targetAccno = targetAccno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getC_password() {
		return c_password;
	}
	public void setC_password(String c_password) {
		this.c_password = c_password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public double getTransfer_amount() {
		return transfer_amount;
	}
	public void setTransfer_amount(double transfer_amount) {
		this.transfer_amount = transfer_amount;
	}
	public double getDeposit_amount() {
		return deposit_amount;
	}
	public void setDeposit_amount(double deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	public double getWithdraw_amount() {
		return withdraw_amount;
	}
	public void setWithdraw_amount(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}
	public double getNew_balance() {
		return new_balance;
	}
	public void setNew_balance(double new_balance) {
		this.new_balance = new_balance;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", targetAccno=" + targetAccno + ", name=" + name + ", password=" + password
				+ ", c_password=" + c_password + ", amount=" + amount + ", address=" + address + ", mno=" + mno
				+ ", transfer_amount=" + transfer_amount + ", deposit_amount=" + deposit_amount + ", withdraw_amount="
				+ withdraw_amount + ", new_balance=" + new_balance + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + "]";
	}
	
}
