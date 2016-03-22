package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import java.util.Date;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void StaffTest1() throws PersonException {
		ArrayList<Staff> ListofStaff = new ArrayList<Staff>();
		Date Birthday = new Date(1990, 12, 31);
		ListofStaff.add(new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "(302)-223-1122", "Email",
				"officeHours", 6, 60000, Birthday, null));
		ListofStaff.add(new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "(302)-223-1122", "Email",
				"officeHours", 6, 70000, Birthday, null));
		ListofStaff.add(new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "(302)-223-1122", "Email",
				"officeHours", 6, 80000, Birthday, null));
		ListofStaff.add(new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "(302)-223-1122", "Email",
				"officeHours", 6, 90000, Birthday, null));
		ListofStaff.add(new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "(302)-223-1122", "Email",
				"officeHours", 6, 100000, Birthday, null));
		double totalSalary = 0;
		for (Staff Employee : ListofStaff) {
			totalSalary = totalSalary + Employee.getSalary();
		}
		double Expectedvalue = 80000;
		double Actualvalue = totalSalary / 5;
		assertEquals(Expectedvalue, Actualvalue, .1);
	}

	@Test(expected = PersonException.class)
	public void StaffTest2() throws PersonException {
		Date Birthday = new Date(1990, 12, 31);
		Staff TestStaff1 = new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "6", "Email",
				"officeHours", 6, 60000, Birthday, null);
	}

	@Test(expected = PersonException.class)
	public void StaffTest3() throws PersonException {
		Date Birthday = new Date(5, 31, 12);
		Staff TestStaff1 = new Staff("FirstName", "MiddleName", "LastName", Birthday, "Address", "(302)-222-3344", "Email",
				"officeHours", 6, 60000, Birthday, null);
	}
	
}
