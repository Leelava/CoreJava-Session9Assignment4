package collections.assignments;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class employeeTreeSet {

	public static void main(String[] args) {
		
		// default sorting based on Salary by passing EmployeeComparator object in treeSet constructor which implements
		// Salary comparison of two emp objects.
		
		TreeSet <Employee> ts = new TreeSet<Employee>(new EmployeeComparator());
		
		ts.add(new Employee("Kamath",2000,"Systems engineer"));
		ts.add(new Employee("Rama",1000,"Systems engineer"));
		ts.add(new Employee("Shyaama",6000,"Systems Analyst"));
		ts.add(new Employee("Bheema",2000,"Systems engineer"));
		
		//Printing the values sorted based on Salary
		System.out.println("Printing the set ,Sorted by Salary");
		System.out.println();
		
		Iterator<Employee> itr = ts.iterator();
        while(itr.hasNext()){
        	Employee emp1 =itr.next();
        
            System.out.println(emp1.name + " " +emp1.salary + " " +emp1.designation);
        			}
        
        //TreeSet element insertion based on Names using User defined Comparator EmpNameComparator
       
        TreeSet <Employee> ts1 = new TreeSet<Employee>(new EmpNameComparator());
        ts1.add(new Employee("Kamath",2000,"Systems Administrator"));
		ts1.add(new Employee("Rama",1000,"Systems engineer"));
		ts1.add(new Employee("Shyaama",3000,"Systems Analyst"));
		ts1.add(new Employee("Hema",4000,"Systems engineer"));
		ts1.add(new Employee("Hema",5000,"Associate Consultant"));
		System.out.println();
		//Printing employee details sorted by Names
		System.out.println("Printing the set ,Sorted by Names");
		System.out.println();
		Iterator<Employee> itr2 = ts1.iterator();
        while(itr2.hasNext()){
        	Employee emp2 =itr2.next();
        
            System.out.println(emp2.name + " " +emp2.salary + " " +emp2.designation);
            
        			} 
        
      
        
	}
}
