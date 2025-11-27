import java.util.Date;
import java.util.zip.DataFormatException;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(new Date());
        System.out.println("Welcome to the Java programming language.");
        System.out.println(new DataFormatException());
        Date Date = new Date();
        System.out.println(Date.getTime());

        System.out.println("----------------");

        System.out.println("Hello, How are you? "+" I'm fine.");
    }
}