import java.util.*;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("The number is either dividible by 5 or 3");
        }
        else{
            System.out.println("Number is not dividible by 5 or 3");
        }
    }
}
