import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int num = 1;

        while(num <= n){
            System.out.println(num);
            num++;
        }

        
    }
    
}
