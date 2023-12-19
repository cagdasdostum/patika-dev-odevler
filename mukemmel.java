package odevlerP;
import java.util.Scanner;
public class mukemmel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int bolenler=0;
        System.out.println("Bir sayı girin: ");
        sayi=scan.nextInt();

        for(int i =1;i<sayi;i++){
            if(sayi%i==0){
                System.out.println("bölenler: "+i);

                bolenler+=i;
            }

        }
        System.out.println("tam bölenlerinin toplamı: "+bolenler);
        if(bolenler%sayi==0){
            System.out.println(sayi+" mükemmel sayıdır.");

        }
        else
            System.out.println(sayi+" mükemmel sayı değildir.");
    }
    
}
