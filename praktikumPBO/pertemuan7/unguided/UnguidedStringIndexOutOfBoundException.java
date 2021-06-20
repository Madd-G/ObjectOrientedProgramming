package alamsyah.praktikumPBO.pertemuan7.unguided;

public class UnguidedStringIndexOutOfBoundException {
    public static void main(String args[])
    {
        try {
            String sentence = "My Name is Alamsyah"; // length is 19
            char let = sentence.charAt(19); // accessing 19th element
            System.out.println(let);
        }
        catch(StringIndexOutOfBoundsException e) {
            // will be executed if String index out of range
            System.out.println("Exception: " + e);
        }
    }
}
