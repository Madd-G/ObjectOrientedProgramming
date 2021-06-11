package alamsyah.praktikumPBO.pertemuan6.guided.komposisi;

public class Mesin {
    private String radiator;
    private String oli;
    private int piston;

    public Mesin(String radiator, String oli, int piston) {
        this.radiator = radiator;
        this.oli = oli;
        this.piston = piston;
    }

    public String getRadiator() {
        return radiator;
    }

    public void setRadiator(String radiator) {
        this.radiator = radiator;
    }

    public String getOli() {
        return oli;
    }

    public void setOli(String oli) {
        this.oli = oli;
    }

    public int getPiston() {
        return piston;
    }

    public void setPiston(int piston) {
        this.piston = piston;
    }
}
