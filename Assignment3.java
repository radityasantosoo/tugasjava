/* Online Java Compiler and Editor */
public class Tugas{
   
     public static void main(String []args){
    //mendeklarasikan dan menginisialisasi variabel
     int iPanjang, iLebar, iLuaspersegi;
     iPanjang = 12;
     iLebar = 8;
     //perhitungan isi variabel
     iLuaspersegi = iPanjang * iLebar;
     //cetak isi variabel
        System.out.println("Panjang x Lebar = "+ iLuaspersegi);
     
    //mendeklarasikan dan menginisialisasi variabel
    float fAlas, fTinggi, fLuassegitiga;
    fAlas = 7.0f;
    fTinggi = 3.5f;
     //perhitungan isi variabel
    fLuassegitiga = 0.5f * fAlas * fTinggi;
    //cetak isi variabel
    System.out.println("Luas Segitiga = "+ fLuassegitiga);
    
    //mendeklarasikan dan menginisialisasi variabel boolean
    boolean hitung = iLuaspersegi > fLuassegitiga;
    System.out.println("Point 1 dan Point 2 = "+ hitung);
    //decrement 3x
    int decrement = --iLuaspersegi;
        decrement = --iLuaspersegi;
        decrement = --iLuaspersegi;
    
     System.out.println("Decrement 3x ="+ decrement);
    //increment 6x
    int increment = ++iLuaspersegi;
        increment = ++iLuaspersegi;
        increment = ++iLuaspersegi;
        increment = ++iLuaspersegi;
        increment = ++iLuaspersegi;
        increment = ++iLuaspersegi;
     System.out.println("Decrement 6x ="+ increment);
     }
}
