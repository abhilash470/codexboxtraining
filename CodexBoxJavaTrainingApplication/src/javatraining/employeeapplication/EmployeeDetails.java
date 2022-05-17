package javatraining.employeeapplication;

public class EmployeeDetails extends Employee {
    public static void main(String[] args) {
        //EmployeeDetails emp1 =new EmployeeDetails(20221,"Abhilash","Software engineer",12000);

        Employee e1=new Employee("Abhilash",20221,"Software engineer",12000);
        Employee e2=new Employee("kalyan",20222,"Software engineer",12000);

      /* List<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2); */
        System.out.println(e1);
        System.out.println(e2);
        /*  for(Employee employees: emp){
           System.out.println(employees.getId());
           System.out.println(employees.getName());
           System.out.println(employees.getDesignation());
           System.out.println( employees.getSalary());
        } */

    }
}
