package odevlerP;
import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi, deger, max,min,i;
        i=1;
        max=0;
        min=0;

        System.out.println("Kaç tane sayı girilecek: ");
        sayi = scan.nextInt();
        do{
            System.out.println(i+".sayıyı giriniz: ");
            deger = scan.nextInt();

            if(i==1){
                max=deger;
                min=deger;
            }
            else{
                if(deger<min){
                    min=deger;
                }
                else if(deger>max){
                    max=deger;

                }
                
            }
            i++;

            



        }while(i<=sayi);

        System.out.println(min);
        System.out.println(max);
    }
    
}
