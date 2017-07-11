package collections.assignments;
import java.util.Comparator;
public class EmpNameComparator implements Comparator {

	@Override
	//Performs name based comparison
	public int compare(Object o1, Object o2) {
		int i=0;
		Employee emp1= (Employee)o1;
		Employee emp2= (Employee)o2;
		
				 i= emp1.name.compareToIgnoreCase(emp2.name);
				 if (i==0)
				 {
					 // Names are equal considers designation
				   i=emp1.designation.compareToIgnoreCase(emp2.designation);  
				}

		
		
		return i;
	}

}
