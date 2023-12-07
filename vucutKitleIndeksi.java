package odevlerP;
import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy, kilo;
        System.out.println("Boyunu (metre cinsinden) ve kilonu (kg) (sırayla) gir. ");
        boy = scan.nextDouble();
        kilo = scan.nextDouble();

        System.out.println("Vücut kitle indeksin: " + kilo/(boy*boy));
    }
    
}
