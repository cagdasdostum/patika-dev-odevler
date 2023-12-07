package odevlerP;
import java.util.Scanner;
public class hipotenusAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        double c, u;
        System.out.println("İlk dik kenarın uzunluğunu giriniz: ");
        a = scan.nextInt();
        System.out.println("İkinci dik kenarın uzunluğunu giriniz: ");
        b = scan.nextInt();
        
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüsün uzunluğu: "+c);
        System.out.println("üçgenin alanı: " + a*b/2);


    }
    
}
