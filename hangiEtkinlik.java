package odevlerP;
import java.util.Scanner;
public class hangiEtkinlik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.println("Hava bugün kaç derece? ");
        sicaklik = scan.nextInt();

        if(sicaklik<5){
            System.out.println("kayağa git");
        }
        else if(sicaklik>=5 && sicaklik <=15){
            System.out.println("sinemaya git");
        }
        else if(sicaklik>15 && sicaklik<=25){
            System.out.println("pikniğe git");
        }
        else{
            System.out.println("yüzmeye git");
        }
    }
    
}
