package com.luxoft;

public class AppClient {

	public static void main(final String[] args) {
		ClientDao clientDao = new ClientDaoImpl();
		Client client = new Client();
		// add method is not called in transaction
		clientDao.add(client);

		// TODO: create ClientDao proxy which will analyse Transactional
		// annotation and "start" a transaction.

	}

}
