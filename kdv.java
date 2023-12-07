package odevlerP;
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total, kdv;
        kdv = 0.18;
        System.out.print("Kaç para? ");
        total = scan.nextDouble();
        if(total<=1000){
            System.out.println("KDV dahil : " + total*kdv+total);
        }
        else if(total>1000){
            kdv= 0.08;
            System.out.println("KDV dahil: " + total*kdv+total);
        }
        else;


    }
    
}
