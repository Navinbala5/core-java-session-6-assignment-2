package com.example.mypackage;

public class TestBankATM {
public static void main(String[] args) {
	BankATM b1=new BankATM(1000, "state  bank", "chennai", 10000);
	BankATM b2=new BankATM(1000, "state bank", "chennai", 10000);
	BankATM b3=new BankATM(1000, "state bank", "chennai", 10000);
	try {
		b1.withdraw(500);
		b1.deposit(200);
	}catch(Exception e) {
		System.out.println("Exception has occurred "+e);
	}
	try {
		b2.withdraw(600);
		b2.deposit(300);
	}catch(Exception e) {
		System.out.println("Exception has occurred "+e);
	}
	try {
		b3.withdraw(11300);
		b3.deposit(1700);
	}catch(Exception e) {
		System.out.println("Exception has occurred "+e);
	}
}
}
