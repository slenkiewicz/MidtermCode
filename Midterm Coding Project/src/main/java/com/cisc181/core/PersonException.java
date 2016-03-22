package com.cisc181.core;

import java.util.Calendar;

public class PersonException extends Exception {
	private Person Person;

	public PersonException(Person Person){
		Person = this.Person;
	}
}
