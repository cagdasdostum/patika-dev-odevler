package odevlerP;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,r,fac1,fac2,fac3;
        fac1=1;
        fac2=1;
        fac3=1;
        System.out.println("N giriniz: ");
        n=scan.nextInt();
        System.out.println("R giriniz: ");
        r=scan.nextInt();

        for(int i=1;i<=n;i++){
            fac1*=i;
        }
        for(int i =1;i<=r;i++){
            fac2*=i;

        }
        for(int i =1;i<=(n-r);i++){
            fac3*=i;
        }
        System.out.println("Kombinasyon C : "+fac1/(fac2*fac3));
        
    }
    
}
