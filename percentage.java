import java.util.*; 

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int n = sc.nextInt();
        if(n>90){
            System.out.println("Excellent");
        }
        else if(n>75){
            System.out.println("very good");
        }
        else if(n>60){
            System.out.println("good");
        }        
        else if(n>35){
            System.out.println("can do better");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
