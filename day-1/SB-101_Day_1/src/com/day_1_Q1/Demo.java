package com.day_1_Q1;
import java.util.Scanner;
import java.util.*;
public class Demo {
	
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();


EmployeeIdComp e=new EmployeeIdComp();
AddressComp a=new AddressComp();
SalaryComp s=new SalaryComp();


if(n==1) {
TreeSet<Employee> ts=new TreeSet<>(e);
ts.add(new Employee(12,"Ratan",50000,"UP"));
ts.add(new Employee(13,"batan",51000,"MP"));
ts.add(new Employee(14,"katan",5000,"Kolkata"));
ts.add(new Employee(15,"satan",53000,"Mumbai"));
ts.add(new Employee(16,"hatan",13000,"Bangalore"));
ts.add(new Employee(17,"matan",80000,"Hyderabad"));
System.out.println(ts);
}


else if(n==2) {
TreeSet<Employee> ts=new TreeSet<>(a);
ts.add(new Employee(12,"Ratan",50000,"UP"));
ts.add(new Employee(13,"batan",51000,"MP"));
ts.add(new Employee(14,"katan",5000,"Kolkata"));
ts.add(new Employee(15,"satan",53000,"Mumbai"));
ts.add(new Employee(16,"hatan",13000,"Bangalore"));
ts.add(new Employee(17,"matan",80000,"Hyderabad"));
System.out.println(ts);
}

else if(n==3){
	TreeSet<Employee> ts=new TreeSet<>(s);
	ts.add(new Employee(12,"Ratan",50000,"UP"));
	ts.add(new Employee(13,"batan",51000,"MP"));
	ts.add(new Employee(14,"katan",50000,"Kolkata"));
	ts.add(new Employee(15,"satan",53000,"Mumbai"));
	ts.add(new Employee(16,"hatan",13000,"Bangalore"));
	ts.add(new Employee(17,"matan",80000,"Hyderabad"));
	System.out.println(ts);
}




	
	
}


}
