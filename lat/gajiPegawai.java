package lat;

class gajiPegawai {
    private double gajiKotor, pajak, gajiBersih;
    private double potongan = 75000;
    private String nama = "Suliya";
    
    public void setGaji(double gaji){
        gajiKotor = gaji;
    }

    public void hitungPajak(){
        pajak = 0.1*gajiKotor;
    }

    public void hitungGajiBersih(){
        gajiBersih = gajiKotor-pajak-potongan;
    }

    public String namaPegawai(){
        return nama;
    }

    public double gajiKotor(){
        return gajiKotor;
    }

    public double gajiBersih(){
        return gajiBersih;
    }

    public double pajak (){
        return pajak;
    }

    public double potongan(){
        return potongan;
    }
}
