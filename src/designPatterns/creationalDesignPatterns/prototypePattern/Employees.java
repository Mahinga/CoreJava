/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.prototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MAHINGA
 *
 */
public class Employees implements Cloneable{
	
	private List<String> employeesList;
	
	public Employees(){
		employeesList= new ArrayList();
	}
	
	public Employees(List<String> employees){
		employeesList= employees;
	}
	
	/**
	 * Suppose this method will load data from DB 
	 * @return list of employee
	 */
	public void loadData(){
		// Here DB calling goes... 
		employeesList.add("mahinga");
		employeesList.add("raman");
	}

	public List<String> getEmployeesList() {
		return employeesList;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * 
	 * Everytime, instead of making DB call to fetch data, we could clone the object
	 * and could do manipulation over it.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> tempEmployeeList= new ArrayList();
		this.employeesList.forEach(employee -> tempEmployeeList.add(employee));
		return new Employees(tempEmployeeList);
	}

}
