package odevlerP;
import java.util.Scanner;
public class daireDilimiAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, r, pi;
        pi = 3.14;
        System.out.println("Dairenin yarıçapını girin: ");
        r = scan.nextDouble();
        System.out.println("Merkez açının ölçüsünü girin : ");
        a = scan.nextDouble();

        System.out.println("Daire diliminin alanı : " + (pi*(r*r)*a)/360);


    }
    
}
