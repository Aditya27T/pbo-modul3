package Tugas1;

/**
 * Kelas Buku merepresentasikan sebuah buku dengan atribut-atribut seperti judul, pengarang, stok, dan harga.
 * Kelas ini juga memiliki method untuk mengatur data pembeli, menghitung total bayar, menghitung sisa stok buku,
 * serta method untuk mendapatkan data pembeli, sisa stok buku, dan informasi buku.
 */
public class Buku
{
    private String judulBuku="Konsep Dasar Pemrograman Java";
    private String pengarangBuku="Patrick Naughton";
    private int stokBuku = 27;
    private int hargaBuku = 75000;
    private String namaPembeli;
    private String alamatPembeli;
    private int banyakPembelian;
    private int bayarBuku;
    private int sisaBuku;
    
    /**
     * Mengatur nama pembeli.
     * @param nama Nama pembeli.
     */
    public void setPembeli(String nama) {
        namaPembeli = nama;
    }
    
    /**
     * Mengatur alamat pembeli.
     * @param alamat Alamat pembeli.
     */
    public void setAlamat(String alamat) {
        alamatPembeli = alamat;
    }
    
    /**
     * Mengatur jumlah pembelian.
     * @param pembelian Jumlah pembelian.
     */
    public void setPembelian(int pembelian) {
        banyakPembelian = pembelian;
    }
    
    /**
     * Menghitung total bayar berdasarkan harga buku dan jumlah pembelian.
     */
    public void hitungBayar() {
        bayarBuku = hargaBuku * banyakPembelian;
    }
    
    /**
     * Menghitung sisa stok buku setelah pembelian.
     */
    public void hitungSisa() {
        sisaBuku = stokBuku - banyakPembelian;
    }

    /**
     * Menampilkan data pembeli seperti nama, alamat, dan jumlah pembelian.
     */
    public void getDataPembeli() {
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("Alamat Pembeli  : " + alamatPembeli);
        System.out.println("Banyak Pembelian: " + banyakPembelian);
        System.out.println("Total Bayar     : " + bayarBuku);
    }

    /**
     * Menampilkan sisa stok buku setelah pembelian.
     */
    public void getSisa() {
        System.out.println("Sisa Stok Buku  : " + sisaBuku);
    }

    /**
     * Menampilkan informasi buku seperti judul, pengarang, stok, dan harga.
     */
    public void getBuku() {
        System.out.println("Judul Buku      : " + judulBuku);
        System.out.println("Pengarang Buku  : " + pengarangBuku);
        System.out.println("Stok Buku       : " + stokBuku);
        System.out.println("Harga Buku      : " + hargaBuku);
    }
}
