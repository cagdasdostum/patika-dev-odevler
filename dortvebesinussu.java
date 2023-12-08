package odevlerP;
import java.util.Scanner;
public class dortvebesinussu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi;
        System.out.println("sayi girin: ");
        sayi = scan.nextInt();
        System.out.println("dördün kuvvetleri");
        for(int i = 1; i<=sayi; i*=4){
            System.out.println(i);
        }System.out.println("beşin kuvvetleri");
        for(int i = 1; i<=sayi; i*=5){
            System.out.println(i);
        }







    }
    
}
