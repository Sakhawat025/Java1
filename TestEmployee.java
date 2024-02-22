public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee(101, "Sakhawat", 1000.00, "cse");
        Employee employee2 = new Employee(2, "Jane Smith", 60000, "Marketing");
        Employee employee3 = new Employee(3, "Alice Johnson", 70000, "HR");

        employee1.increaseSelary(102);
        employee2.increaseSelary(103);
        employee3.increaseSelary(104);

        
        employee1.displayEmployeeDetails();
        System.out.println();
        employee2.displayEmployeeDetails();
        System.out.println();
        employee3.displayEmployeeDetails();
        System.out.println();

        employee1.updateDepartment("Product Management");
        employee2.updateDepartment("Product Management");
        employee3.updateDepartment("Product Management");


    }
}
