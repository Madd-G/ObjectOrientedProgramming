package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedKomposisi;

public class Laptop {
    // attribute
    private String name;
    private Display display;
    private GraphicsCard graphics;
    private Processor processor;
    private RAM ram;
    private Memory memory;

    // constructor
    public Laptop(String name) {
        this.name = name;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisplay(String type, double size, String resolution) {
        display = new Display(type, size, resolution);
    }

    public void setProcessor(String processor1) {
        processor = new Processor(processor1);
    }

    public void setGraphics(String graphics1) {
        graphics = new GraphicsCard(graphics1);
    }
    
    public void setRam(int ram1) {
        ram = new RAM(ram1);
    }
    
    public void setMemory(int memory1) {
        memory = new Memory(memory1);
    }

    // output
    public void showLaptopSpec() {
        System.out.println("\nMacbook pro M1 specification");
        System.out.println("===================================");
        System.out.println("Name      : " + name);
        System.out.println("Display   : " + display.getSize() + " inch " + display.getType() + " " +display.getResolution());
        System.out.println("Processor : " + processor.getProcessor1());
        System.out.println("Graphics  : " + graphics.getGraphicsCard1());
        System.out.println("Memory    : " + memory.getMemory1());
        System.out.println("RAM       : " + ram.getRam1());
    }
}
