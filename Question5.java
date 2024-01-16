import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int n1, n2, n3, i, count=10; 
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter n1 no:");
        n1 = sc.nextInt();
        System.out.println("Enter n2 no:");
        n2 = sc.nextInt();
        System.out.println(n1+" "+n2);
        for(i=0; i<count; i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    
}
