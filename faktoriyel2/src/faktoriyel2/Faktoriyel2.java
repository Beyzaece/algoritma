
package faktoriyel2;
import java.util.Scanner;

public class Faktoriyel2 {

    public static void main(String[] args) {
        System.out.println("faktöriyelinin hesaplanmasını istediğiniz sayıyı giriniz");
        Scanner klavye=new Scanner(System.in);
        int sayı=klavye.nextInt();
        int sonuc=1;
        for(int i=1;i<=sayı;i++){
            sonuc=sonuc*i;
        }
     System.out.println(sayı+"!="+sonuc);
     
        
    }
    
}
