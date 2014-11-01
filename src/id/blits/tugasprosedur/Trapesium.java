
package id.blits.tugasprosedur;


public class Trapesium {
    float setengah = (float) 0.5;
    int sisi1, sisi2, tinggi, luas;
    
    void hitunggggTrapesium(){
    luas = (int) (setengah * (sisi1+sisi2)*tinggi);
    System.out.println("Luas Trapesium : "+luas);
    }
}
