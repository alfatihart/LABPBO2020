public class SistemInformasiAkademik {
    String nim;
    String nama;
    String matkul;
    int sks;
    String Dosen3;
    double uts;
    double uas;

    public SistemInformasiAkademik() {
    }

    public SistemInformasiAkademik(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    public SistemInformasiAkademik(String matkul, int sks){
        this.matkul = matkul;
        this.sks = sks;
    }
    public SistemInformasiAkademik(String Dosen3){
        this.Dosen3 = Dosen3;
    }
    public SistemInformasiAkademik(double uts, double uas){
        this.uts = uts;
        this.uas = uas;
    }
    public void isiData(){
        System.out.println("Sistem Akademik");
        System.out.println("----------------------------");
    }
} 
