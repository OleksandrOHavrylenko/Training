package com.luxoft.service.bank;

import com.luxoft.domain.client.Bank;


public interface BankReportPresentationService {

	public void printNumberOfClients(Bank bank);

	public void printNumberOfOpenedAccounts(Bank bank);

	public void printAccountsSortedByDeposit(Bank bank, boolean ascending);

	public void printClientsAccounts(Bank bank);

	void setBankReportService(final BankReportService bankReportService);
}
