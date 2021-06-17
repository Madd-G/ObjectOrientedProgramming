package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedAsosiasi;

public class Visitor {
    // attribute
    private String name;
    private int age;
    private final String gender;

    private final String[] movieName = new String[20];
    private final String[] movieCode = new String[20];
    private int numberOfView = 0;

    // constructor
    public Visitor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to access Ticket
    public void setTicket(Ticket ticket) {
        if (numberOfView != this.movieCode.length) {
            this.movieName[numberOfView] = ticket.getMovieName();
            this.movieCode[numberOfView] = ticket.getMovieCode();
            numberOfView++;
        } else {
            System.out.println("Sorry, you can't watch anymore");
        }
    }

    // output
    public void showTicket() {
        System.out.println("\n   ******* TICKET *******");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Movie  : ");
        for (int i = 0; i < numberOfView; i++) {
            System.out.println("- " + movieCode[i] + "_" + movieName[i]);
        }
        System.out.println("-----------------------------------");
    }
}
