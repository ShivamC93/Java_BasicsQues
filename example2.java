import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("The number is either dividible by 5 or 3 but not by 15");
                }
            else{
                System.out.println("not matching reqyired condition");
                }
        }
        else{
                System.out.println("not matching reqyired condition");
            }
        }
}   
