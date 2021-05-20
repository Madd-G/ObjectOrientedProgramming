package alamsyah.praktikumPBO.pertemuan2.unguided.no1;

public class Function {
    int yearOfBirth;
    int now = 2021;
    int age;

    public Function() {
    }

    int calculate(int yearOfBirth) {
        if (yearOfBirth > now)
            return 0;
        else
            age = now - yearOfBirth;
        return age;
    }
}
