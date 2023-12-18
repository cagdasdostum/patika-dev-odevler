package odevlerP;
import java.util.Scanner;
public class atmSc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String username, password;
        int select, balance, price, right;
        balance=1500;
        right= 3;
        
        
        while(right>0){
            System.out.println("ATM'ye hoşgeldiniz! \n Kullanıcı Adınızı girin: ");
            username=scan.nextLine();
            System.out.println("Parolanızı girin: ");
            password=scan.nextLine();

            if(username.equals("asd")&&password.equals("asd")){
                System.out.println("Giriş başarılı! \n Şimdi yapmak istediğiniz işlemi seçiniz. \n 1.Para Yatırma \n 2.Para Çekme \n 3.Bakiye Sorgulama \n 4.Çıkış ");
                select=scan.nextInt();
                if(select>=1 && select<=4){
    
                    switch(select){
                        case 1:
                        System.out.println("Yatırmak istediğiniz para tutarı: ");
                        price=scan.nextInt();
                        balance+=price;
                        System.out.println("İşlem tamamlandı."); break;
                        case 2:
                        System.out.println("Çekmek istediğiniz para tutarı: ");
                        price=scan.nextInt();
                        if(price>balance)
                            System.out.println("Bakiyeniz yetersiz!");
                        else{
                            balance-=price;
                            System.out.println("Para çekme işlemi başarılı!");
                        }
                             break;
    
                        case 3:
                        System.out.println("Güncel Bakiyeniz: "+balance); break;
                        case 4:
                        System.out.println("Çıkış yapılıyor iyi günler dileriz!"); break;
                        
    
    
                        default:
                        
                    }

                    
                }
                else{
                    right--;
                    System.out.println("Eksik ya da yanlış tuşlama yaptınız. Tekrar deneyiniz! Kalan hakkınız: "+ right);
                }
            }
            else{
                right--;
                System.out.println("Bilgileriniz yanlış tekrar deneyiniz! Kalan hakkınız: "+ right);
                }
        }
    }
    
}
