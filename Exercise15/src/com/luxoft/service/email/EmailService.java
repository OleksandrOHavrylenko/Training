package com.luxoft.service.email;

import com.luxoft.domain.email.Email;
import com.luxoft.domain.email.Queue;
import com.luxoft.domain.email.impl.QueueImpl;

public class EmailService implements Runnable {

	private Queue queue = new QueueImpl();
	
	private static EmailService instance = new EmailService();

	public static EmailService getEmailService() {
		return instance;
	}
}
