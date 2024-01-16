import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
        int a,b,gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        a = sc.nextInt();
        System.out.println("Enter the second no:");
        b = sc.nextInt();
        for(int i=1 ; i<=a && i<=b ; i++)
        {
            if(a%i==0 && b%i==0)
            gcd = i;
        }
        System.out.printf("GCD of %d and %d is %d",a,b,gcd);
    }
    
}
