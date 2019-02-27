import java.util.*;

public class Scanprint {

    public static void main(String[] args) {
        // Scanner is an object 
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // Close the object to stop reading from stdin
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}