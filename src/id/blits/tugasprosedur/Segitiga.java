
package id.blits.tugasprosedur;

public class Segitiga {
   
    int alas, tinggi, luas;
    float setengah = (float) 0.5;
    
    void hitungggSegitiga(){
    luas = (int) (setengah*alas*tinggi);
    System.out.println("Luas Segitiga : "+luas);
    }
    
}
