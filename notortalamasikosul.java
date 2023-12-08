package odevlerP;
import java.util.Scanner;
public class notortalamasikosul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fiz, tr, kim, muz, dersSayisi;
        dersSayisi=5;
        System.out.println("Matematik notu: ");
        mat = scan.nextInt();
        if(mat<0 || mat>100){
            mat=0;
            System.out.println("Not hesaplanamadı");
            dersSayisi--;
        }
        else{
            System.out.println("Matematik: "+mat);

        }
        System.out.println("Fizik notu: ");
        fiz = scan.nextInt();
        if(fiz<0 || fiz>100){
            fiz=0;
            System.out.println("Not hesaplanamadı");
            dersSayisi--;
        }
        else{
            System.out.println("Fizik notu: "+ fiz);
        }
        System.out.println("Türkçe notu: ");
        tr = scan.nextInt();
        if(tr<0 || tr>100){
            tr=0;
            System.out.println("Not Hesaplanamadı");
            dersSayisi--;
        }
        else{
            System.out.println("Türkçe notu: "+tr);
        }
        System.out.println("Kimya notu: ");
        kim = scan.nextInt();
        if(kim<0 || kim>100){
            kim=0;
            System.out.println("Not hesaplanamadı");
            dersSayisi--;
        }
        else{
            System.out.println("Kimya notu: "+kim);
        }
        System.out.println("Müzik notu: ");
        muz = scan.nextInt();
        if(muz<0 || muz>100){
            muz=0;
            System.out.println("Not hesaplanamadı");
            dersSayisi--;


        }
        else{
            System.out.println("Müzik notu: "+muz);
        }
        double ortalama = (mat+fiz+tr+kim+muz)/dersSayisi;
        System.out.println(ortalama);

        
    }
    
}
