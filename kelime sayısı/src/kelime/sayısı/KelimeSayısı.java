
package kelime.sayısı;

import java.util.Scanner;
public class KelimeSayısı {

    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        int sayac = 1;
         
        System.out.print("Cumle giriniz: ");
        String cumle = klavye.nextLine();
 
        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Girilen cumlede " + sayac + " tane kelime vardır.");
    }
    }
    

