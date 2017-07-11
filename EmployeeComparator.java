package collections.assignments;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {

	@Override
	//performs salary based comparison
	public int compare(Object o1, Object o2) {
		int i=0;
		Employee emp1= (Employee)o1;
		Employee emp2= (Employee)o2;
		
		if (emp1.salary < emp2.salary)
			i=-1;
		else
			if(emp1.salary >emp2.salary)
				i=1;
			else 
				if(emp1.salary == emp2.salary)// salaries are equal , considering names for comparison
				{
					 i= emp1.name.compareToIgnoreCase(emp2.name);
				       
				}

		
		
		return i;
	}

	
	

}
