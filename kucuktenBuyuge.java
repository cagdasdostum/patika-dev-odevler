package odevlerP;
import java.util.Scanner;
public class kucuktenBuyuge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("üç sayı girin: ");
        s1=scan.nextInt();
        s2=scan.nextInt();
        s3=scan.nextInt();



        if(s1<s2 && s1<s3){

            if(s2<s3)
            System.out.println(s1+"<"+s2+"<"+s3);
            else if(s3<s2)    
            System.out.println(s1+"<"+s3+"<"+s2);
            
        }
        else if(s3<s1 && s3<s2){
            
            if(s1<s2)
                System.out.println(s3+"<"+s1+"<"+s2);
            else if(s2<s1)
                System.out.println(s3+"<"+s2+"<"+s1);    
        }
        else if(s2<s1 && s2<s3){
            
            if(s3<s1)
                System.out.println(s2+"<"+s3+"<"+s1);
            else if(s1<s3)
                System.out.println(s2+"<"+s1+"<"+s3);
            
        }
        
    }
    
}
