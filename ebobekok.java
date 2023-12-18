package odevlerP;
import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s1,s2,i,ebob,ekok;
        i=1;
        ebob=1;
        
        System.out.println("İlk sayıyı girin: ");
        s1=scan.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        s2=scan.nextInt();
        
        
        while(i<=s1 && i<=s2){
            if(s1%i==0 && s2%i==0){
                System.out.println(i+" ortak bölendir.");
                ebob=i;
                
            }
            else{
                System.out.println(i+" ortak bölen değildir.");
            }
            i++;
            
            
        }
        ekok=s1*s2/ebob;
        System.out.println("iki sayının ebobu: "+ ebob);
        System.out.println("iki sayının ekoku: "+ ekok);



    }
    
}
