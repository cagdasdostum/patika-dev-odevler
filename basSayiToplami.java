package odevlerP;
import java.util.Scanner;;
public class basSayiToplami {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sayi,birler,onlar,yuzler,binler;
        System.out.println("bir sayı girin : ");
        sayi=s.nextInt();

        
        birler= sayi%10;
        sayi = sayi/10;
        onlar= sayi%10;
        sayi = sayi/10;
        yuzler= sayi%10;
        sayi=sayi/10;
        binler=sayi%10;
        System.out.println(birler+onlar+yuzler+binler);




        

    }
    
}
