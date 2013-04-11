package com.luxoft.service.bank.impl;

import com.luxoft.domain.client.Bank;
import com.luxoft.domain.client.Client;
import com.luxoft.domain.client.Gender;
import com.luxoft.exceptions.ClientExistsException;


public class BankServiceImpl {

	

	public Client addClient(final Bank bank, final String name,
			final Gender gender) throws ClientExistsException {
		Client client = new Client(name, gender);
		bank.addClient(client);
		return client;
	}

	
}
