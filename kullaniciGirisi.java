package odevlerP;
import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password, newPassword;
        int sorgu;
        System.out.println("username: ");
        username = scan.nextLine();
        System.out.println("password: ");
        password = scan.nextLine();

        if(username.equals("cagdas")&& password.equals("cagdas")){
            System.out.println("Tebrikler başarıyla giriş yaptınız!");
        }
        else if(username.equals("cagdas") && password != "cagdas"){
            System.out.println("parolanı yanlış girdin. \n yeni parola belirlemek ister misin? (E/H)");
            sorgu = scan.nextInt();
            if(sorgu==1){
                System.out.println("yeni parolayı gir : ");
                newPassword = scan.nextLine();
                if(newPassword.equals(password))
                    System.out.println("bu senin şuanki parolan zaten!!!");
            else{
                System.out.println("yeni parolan başarıyla oluşturuldu.");
                }    

            }
            else{
                System.out.println("program sona erdi");
            }

        }
    }
    
}
