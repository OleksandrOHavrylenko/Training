package com.luxoft.service.bank;

import java.util.List;
import java.util.Map;

import com.luxoft.domain.account.Account;
import com.luxoft.domain.client.Bank;
import com.luxoft.domain.client.Client;

public interface BankReportService {

	int getNumberOfClients(Bank bank);

	int getNumberOfOpenAccounts(Bank bank);

	int getNumberOfAccounts(Bank bank);

	//TODO: define appropriate return type
	getAccountsSortedByDeposit(Bank bank, boolean ascending);

	getCustomerAccounts(Bank bank);

}