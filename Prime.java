import java.util.*;
public class Prime {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        boolean flag = true;        
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime Number");
        }
        else if(num==1){
            System.out.println("Neither Prime nor Composite");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
}
