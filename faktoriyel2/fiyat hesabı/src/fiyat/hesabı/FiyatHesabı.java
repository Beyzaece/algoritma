
package fiyat.hesabı;
import java.util.Scanner;
public class FiyatHesabı {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
       
        
        
        
        double alis_fiyati;
        System.out.println("lütfen alış fiyatını giriniz:");
        alis_fiyati=klavye.nextDouble();
          double vergi_orani;
        System.out.println("lütfen vergi oranını giriniz");
        vergi_orani=klavye.nextDouble();
        double kar_orani;
        
         System.out.println("lütfen kar oranını giriniz");
                
         kar_orani=klavye.nextDouble();
         double satıs_fiyati;
          satıs_fiyati=alis_fiyati*vergi_orani +alis_fiyati*kar_orani;
          System.out.println("Satış fiyatı:" +satıs_fiyati);
         4500 
         
         
        
        
        
        
    }
    
}
