package odevlerP;
import java.util.Scanner;
public class ucak {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km, yas, yolculuk;
        double mbu = 0.10;
        double cocuk,genc,yasli;
        System.out.println("Yolculuk tek yön mü gidiş dönüş mü? (tek yön için 1, gidiş dönüş için 2)");
        yolculuk = scan.nextInt();
        System.out.println("kaç km gidildi");
        km = scan.nextInt();
        System.out.println("yaş kaç?");
        yas = scan.nextInt();

        cocuk=(km*mbu)-(km*mbu)*(50/100);
        genc=(km*mbu)-(km*mbu)*10/100;
        yasli=(km*mbu)-(km*mbu)*30/100;
        if(km>0 && yas>0 && yolculuk==1 || yolculuk==2){
            if(yolculuk==1){
                if(yas<12){
                    System.out.println(cocuk);
                }
                else if(yas>=12 && yas<=25){
                    System.out.println(genc);
                }
                else if(yas>=65){
                    System.out.println(yasli);
                }
            }
            if(yolculuk==2){
                if(yas<12){
                    System.out.println((cocuk*2)-(cocuk*2)*(0.20);
                }
                else if(yas>=12 && yas<=25){
                    System.out.println((genc*2)-(genc*2)*0.20);
                }
                else if(yas>=65){
                    System.out.println((yasli*2)-(yasli*2)*0.20);
                }
            }
        }
        else{
            System.out.println("Hatalı veri girdiniz!");
        }







    }
}
