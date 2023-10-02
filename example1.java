import java.util.*;
public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price");
        int x = sc.nextInt();
        System.out.println("Enter selling price");
        int y = sc.nextInt();
        if(x>y){
            System.out.println("loss");
        }
        else{
            System.out.print("profit is: ");
            System.out.print(y-x);
        }
    }
}
