package Tugas1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * The Book class represents a program that manages book purchases and generates reports.
 */
/**
 * Kelas Book merupakan kelas utama yang berfungsi untuk menjalankan program pembelian buku.
 * Program ini mencetak data buku yang ingin dibeli, mengambil data pembeli, menghitung total bayar,
 * menghitung sisa stok buku, serta mencetak laporan pembelian buku dan laporan stok akhir.
 */
public class Book {
    /**
     * Method utama yang akan dijalankan saat program dijalankan.
     * Mencetak data buku yang ingin dibeli, mengambil data pembeli, menghitung total bayar,
     * menghitung sisa stok buku, serta mencetak laporan pembelian buku dan laporan stok akhir.
     * @param args argumen baris perintah yang diberikan saat menjalankan program
     */
    public static void main(String[] args) {
        Buku buku = new Buku();
        System.out.println("            DATA BUKU YANG INGIN DIBELI");
        buku.getBuku();

        System.out.println("\n           DATA PEMBELI BUKU");
        Buku pembeli = new Buku();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Nama Pembeli: ");
            String nama = input.readLine();
            pembeli.setPembeli(nama);
            System.out.print("Alamat Pembeli: ");
            String alamat = input.readLine();
            pembeli.setAlamat(alamat);
            System.out.print("Banyak Pembelian: ");
            int banyak = Integer.parseInt(input.readLine());
            pembeli.setPembelian(banyak);
            pembeli.hitungBayar();
            pembeli.hitungSisa();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("\n          LAPORAN PEMBELIAN BUKU");
        pembeli.getDataPembeli();
    }
}
