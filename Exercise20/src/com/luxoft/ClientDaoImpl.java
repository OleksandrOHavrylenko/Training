package com.luxoft;

public class ClientDaoImpl implements ClientDao {

	public void add(final Client client) {
		System.out.println("ClientDaoImpl: will be saving client");
	}

	public void update(final Client client) {
		System.out.println("ClientDaoImpl: will be updating client");
	}

	public void find(final int clientId) {
		System.out.println("ClientDaoImpl: will be finding a client");
	}
}
