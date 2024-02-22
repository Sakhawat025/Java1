public class Employee {
    int employeeid;
    String name;
    double salary;
    String department;
    // Employee(int employeeid,String name,double salary,String department){
    //     this.employeeid=employeeid;
    //     this.name=name;
    //     this.salary=salary;
    //     this.department=department;
    // }

    Employee(int employeeid,String name,double salary,String department){
        this.employeeid=employeeid;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

    void increaseSelary(double amount){
        salary+=amount;
    }
     public void increaseSalary(int percentage) {
          salary = salary+(salary*percentage / 100);
          System.out.println("Salary: "+salary);
    }
    void displayEmployeeDetails(){
        System.out.println("Employee Id: "+employeeid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }
    void updateDepartment(String newDepartment){
        department=newDepartment;
    }
}
