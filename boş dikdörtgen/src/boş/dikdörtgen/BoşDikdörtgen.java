
package boş.dikdörtgen;
import java.util.Scanner;

public class BoşDikdörtgen {

   
    public static void main(String[] args) {
        Scanner klavye=new Scanner (System.in);
        System.out.println("dikdörtgenin genişliğini giriniz");
        int genislik=klavye.nextInt();
         
        System.out.println("lütfen dikdörtgenin yüksekliğini giriniz");
        int yükseklik=klavye.nextInt();
        //dikdörtgenin üst kısmı
        for(int j=1;j<=genislik;j++)
        {
            System.out.print("o");
            
        }
        System.out.println("");//Satır sonu bir satır aşağı geç
        
        for(int i=1;i<=yükseklik-2;i++)
        {
        System.out.print("o");
        for(int j=1;j<=genislik-2;j++)
        {
            System.out.print(" ");//Satır sonu-2 tane yan yana boşluk koy
        }
        System.out.println("o");
        }
        //dikdörtgen tabanı
        for(int j=1;j<=genislik;j++)
        {
            System.out.print("o");
        }
       
    }
    
}
