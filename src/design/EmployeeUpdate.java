package design;

public abstract class EmployeeUpdate implements Employee {

      int id;
       String name;
       public  final int Salary=80000;
       static String CompanyName="Target";
       String Department;

       public int employeeId(){

         return this.id;
    }
    public String employeeName(){

         return this.name;
    }
    public void assignDepartment(){
        System.out.println("there are few deparment");
    }
    public int calculateSalary(){
    return this.Salary;

    }
    public void benefitLayout(){
        System.out.println("medical,bonus");

    }
     void employeePhoneNumber(){
        System.out.println( "get the phone number from databases");
    }




    public  EmployeeUpdate(){

    }    EmployeeUpdate(String name){
           this.name=name;
    }

}


