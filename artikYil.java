package odevlerP;
import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Herhangi bir yıl girin: ");
        int yil = scan.nextInt();

        if(!(yil%400==0)){

            if(!(yil%100==0)){
                if(yil%4==0){
                    System.out.println("artık yıldır.");
                }
            }else{
                System.out.println("artık yıl değil");
            }
        }else if(yil%4==0){
            System.out.println("artık yıldır");
        }
        else{
            System.out.println("artık yıl değildir.");
        }
    }
    
}
