package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedAsosiasi;

public class Main {
    public static void main(String[] args) {
        // instance of Ticket class
        Ticket ticket = new Ticket("A123", "Avatar: The Last Airbender");

        // instance of Visitor class
        Visitor visitor = new Visitor("Alamsyah", 21, "Male");

        // to set argument of setTickets with ticket object
        visitor.setTicket(ticket);

        // to connect Visitor class and showTicket method
        // and print the output
        visitor.showTicket();
    }
}
