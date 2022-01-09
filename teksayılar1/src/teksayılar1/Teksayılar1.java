
package teksayılar1;
import java.util.Scanner;
public class Teksayılar1 {

    
    public static void main(String[] args) {
      Scanner klavye = new Scanner(System.in);
        
        System.out.print("Bir Sayı Girin: ");
        int sayı=klavye.nextInt();
        
 
       
 
	int toplam = 0;
 
        for(int i = 1; i <=sayı; i++){
            if(i%2!=0){
              toplam += i;  
             
            }          

                
        
    } 
System.out.println("Tek Sayıların Toplamı = "+ toplam);
}
}
        

    

