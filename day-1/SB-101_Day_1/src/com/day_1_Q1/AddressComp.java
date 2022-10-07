package com.day_1_Q1;

import java.util.Comparator;

public class AddressComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getAddress().compareTo(e2.getAddress());
		
	}

}
