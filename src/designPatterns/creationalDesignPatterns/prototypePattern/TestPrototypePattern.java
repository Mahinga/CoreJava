/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.prototypePattern;

import java.util.List;

/**
 * @author MAHINGA
 *
 */
public class TestPrototypePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employees employees= new Employees();
		employees.loadData();
		try{
//		Everytime, instead of making DB call to fetch data, we could clone the object
//		 and could do manipulation over it.
		Employees employeesNew1= (Employees) employees.clone();
		List<String> employeeList1 =  employeesNew1.getEmployeesList();
		employeeList1.add("Seerat");
		Employees employeesNew2= (Employees) employees.clone();
		List<String> employeeList2 =  employeesNew2.getEmployeesList();
		employeeList2.remove("raman");
		
		System.out.println("Original Employee list -- "+employees.getEmployeesList());
		System.out.println("First New Employee list -- "+employeeList1);
		System.out.println("Second New Employee list -- "+employeeList2);

		}
		catch(CloneNotSupportedException  exception){
			exception.printStackTrace();
		}
		
	}

}
