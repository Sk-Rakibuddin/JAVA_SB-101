package com.day_1_Q1;

import java.util.Comparator;

public class EmployeeIdComp implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		if(s1.getEmpId()>s2.getEmpId()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
