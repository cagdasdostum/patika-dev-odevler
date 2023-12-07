package odevlerP;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;
public class hesapSwitchile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1, s2, select;
        System.out.println("İlk sayıyı girin: ");
        s1 = scan.nextInt();
        System.out.println("ikinci sayıyı girin: ");
        s2 = scan.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçin \n 1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
        select = scan.nextInt();
        switch(select){
            case 1:
            System.out.println(s1 +"+"+ s2 +"="+s1+s2); break;
            case 2:
            System.out.println(s1 +"-"+ s2 +"="+(s1-s2)); break;
            case 3: 
            System.out.println(s1 +"x"+ s2 +"="+(s1*s2)); break;
            case 4:
            System.out.println(s1 +"%"+ s2 +"="+(s1/s2)); 
            break;
            default:
            System.out.println("1-4 arasında bir giriş yapmadığınız için program sona erdi.");
        }
    }
    
}
