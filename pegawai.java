public class pegawai{
    String nama;
    String jabatan;
    double gajiPokok;
    double tunjangan;
    double potongan;
    double bonus;

    public pegawai(){}

    void setNama(String nama){
        this.nama = nama;
    }

    void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    double setGajiPokok(double gajiPokok){
        return this.gajiPokok = gajiPokok;
    }

    double setTunjangan(double tunjangan){
        return this.tunjangan = tunjangan;
    }

    double setPotongan (double potongan){
        return this.potongan = potongan;
    }

    double setBonus(double bonus){
        return this.bonus = bonus;
    }

    public pegawai(String nama, String jabatan, double gajipokok, double tunjangan, double potongan, double bonus){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajipokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    double hitungGajiTotal(){
        return this.gajiPokok + this.tunjangan + this.bonus - this.potongan;
    }

    double bonusTambahan(double bonustambahan){
        this.bonus += bonustambahan;
        return this.bonus;
    }

    void separator(){
        System.out.println("==============");
    }

    void infoPegawai(){
        System.out.println("Nama: "+this.nama);
        System.out.println("Jabatan: "+this.jabatan);
        System.out.printf("Gaji Pokok = %.2f",this.gajiPokok);
        System.out.printf("\nTunjangan = %.2f",this.tunjangan);
        System.out.printf("\nPotongan = %.2f",this.potongan);
        System.out.printf("\nBonus = %.2f",this.bonus);
        System.out.printf("\nTotal Gaji = %.2f\n",hitungGajiTotal());
    }

}