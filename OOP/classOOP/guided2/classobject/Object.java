package alamsyah.OOP.classOOP.guided2.classobject;

public class Object {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Andre", 19102099);

        // Output student1
        System.out.println("==> Student Data 1 <==");
        System.out.println("name: " + stu1.name);
        System.out.println("id : " + stu1.id);
        System.out.println();

        // Output student2
        System.out.println("==> Student Data 2 <==");
        System.out.println("name: " + stu2.name);
        System.out.println("id : " + stu2.id);
        System.out.println();
    }
}
