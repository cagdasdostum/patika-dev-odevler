package odevlerP;
import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        double toplam;
        toplam=0.0;

        System.out.println("bir sayı giriniz: ");
        n=s.nextInt();
        for(int i =1; i<=n;i++){
            toplam+=(1.0/i);
        }
        System.out.println(toplam);
    }
    
}
