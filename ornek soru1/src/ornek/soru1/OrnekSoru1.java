
package ornek.soru1;
import java.util.Scanner;

public class OrnekSoru1 {

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner (System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayı=klavye.nextInt();
        int ciftrakamlartoplamı=0;
        int tekrakamlartoplamı=0;
        int tekrakamlarsayısı=0;
        int ciftrakamlarsayısı=0;
        while(sayı!=0){
        int basamakdegeri=sayı%10;
        sayı=sayı/10;
        if (basamakdegeri%2==0){
            ciftrakamlartoplamı=ciftrakamlartoplamı+basamakdegeri;
            ciftrakamlarsayısı++;
        }
        else{
            tekrakamlartoplamı=tekrakamlartoplamı+basamakdegeri;
            tekrakamlarsayısı++;
            
        
            
        }
        
    }
        System.out.println("girilen sayının basamak sayısı:"+(tekrakamlarsayısı+ciftrakamlarsayısı));
        System.out.println("tek rakamlar toplamı"+(tekrakamlartoplamı));
        System.out.println("cift rakamlar toplamı:"+(ciftrakamlartoplamı));
        System.out.println("tek ve çift rakamlar arasındaki mutlak fark"+Math.abs(tekrakamlartoplamı-ciftrakamlartoplamı));
        
        
        
        
        
        
        
    
}
}