package com.luxoft.domain.email;

public interface Queue {

	public Email getEmail();

	public void addEmail(Email email);

	public void close();
}
