package odevlerP;
import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogumY, sonBasamak,mod;
        System.out.println("Doğum yılınızı girin: ");
        dogumY=scan.nextInt();
        mod = dogumY%12;
        sonBasamak=mod+1;

        switch(sonBasamak){
            case 1:
            System.out.println(dogumY%12+ "Maymun"); break;
            case 2:
            System.out.println(dogumY%12+ "Horoz"); break;
            case 3:
            System.out.println(dogumY%12+ "Köpek"); break;
            case 4:
            System.out.println(dogumY%12+ "Domuz"); break;
            case 5:
            System.out.println(dogumY%12+ "Fare"); break;
            case 6:
            System.out.println(dogumY%12+ "Öküz"); break;
            case 7:
            System.out.println(dogumY%12+ "Kaplan"); break;
            case 8:
            System.out.println(dogumY%12+ "Tavşan"); break;
            case 9:
            System.out.println(dogumY%12+ "Ejderha"); break;
            case 10:
            System.out.println(dogumY%12+ "Yılan"); break;
            case 11:
            System.out.println(dogumY%12+ "At"); break;
            case 12:
            System.out.println(dogumY%12+ "Koyun"); break;
        }






    }
    
}
