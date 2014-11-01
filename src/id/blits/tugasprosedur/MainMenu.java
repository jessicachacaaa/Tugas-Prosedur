
package id.blits.tugasprosedur;


public class MainMenu {


    public static void main(String[] args) {
        PersegiPanjang hitung = new PersegiPanjang();
        hitung.lebar = 19;
        hitung.panjang = 27;
        hitung.hitungPersegiPanjang();
        
        Persegi hitungg = new Persegi();
        hitungg.sisi = 19;
        hitungg.hitunggPersegi();
        
        Segitiga hitunggg = new Segitiga();
        hitunggg.alas = 19;
        hitunggg.tinggi = 27;
        hitunggg.hitungggSegitiga();
        
        Trapesium hitungggg = new Trapesium();
        hitungggg.sisi1 = 19;
        hitungggg.sisi2 = 27;
        hitungggg.tinggi = 10;
        hitungggg.hitunggggTrapesium();
        
        Lingkaran hitunggggg = new Lingkaran();
        hitunggggg.r = 20;
        hitunggggg.hitungggggLingkaran();
        
        
    }
}
