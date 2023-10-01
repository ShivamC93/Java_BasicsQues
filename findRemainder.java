import java.util.*;

public class findRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();

        int c = a/b;

        int r = a - (b*c);
        System.out.println("Remainder is: " + r);

    }
    
}
