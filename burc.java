package odevlerP;
import java.nio.channels.FileChannel.MapMode;
import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day, month;
        System.out.println("Doğduğunuz gün ve ayı sayılarla ifade ediniz (sırayla): ");
        day = scan.nextInt();
        month = scan.nextInt();

        if(month==1){
            if(day<=21)
                System.out.println("Oğlak burcu");
            else if(day>=22)
                System.out.println("Kova burcu");

        }
        else if(month==2){
            if(day<=19)
                System.out.println("Kova burcu");
            else if(day>=19)
                System.out.println("Balık burcu");

            

        }
        else if(month==3){
            if(day<=20)
                System.out.println("Balık Burcu");
            else if(day>=20)
                System.out.println("Koç burcu");    
        }
        else if(month==4){
            if(day<=20)
                System.out.println("Koç Burcu");
            else if(day>=20)
                System.out.println("Boğa Burcu");    
        }
        else if(month==5){
            if(day<=21)
                System.out.println("Boğa Burcu");
            else if(day>=22)
                System.out.println("İkizler Burcu");
        }
        else if(month==6){
            if(day<=22)
                System.out.println("İkizler Burcu");
            else if(day>=23)
                System.out.println("Yengeç Burcu");
        }
        else if(month==7){
            if(day<=22)
                System.out.println("Yengeç Burcu");
            else if(day>=23)
                System.out.println("Aslan Burcu");
        }
        else if(month==8){
            if(day<=22)
                System.out.println("Aslan Burcu");
            else if(day>=23)
                System.out.println("Başak Burcu");
        }
        else if(month==9){
            if(day<=22)
                System.out.println("Başak Burcu");
            else if(day>=23)
                System.out.println("Terazi Burcu");

        }
        else if(month==10){
            if(day<=22)
                System.out.println("Terazi Burcu");
            else if(day>=23)
                System.out.println("Akrep Burcu");

        }
        else if(month==11){
            if(day<=21)
                System.out.println("Akrep Burcu");
            else if(day>=22)
                System.out.println("Yay Burcu");
        }
        else if(month==12){
            if(day<=21)
                System.out.println("Yay Burcu");
            else if(day>=22)
                System.out.println("Oğlak Burcu"); 
        }

    }
    
}
