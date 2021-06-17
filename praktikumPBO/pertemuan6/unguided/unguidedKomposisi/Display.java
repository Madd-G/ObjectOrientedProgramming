package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedKomposisi;

public class Display {
    // attribute
    private final String type;
    private final double size;
    private final String resolution;

    // constructor
    public Display(String type, double size, String resolution) {
        this.type = type;
        this.size = size;
        this.resolution = resolution;
    }

    // getter
    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

}
