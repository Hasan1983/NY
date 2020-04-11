package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	public int employeeId();
	
	//employeeName() will return employee name
	public String employeeName();
	//employeeId() will return employee id.

	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();

	public static void totalEmployee(){
		int totalEmployee=500;
		System.out.println("total number of employee="+totalEmployee);
	}

}
