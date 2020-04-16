import java.util.*;
import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        Scanner nd = new Scanner(System.in);
        System.out.println("==== 1. Bangun Ruang ====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Prisma");
        System.out.println("4. Bola");
        System.out.println("5. Tabung");
        System.out.println("6. Limas");
        System.out.println("7. Kerucut");
        
        System.out.println();
        System.out.println("==== 2. Bangun Datar ====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Trapesium");
        System.out.println("6. Jajargenjang");
        System.out.println("7. Layang-layang");
        System.out.println("8. Belah Ketupat");
    
        System.out.println();
        System.out.println("choose :");
        int choose = nd.nextInt();
        if(choose == 1){
            System.out.println("pilih bangun ruang");
            int choose2 = nd.nextInt();
            if(choose2 == 1){
                System.out.println();
                Kubus kubus = new Kubus();
                System.out.println("masukkan s");
                kubus.s = nd.nextDouble();
                System.out.println("volume = " + kubus.Volume());
                System.out.println("luas permukaan = " + kubus.LuasPermukaan());
                
            }else if(choose2 == 2){
                Balok balok = new Balok();
                System.out.println("masukkan p");
                balok.p = nd.nextDouble();
                System.out.println("masukkan l");
                balok.l = nd.nextDouble();
                System.out.println("masukkan t");
                balok.t = nd.nextDouble();
                System.out.println("volume = " + balok.Volume());
                System.out.println("luas permukaan = " + balok.LuasPermukaan());
            }else if(choose2 == 3){
                Prisma prisma = new Prisma();
                prisma.La = nd.nextDouble();
                prisma.K = nd.nextDouble();
                prisma.t = nd.nextDouble();
                System.out.println("volume = " + prisma.Volume());
                System.out.println("luas permukaan = " + prisma.LuasPermukaan());
            }else if(choose2 == 4){
                Bola bola = new Bola();
                bola.r = nd.nextDouble();
                System.out.println("volume = " + bola.Volume());
                System.out.println("luas permukaan = " + bola.LuasPermukaan());
            }else if(choose2 == 5){
                Tabung tabung = new Tabung();
                tabung.r = nd.nextDouble();
                tabung.t = nd.nextDouble();
                System.out.println("volume = " + tabung.Volume());
                System.out.println("luas permukaan = " + tabung.LuasPermukaan());
            }else if(choose2 == 6){
                Limas limas = new Limas();
                limas.Lalas = nd.nextDouble();
                limas.Ja = nd.nextDouble();
                limas.t = nd.nextDouble();
                System.out.println("volume = " + limas.Volume());
                System.out.println("luas permukaan = " + limas.LuasPermukaan());
            }else if(choose2 == 7){
                Kerucut kerucut = new Kerucut();
                kerucut.r = nd.nextDouble();
                kerucut.s = nd.nextDouble();
                kerucut.t = nd.nextDouble();
                System.out.println("volume = " + kerucut.Volume());
                System.out.println("luas permukaan = " + kerucut.LuasPermukaan());
            }
        }else{
            System.out.println("pilih bangun datar");
            int choose3 = nd.nextInt();
            if(choose3 == 1){
                Persegi persegi = new Persegi();
                System.out.println("masukkan s");
                persegi.sisi = nd.nextDouble();
                System.out.println("Luas = " + persegi.Luas());
                System.out.println("keliling = " + persegi.Keliling());
            }else if(choose3 == 2){
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                persegiPanjang.p = nd.nextDouble();
                persegiPanjang.l = nd.nextDouble();
                System.out.println("Luas = " + persegiPanjang.Luas());
                System.out.println("Keliling = " + persegiPanjang.Keliling());
            }else if (choose3 == 3){
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.r = nd.nextDouble();
                System.out.println("Luas = " + lingkaran.Luas());
                System.out.println("keliling = " + lingkaran.Keliling());

            }else if(choose3 == 4){
                Segitiga segitiga = new Segitiga();
                segitiga.a = nd.nextDouble();
                segitiga.t = nd.nextDouble();
                segitiga.s = nd.nextDouble();
                System.out.println("luas = " + segitiga.Luas());
                System.out.println("keliling = " + segitiga.Keliling());
            }else if(choose3 == 5){
                Trapesium trapesium = new Trapesium();
                trapesium.a =nd.nextDouble();
                trapesium.t = nd.nextDouble();
                trapesium.b = nd.nextDouble();
                trapesium.c = nd.nextDouble();
                System.out.println("luas = " + trapesium.Luas());
                System.out.println("keliling = " + trapesium.Keliling());
            }else if(choose3 == 6){
                Jajargenjang Jajargenjang = new Jajargenjang();
                Jajargenjang.a = nd.nextDouble();
                Jajargenjang.t = nd.nextDouble();
                Jajargenjang.b = nd.nextDouble();
                Jajargenjang.c = nd.nextDouble();
                System.out.println("luas = " + Jajargenjang.Luas());
                System.out.println("keliling = " + Jajargenjang.Keliling());
            }else if(choose3 == 7){
                Layang2 Layang2 = new Layang2();
                Layang2.d1 = nd.nextDouble();
                Layang2.d2 = nd.nextDouble();
                System.out.println("luas = " + Layang2.Luas());
                System.out.println("keliling = " + Layang2.Keliling());
            }else if(choose3 == 8){
                BelahKetupat belahKetupat = new BelahKetupat();
                belahKetupat.d1 = nd.nextDouble();
                belahKetupat.d2 = nd.nextDouble();
                System.out.println("luas = " + belahKetupat.Luas());
                System.out.println("keliling = " + belahKetupat.Keliling());
                nd.close();
            }
        }
    }
}