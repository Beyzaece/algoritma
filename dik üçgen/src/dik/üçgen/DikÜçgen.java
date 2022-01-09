
package dik.üçgen;
import java.util.Scanner;


public class DikÜçgen {
  
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen yükseklik değerini giriniz");
        int yükseklik=klavye.nextInt();
        for(int i=yükseklik;i>=1;i--){
         for(int j=1;j<=i;j++){
             System.out.print("*");
             
         }
         System.out.println("");
    }
    }
}
