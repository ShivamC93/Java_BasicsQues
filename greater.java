import java.util.*;
public class greater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a==b){
            System.out.print("equal");
        }else
        if (a>b){
            System.out.print("a is greater");
        }else{
            System.out.println("b is greater");
        }
    }
}
