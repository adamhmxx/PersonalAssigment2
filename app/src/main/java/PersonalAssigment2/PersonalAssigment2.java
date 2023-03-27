/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonalAssigment2;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class PersonalAssigment2 {
    public static void main(String[] args) {
        
        // Inisialisasi perulangan untuk mengulang program
        String loop = "Y";
        
        // Perulangan program apabila user ingin mengulang program deret ini
        while(loop.equals("Y")){            
        
        System.out.println(" ");
        System.out.println("===============================================================");
        System.out.println("= Belajar Deret Aritmatika, Geometri dan menghitung Faktorial =");
        System.out.println("===============================================================");
        
        // Input angka yang ingin dioperasikan dari angka 2 sampai angka 10
        Scanner objAngka = new Scanner(System.in);
        System.out.print("\nMasukkan banyak angka yang ingin anda cetak (2 - 10 Angka) :   ");
        int angka = objAngka.nextInt();
        
        // Jika angka tidak sesuai ketentuan maka user akan diminta input ulang
        while (angka < 2 || angka > 10) {            
            angka = 0;
            System.out.println("Angka yang anda masukkan tidak sesuai ketentuan, silahkan input ulang ");
            System.out.print("\nMasukkan banyak angka yang ingin anda cetak (2 - 10 Angka) :   ");
            angka = objAngka.nextInt();
        }
        
        // Input beda yang akan digunakan dalam operasi antara angka 2 sampai angka 9
        Scanner objBeda = new Scanner(System.in);
        System.out.print("\nMasukkan beda masing-masing angka (2 - 9 Angka) :   ");
        int beda = objBeda.nextInt();
        
        
        // Jika beda tidak sesuai ketentuan maka user akan diminta input ulang
        while (beda < 2 || beda > 9){
            beda = 0;
            System.out.println("Beda/selisih yang anda masukkan tidak sesuai ketentuan, silahkan input ulang ");
            System.out.print("\nMasukkan beda masing-masing angka (2 - 9 Angka) :   ");
            beda = objBeda.nextInt();
        }
        
        System.out.println("\n===============================================================");
        System.out.println("\nDeret Aritmatika :");
        
        // Perulangan untuk menampilkan deret aritmatika
        for (int i = 1; i <= angka; i++) {    
            for (int j = 1; j <= angka; j++) {
                System.out.print( i + " ");
                i+=beda;
            }
        }
        
        System.out.println(" ");
        
        // Perulangan untuk menampilkan deret geometri
        System.out.println("\nDeret Geometri :");
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(i  + " ");
                i*=beda;
            } 
        }
        
        System.out.println(" ");
        
        // Perulangan untuk menampilkan faktorial dari angka yang diinput
        System.out.println("\nFaktorial dari angka " + angka + " : ");
        int faktorial = 1;
        for (int i = angka; i <= angka && i >= 1; i--) {
            System.out.print( i + " * ");
            faktorial = faktorial * i;
        }
        System.out.println(" = " + faktorial);
        
        // Perulangan apakah user ingin mengulang program deet bilangan ini
        Scanner objSwitch = new Scanner(System.in);
        System.out.print("Apakah anda ingin mengulang program ini (y/t): " + " ");
        loop = objSwitch.nextLine().toUpperCase();
        }
        
        // Output apabila user tidak ingin megulang program ini
        System.out.println("\nTerima Kasih Telah Belajar Bersama Saya !");
        System.exit(0);
    }
}
