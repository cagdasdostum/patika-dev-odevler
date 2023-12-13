package odevlerP;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,limit;
        a=1;
        b=1;
        System.out.println("Kaç sayılık fibonacci serisi ? ");
        limit=scan.nextInt();
        System.out.println(a);
        System.out.println(b);

        for(int i =1; i<=limit;i++){        //a,b,a+b,a+b+b
            System.out.println(a+=b);
            System.out.println(b+=a);
        }
    }
    
}
