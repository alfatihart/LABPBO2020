public class Main3 {
    public static void main(String[]args){
        SistemInformasiAkademik sii = new SistemInformasiAkademik();
        Mahasiswa mahasiswa = new Mahasiswa("Sangereng Dewa Raja", "H13116306");
        MataKuliah matkul = new MataKuliah("Pemrograman Berorientasi Objek",3);
        Dosen3 Dosen3 = new Dosen3("Supri Amir, ST. MS.i");
        Nilai nilai = new Nilai(85, 80);
        nilai.hitung();

        sii.isiData();
        sii = mahasiswa;
        sii.isiData();
        sii = matkul;
        sii.isiData();
        sii = Dosen3;
        sii.isiData();
        sii = nilai;
        sii.isiData();
    }
} 
