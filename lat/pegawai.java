package lat;

public class pegawai {
    public static void main(String[] args) {
        gajiPegawai pegawai = new gajiPegawai();
        // Mutator method
        pegawai.setGaji(5000000);
        pegawai.hitungPajak();
        pegawai.hitungGajiBersih();
        // Accessor method
        System.out.println("Nama Pegawai: "+pegawai.namaPegawai());
        System.out.println("Gaji Kotor: "+pegawai.gajiKotor());
        System.out.println("Pajak: "+pegawai.pajak());
        System.out.println("Potongan: "+pegawai.potongan());
        System.out.println("Gaji Bersih: "+pegawai.gajiBersih());
    }
}
