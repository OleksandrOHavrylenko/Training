package com.luxoft.service.bank;

import java.io.IOException;

import com.luxoft.domain.bank.Bank;
import com.luxoft.domain.bank.Client;
import com.luxoft.domain.bank.Gender;
import com.luxoft.exceptions.ClientExistsException;

public interface BankService {

	void saveBank(Bank bank, String pathTo) throws IOException;

	Bank loadBank(String pathFrom) throws IOException;


	Client addClient(Bank bank, String name, Gender gender)
			throws ClientExistsException;

}