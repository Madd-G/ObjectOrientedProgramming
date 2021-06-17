package alamsyah.OOP.OOPClass.unguided2;

public class Age {
    int yearOfBirth;
    int now = 2021;
    int age;

    public Age() {
    }

    String calculate(int yearOfBirth) {
        if (yearOfBirth > now)
            return "Please enter the correct year of birth";
        else
            age = now - yearOfBirth;
        return "Your are " + age + " years old";
    }
}