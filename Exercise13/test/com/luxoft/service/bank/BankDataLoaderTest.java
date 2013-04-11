package com.luxoft.service.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.luxoft.domain.account.CheckingAccount;
import com.luxoft.domain.bank.Bank;
import com.luxoft.domain.bank.Client;
import com.luxoft.domain.bank.Gender;
import com.luxoft.service.bank.impl.BankServiceImpl;

public class BankDataLoaderTest {

	@Test
	public void testAddClientFromString() {
		BankDataLoader bankDataLoader = new BankDataLoader();
		bankDataLoader.setBankService(new BankServiceImpl());
		Bank bank = new Bank();
		String line = "accounttype=c;balance=100;overdraft=50;name=John;gender=m;";
		bankDataLoader.addClientFromString(bank, line);
		Client client = bank.getClient(0);
		assertNotNull(client);
		assertEquals("John", client.getName());
		assertEquals(Gender.MALE, client.getGender());
		assertNotNull(client.getAccount());
		
		assertEquals(100, client.getAccount().getBalance());
		assertEquals(50, ((CheckingAccount)client.getAccount()).getOverdraft());
	}

}
