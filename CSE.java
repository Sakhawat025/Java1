public class CSE {
    public static void main(String agrs[]){
        Uap studen=new Uap();
        Uap id=new Uap();
        Uap cgpa=new Uap();
        Uap student1=new Uap();
        Uap student2=new Uap();

        studen.addCourse();
        id.dropCourse();

        studen.StudentName="Sakhawat Hossain";
        id.ID=22201077;
        cgpa.CGPA=3.50;
        student1.StudentName="Siam Ahmed";
        student2.StudentName="Rakib Hasan";

        System.out.println(studen.StudentName);
        System.out.println(id.ID);
        System.out.println(cgpa.CGPA);
        System.out.println(student1.StudentName);
        System.out.println(student2.StudentName);
    }
}
