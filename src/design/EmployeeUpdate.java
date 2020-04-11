package design;

public abstract class EmployeeUpdate implements Employee {

    public int employeeId(){
         int totalemployeeId=500;
         return totalemployeeId;
    }
    public String employeeName(){
        String totalemployeeName="500";
         return totalemployeeName;
    }
    public void assignDepartment(){
        int totalDepartment=10;
        int itDEpartmentEmployee=100;
        int  QaDepartmentEmployee=50;
        System.out.println(totalDepartment);
        System.out.println(QaDepartmentEmployee);
        System.out.println(itDEpartmentEmployee);
    }
    public int calculateSalary(){
     int fulltimehours=0;
     int halftimehours=0;
     int salary;
     return calculateSalary();
    }
    public void benefitLayout(){
        System.out.println("medical,bonus");

    }
    abstract void employeePhonenubmer();


}
