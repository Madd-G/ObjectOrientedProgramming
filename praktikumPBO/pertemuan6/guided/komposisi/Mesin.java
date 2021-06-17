package alamsyah.praktikumPBO.pertemuan6.guided.komposisi;

public class Mesin {
    private final String radiator;
    private final String oli;
    private final int piston;

    public Mesin(String radiator, String oli, int piston) {
        this.radiator = radiator;
        this.oli = oli;
        this.piston = piston;
    }

    public String getRadiator() {
        return radiator;
    }

    public String getOli() {
        return oli;
    }

    public int getPiston() {
        return piston;
    }
}
