package odevlerP;
import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, e, d, m, p;
        double armut, elma, domates, muz, patlican;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;
        System.out.println("--Kaç Kilo? Armut \n --Kaç Kilo? Elma \n --Kaç Kilo? Domates \n --Kaç Kilo? Muz \n --Kaç Kilo? Patlıcan");
        a = scan.nextDouble();
        e = scan.nextDouble();
        d = scan.nextDouble();
        m = scan.nextDouble();
        p = scan.nextDouble();

        System.out.println("Toplam Tutar : " + (armut*a)+(elma*e)+ (domates*d)+ (muz*m)+ (patlican*p));



    }
    
}
