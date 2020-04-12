package design;

import java.util.Scanner;
public class EmployeeInfo extends EmployeeUpdate{


	int EmployeeId;
	String name;
	public  final int Salary=80000;
	final String countryname="u.s.a";
	int salary=0;
	int year=0;


	public int employeeId(){
		return this.id;
	}
	public String employeeName(){
		return this.name;
	}
	public void assignDepartment(){
		super.assignDepartment();
	}
	public int calculateSalary() {
		return this.Salary;
	}
	public void benefitLayout(){
		System.out.println("medical,bonus");

	}
	 void employeePhoneNumber(){
		System.out.println( "get the phone number from databases");


}
public EmployeeInfo(){

	}









	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.id=employeeId;

	}
	public void Employeeinformation(String name, int employeeId, int salary, String companyname){
		this.name=name;
		this.id=employeeId;
		this.salary=salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getCountryname() {
		return countryname;
	}





	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany, double yearlySalary){
		double yearlyBonus = 0.00;
		if (numberOfYearsWithCompany == 5) {
			yearlyBonus = yearlySalary* 0.1;
		} else if (numberOfYearsWithCompany == 4) {
			yearlyBonus = yearlySalary * 0.08;
		} else if (numberOfYearsWithCompany == 3) {
			yearlyBonus = yearlySalary * 0.06;
		} else if (numberOfYearsWithCompany == 2) {
			yearlyBonus = 0;
			System.out.println("Your performance is poor, needs improvement.");
		} else {
			yearlyBonus = 0;
			System.out.println("You do not meet the standards for a bonus.");
		}
		return (int) yearlyBonus;
	}


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension



		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}






