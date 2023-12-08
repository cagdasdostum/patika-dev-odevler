package odevlerP;
import java.util.Scanner;
public class ucvedort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,tutulan,toplam,i;
        toplam=0;
        tutulan=0;
        i=0;
        System.out.println("bir sayı girin: ");
        sayi = scan.nextInt();

        while(i<sayi){
            i++;
            if(i%3==0 || i%4==0){
                toplam+=i;
                System.out.println(toplam);
                tutulan++;
            }
            else{
                System.out.println("3veya4e bölünmüyor");
            }
        }
        System.out.println(tutulan);
        System.out.println(toplam/tutulan);
    }
    
}
