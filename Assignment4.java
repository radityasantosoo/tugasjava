import java.util.Scanner;
 public class Input {
 public static void main(String[] args) {
     //membuat object scanner   
     Scanner input = new Scanner(System.in);
     System.out.print("Enter Panjang: ");
     //input nilai untuk variabel
     int iPanjang = input.nextInt();
     
     System.out.print("Enter Lebar: ");
      //input nilai untuk variabel
     int iLebar = input.nextInt();
     
     System.out.print("Enter Tinggi: ");
      //input nilai untuk variabel
     int iTinggi = input.nextInt();
     //cetak isi variabel yang sudah di input
     System.out.println("Panjang = " + iPanjang + ", Lebar = " + iLebar+ ",Tinggi = " + iTinggi);
     //mendeklarasikan dan menginisialisasi variabel dengan perhitungan
     int iVol = iPanjang * iLebar * iTinggi;
     //cetak nilai yang sudah di hitung di variabel
     System.out.println("volume = " + iVol );
     
     System.out.print("Enter Pi: ");
    //input nilai untuk variabel
     float iPi = input.nextFloat();
     
     System.out.print("Enter Jari - Jari: ");
         //input nilai untuk variabel
     float iJari = input.nextFloat();
     
     //mendeklarasikan dan menginisialisasi variabel dengan perhitungan
     float iBola = 4 * iPi * iJari *iJari*iJari / 3;
     //cetak nilai yang sudah di hitung di variabel
     System.out.println("Bola = " + iBola);
     
 }
}
