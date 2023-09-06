package org.loop.codingWithJava1;

public class Employee extends Person{

    private String title;
    private String employer;
    private String employeeGrade;
    private String salary;

    public Employee(String name,String title, String employer, String employeeGrade, String salary){
        super(name);
        this.title=title;
        this.employer=employer;
        this.employeeGrade=employeeGrade;
        this.salary=salary;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setEmployer(String employer){
        this.employer=employer;
    }

    public void setEmployeeGrade(String employeeGrade){
        this.employeeGrade=employeeGrade;
    }

    public void setSalary(String salary){
        this.salary=salary;
    }

    public String getTitle(){
        return title;
    }

    public String getEmployer(){
        return employer;
    }

    public String getEmployeeGrade(){
        return employeeGrade;
    }

    public String getSalary(){
        return salary;
    }

    public String toString(){
        return String.format("Title-%s Employer-%s EmployeeGrade-%s Salary-%s name-%s email-%s phone-%s",title,employer,employeeGrade,salary,super.getName(),super.getEmail(),super.getPhone());
    }


    public static void main(String[] args){

        Employee employee=new Employee("Raja","Supervisor","TATA","A","10,0000");
        employee.setName("Raja");
        employee.setPhone("782738238");
        employee.setEmail("abc@gmail.com");
        employee.setTitle("Supervisor");
        employee.setEmployer("TATA");
        employee.setEmployeeGrade("A");
        employee.setSalary("10,000");

        System.out.println(employee);

    }
}
