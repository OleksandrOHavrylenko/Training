package com.luxoft.domain.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.luxoft.exceptions.ClientExistsException;

public class Bank implements Serializable {

	//TODO: define a list of clients using generics.
	


	public Client addClient(final Client client) throws ClientExistsException {

		if (getClientByName(client.getName()) != null) {
			throw new ClientExistsException("Client with name: "
					+ client.getName() + " has already in the bank", client);
		}
		
		//TODO: add a client to the list
		
		

		return client;
	}

	public Client getClientByName(final String name) {
		//TODO: iterate thru the list of clients and find one whith the required name
		return null;
	}

	@Override
	public String toString() {

		StringBuffer clientsString = new StringBuffer("The bank has: \n");
		//TODO: add information about all the cleints
		
		return clientsString.toString();
	}

	public List<Client> getClientsList() {
		//TODO: apply unmodifiable strategy
		
	}

}
