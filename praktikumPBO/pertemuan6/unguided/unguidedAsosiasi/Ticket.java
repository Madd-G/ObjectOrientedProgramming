package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedAsosiasi;

public class Ticket {
    // attribute
    private final String movieCode;
    private final String movieName;

    // constructor
    public Ticket(String movieCode, String movieName) {
        this.movieCode = movieCode;
        this.movieName = movieName;
    }

    // getter
    public String getMovieCode() {
        return movieCode;
    }

    public String getMovieName() {
        return movieName;
    }
}
