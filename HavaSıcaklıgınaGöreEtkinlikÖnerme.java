package havasıcaklıgınagöreetkinlikönerme;
import java.util.*;
public class HavaSıcaklıgınaGöreEtkinlikÖnerme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz:");
        int sıcaklık = input.nextInt();
        
        if(sıcaklık<5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(sıcaklık>5 && sıcaklık<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sıcaklık>15 && sıcaklık<25) {
            System.out.println("Piknik yapabilirsiniz.");
        }
        else if(sıcaklık>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
            
            
     
    }
    
}