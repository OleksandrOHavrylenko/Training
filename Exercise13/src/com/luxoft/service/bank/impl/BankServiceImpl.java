package com.luxoft.service.bank.impl;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.luxoft.domain.bank.Bank;
import com.luxoft.domain.bank.Client;
import com.luxoft.domain.bank.Gender;
import com.luxoft.exceptions.ClientExistsException;
import com.luxoft.service.bank.BankService;

public class BankServiceImpl implements BankService {

	//TODO: serialize the bank to the file represented by pathTo
	public void saveBank(final Bank bank, final String pathTo)
			throws IOException {
		
	}

	//TODO: deserialize the bank to the file represented by pathTo
	public Bank loadBank(final String pathFrom) throws IOException {
		
	}

	
	
}
