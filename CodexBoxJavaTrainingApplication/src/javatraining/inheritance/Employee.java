package javatraining.inheritance;

public class Employee extends Person{
    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
