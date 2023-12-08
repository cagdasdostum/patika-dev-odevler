package odevlerP;
import java.util.Scanner;
public class tekSayiyaKadar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        
        do{
            System.out.print("bir sayı girin: ");
            sayi = scan.nextInt();
            if(sayi%4==0){
                System.out.println(sayi);
                toplam+=sayi;
                System.out.println(toplam);

            }
            else{
                System.out.println(sayi);
            }
        }while(!(sayi%2==1));
    }
    
}
