package odevlerP;
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mesafe;
        double km, ucret;
        km = 2.20;
        System.out.println("kaç km yol gitti? ");
        mesafe = scan.nextInt();
        ucret = km*mesafe+10;
        if(ucret<20){
            System.out.println("indi bindi -- 20 tl tuttu.");
        }
        else{
            System.out.println("toplam "+ucret+" tl tuttu.");
        }

    }
    
}
