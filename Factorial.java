import java.util.Scanner;
public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of the given number is :"+fact);
    }
}