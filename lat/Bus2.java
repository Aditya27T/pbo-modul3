package lat;

class Bus2 {
    private int pemumpang=0;
    private int maxPenumpang=40;

    public void addPenumpang(int pemumpang){
        int temp;
        temp = this.pemumpang+pemumpang;
        if(temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.pemumpang = temp;
        }
    }

    public void getPenumpang(int password){
        if(password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }

    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+pemumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}