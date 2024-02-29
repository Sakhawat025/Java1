import java.util.ArrayList;

public class UapCseName {
    int employeeid;
    String name;
    double salary;
    String department;

    UapCseName (int employeeid,String name,double salary,String department){
        this.employeeid=employeeid;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

     Overriding
    public String toString() {
        return "Employee ID: " + employeeid + ", Name: " + name + ", Salary: " + salary + ", Department: " + department;
    }
     public static void main(String[] args) {

        UapCseName e1=new UapCseName(22201077, "Sakhawat", 1000.00, "IT");
        UapCseName e2=new UapCseName(22201066, "Jane Smith", 60000, "Marketing");
        // creating the ArrayList
        ArrayList<UapCseName> list=new ArrayList<UapCseName> ();
        list.add(e1);
        list.add(e2);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
     }
}
