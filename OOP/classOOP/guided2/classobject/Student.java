package alamsyah.OOP.classOOP.guided2.classobject;

public class Student {
    // Attribute
    String name;
    int id;

    // constructor tanpa parameter
    public Student() {
        this.name = "Default";
        this.id = 0;
    }

    // constructor dengan parameter
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
