package odevlerP;
import java.util.Scanner;
public class uslu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taban,us,carpim;
        carpim=1;
        System.out.println("taban girin: ");
        taban=scan.nextInt();
        System.out.println("üs girin: ");
        us=scan.nextInt();

        for(int i = 1;i<=us;i++){
            carpim*=taban;
            
        }
        System.out.println(taban+"^"+us+"="+carpim);
    }
    
    
}
