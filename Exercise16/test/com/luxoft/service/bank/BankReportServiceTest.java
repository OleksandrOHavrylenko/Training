package com.luxoft.service.bank;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.luxoft.domain.account.Account;
import com.luxoft.domain.client.Bank;
import com.luxoft.domain.client.Client;
import com.luxoft.domain.client.Gender;
import com.luxoft.exceptions.ClientExistsException;
import com.luxoft.service.bank.impl.BankReportServiceImpl;
import com.luxoft.service.bank.impl.BankServiceImpl;

public class BankReportServiceTest {

	private BankReportService bankReportService;
	private Bank bank;
	@Before
	public void setup() throws ClientExistsException {
		bankReportService = new BankReportServiceImpl();
		BankServiceImpl bankService = new BankServiceImpl();
		bank = new Bank();
		Client client1 = bankService.addClient(bank, "John", Gender.MALE);
		
		com.luxoft.domain.account.Account account2 = new com.luxoft.domain.account.CheckingAccount(2, 100, 0);
		client1.addAccount(account2);
		
		com.luxoft.domain.account.Account account3 = new com.luxoft.domain.account.CheckingAccount(3, 50, 0);
		client1.addAccount(account3);

	}
	@Test
	public void testGetNumberOfClients() {
		assertEquals(1, bankReportService.getNumberOfClients(bank));
	}

	@Test
	public void testGetNumberOfOpenAccounts() {
		assertEquals(2, bankReportService.getNumberOfOpenAccounts(bank));
	}
	

	@Test
	public void testGetAccountsSortedByDeposit() {
		List<Account> accountsSortedByDeposit = bankReportService.getAccountsSortedByDeposit(bank, true);
		Iterator<Account> iterator = accountsSortedByDeposit.iterator();
		assertEquals(3, iterator.next().getAccountNumber());
		assertEquals(2, iterator.next().getAccountNumber());
	}

	
}
