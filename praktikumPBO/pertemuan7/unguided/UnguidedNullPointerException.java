package alamsyah.praktikumPBO.pertemuan7.unguided;

public class UnguidedNullPointerException {
    public static void main(String[] args) {
        UnguidedNullPointerException empty = null;
        try {
            // change the value of the empty variable to String
            System.out.println(empty.toString());
        }
        catch (NullPointerException e) {
            // will be executed if the "empty" variable is null
            System.out.println("Exception: " + e);
        }
    }
}
