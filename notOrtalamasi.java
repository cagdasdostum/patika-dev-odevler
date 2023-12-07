package odevlerP;
import java.util.Scanner; 
public class notOrtalamasi {
    public static void main(String[] args) {
        int mat, tr, fiz, kim, muz, tar, ort;
        Scanner scan = new Scanner(System.in);
        System.out.print("Matematikten kaç Aldın?");
        mat = scan.nextInt();
        System.out.print("Türkçeden  kaç Aldın?");
        tr = scan.nextInt(); 
        System.out.print("Fizikten  kaç Aldın?");
        fiz = scan.nextInt();
        System.out.print("Kimyadan kaç Aldın?");
        kim = scan.nextInt();
        System.out.print("Müzikten kaç Aldın?");
        muz = scan.nextInt();
        System.out.print("Tarihten kaç Aldın?");
        tar = scan.nextInt();
        ort = (mat+tr+kim+fiz+muz+tar)/6;
        System.out.println("Ortalamanız " + ort + (ort<60 ? "Kaldı" : "Geçti"));



    }
    
}
