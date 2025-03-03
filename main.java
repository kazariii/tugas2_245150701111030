public class main {
    public static void main(String[] args) {
        pegawai pegawai1 = new pegawai(); //(DEFAULT CONSTRUCTOR)

        pegawai1.setNama("Clarissa");
        pegawai1.setJabatan("HR");
        pegawai1.setGajiPokok(10000000);
        pegawai1.setTunjangan(1000000);
        pegawai1.setPotongan(5000000);
        pegawai1.setBonus(2000000);

        pegawai1.infoPegawai(); //PEGAWAI 1 TANPA BONUS TAMBAHAN 

        pegawai1.separator();

        pegawai1.bonusTambahan(1000000); //BONUS TAMBAHAN
        pegawai1.infoPegawai(); //PEGAWAI 1 DENGAN BONUS TAMBAHAN

        pegawai pegawai2 = new pegawai("Azhari", "Manager", 30000000.00, 
        50000000.00, 1000000.00, 100000000.00); //OVERLOADING CONSTRUCTOR
        pegawai2.separator();
        
        pegawai2.infoPegawai(); 

        pegawai2.separator();
    }
}
