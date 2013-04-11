package com.luxoft.domain.email.impl;

import java.util.ArrayList;
import java.util.List;

import com.luxoft.domain.email.Email;
import com.luxoft.domain.email.Queue;

//TODO: implement the queue which is list-based.
public class QueueImpl implements Queue {

	List<Email> mails = new ArrayList<Email>();

	public void addEmail(Email email) {
		// TODO implement
		
	}

	public void close() {
		// TODO implement
		
	}

	public Email getEmail() {
		// TODO implement
		return null;
	}
	
}
