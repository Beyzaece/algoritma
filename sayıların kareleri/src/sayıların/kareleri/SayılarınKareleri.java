
package sayıların.kareleri;
import java.util.Scanner;

public class SayılarınKareleri {

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int toplam=0;
        int rakam;
        System.out.print("bir sayı giriniz");
        int sayı=klavye.nextInt();
        while (sayı>0){
            rakam=sayı%10;
            System.out.println(rakam + "' ın karesi = " + (rakam * rakam));
            toplam += (rakam * rakam);
            sayı /= 10;
             System.out.println("Girilen sayinin karelerinin toplamı = " + toplam);
        }
        
        
        
    }
    
}
