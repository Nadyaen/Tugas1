/* nadya mahza khairani - fiby naya sari
227064516102 - 227064516076
*/

package tugas1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); //membuata scanner aru dgn nama input
        double nilai, total = 0, rata; //deklarasi var niai, total, rata dgn tipe data float
        
        String[] nama = new String[5]; //deklarasi array dgn user nama 
        Scanner scan = new Scanner(System.in); //membuat scanner baru dgn nama scan
        
        System.out.print("Berapa Inputan Nilai Mahasiswa : "); //menampilkan tulisan "Berapa Inputan Nilai Mahasiswa : " untuk inputan keyboard
        int n = input.nextInt(); //menyimpan inputan ke var n

        //mengisi data nilai mahasiswa
        for(int i=0; i<n; i++){ //melakukan perulangan 0 sampai kurang dri n
            System.out.print("masukan nama mahasiswa : "); //menampilkan tulisan "masukan nama  mahasiswa : " untuk inputan dari keyboard
            nama[i] = scan.next(); //menyimpan inputan ke var nama[i] dengan menggunakan scanner
            System.out.print("masukan nilai mahasiswa : "); //menampilkan tulisan "masukan nilai mahasiswa : " untuk inputan dari keyboard
            nilai = input.nextDouble(); //menyimpan inputan ke var nilai dengan menggunakan scanner
            total += nilai; //menambahkan total dan nilai, untuk hasil total dengan menggunakan operator += 
        }
        rata = total/n; //menghitung rata-rata dgn cara total di bagi n
        System.out.println("Total nilai mahasiswa : " + total ); //menampilkan isi dari var total 
        System.out.println("Rata-rata nilai mahasiswa : " + rata ); //menampilkan isi dari var rata
    }
    
}
