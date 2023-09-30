import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Year is leap.");
        }         
        else{
            System.out.println("year is not leap");
        }
    }
    
}
