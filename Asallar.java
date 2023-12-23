import java.sql.SQLOutput;
import java.util.Scanner;
public class Asallar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi;
        System.out.println("Sayı girin: ");
        sayi = scan.nextInt();
        if(sayi%2==0 || sayi%3==0 || sayi%4==0 || sayi%5==0 || sayi%6==0 || sayi%7==0 || sayi%8==0 || sayi%9==0 || sayi%10==0 || sayi%11==0){
            if(sayi==2 || sayi==3 || sayi==5 || sayi==7 || sayi==11)
                System.out.println("Sayı asal");
            else
                System.out.println("Sayı asal değil");

        }
        else
            System.out.println("Sayı asal");
    }
}
