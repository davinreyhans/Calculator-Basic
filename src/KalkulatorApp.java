import java.util.Scanner;

public class KalkulatorApp {
    public static void menu1(){
        System.out.println("-----------------------------------------");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("-----------------------------------------");
        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volume");
        System.out.println("0. Tutup Aplikasi");
    }

    public static void menu2a(){
        System.out.println("-----------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("-----------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke menu sebelumnya");
    }

    public static void menu2b(){
        System.out.println("-----------------------------------------");
        System.out.println("Pilih bentuk ruang yang akan dihitung");
        System.out.println("-----------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Kembali ke menu sebelumnya");
    }

    public static void persegi(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih persegi");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan nilai sisi: ");
        int s = input.nextInt();
        int luasPersegi = s*s;

        processing();

        System.out.println("\n\nLuas dari persegi adalah " +  luasPersegi);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void lingkaran(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih lingkaran");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan nilai jari-jari: ");
        int r = input.nextInt();
        double luasLingkaran = 3.14*r;

        processing();

        System.out.println("\n\nLuas dari lingkaran adalah " +  luasLingkaran);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void segitiga(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih segitiga");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nilai alas: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai tinggi: ");
        int t = input.nextInt();

        double luasSegitga = (a*t)/2;

        processing();

        System.out.println("\n\nLuas dari segitiga adalah " +  luasSegitga);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void persegiPanjang(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih persegi panjang");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nilai panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan nilai lebar: ");
        int l = input.nextInt();

        int luasPersegiPanjang = p*l;

        processing();

        System.out.println("\n\nLuas dari persegi panjang adalah " +  luasPersegiPanjang);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void kubus(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih kubus");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan nilai sisi: ");
        int s = input.nextInt();
        int volumeKubus = s*s*s;

        processing();

        System.out.println("\n\nLuas dari persegi adalah " +  volumeKubus);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void balok(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih balok");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nilai panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan nilai lebar: ");
        int l = input.nextInt();

        System.out.print("Masukkan nilai tinggi: ");
        int t = input.nextInt();

        int volumeBalok = p*l*t;

        processing();

        System.out.println("\n\nVolume dari balok adalah " +  volumeBalok);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void tabung(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Anda memilih tabung");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nilai jari-jari: ");
        int r = input.nextInt();

        System.out.print("Masukkan nilai tinggi: ");
        int t = input.nextInt();

        double volumeBalok = 3.14*r*t;

        processing();

        System.out.println("\n\nVolume dari balok adalah " +  volumeBalok);
        System.out.println("Tekan apa saja untuk kembali ke menu utama");
        kembali();
    }

    public static void processing(){
        try {
            System.out.print("\nprocessing");
            for (int i=0;i<3;i++){
                System.out.print(".");
                Thread.sleep(1000); // mengatur program tidur selama 2 detik
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void loading(){
        try {
            Thread.sleep(500); // mengatur program tidur selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void kembali(){
        loading();
        menu1();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        menu1();
        System.out.print("\nPilih Menu: ");
        int pilih1 = input.nextInt();

        if (pilih1 == 1) {
            menu2a();
            System.out.print("\nPilih Menu: ");
            int pilih2 = input.nextInt();
            switch (pilih2){
                case 1:
                    persegi();
                    break;
                case 2:
                    lingkaran();
                    break;
                case 3:
                    segitiga();
                    break;
                case 4:
                    persegiPanjang();
                    break;
                case 0:
                    menu1();
                default:
                    System.out.println("Pilihan tidak ada\n");
                    menu2a();
            }
        } else if (pilih1 == 2) {
            menu2b();
            System.out.print("\nPilih Menu: ");
            int pilih3 = input.nextInt();
            switch (pilih3){
                case 1:
                    kubus();
                    break;
                case 2:
                    balok();
                    break;
                case 3:
                    tabung();
                    break;
                case 0:
                    menu1();
                default:
                    System.out.println("Pilihan tidak ada\n");
                    menu2a();
            }
        } else if (pilih1 == 0){
            System.exit(0);
        } else {
            System.out.println("\nPilihan tidak ada\n");
            loading();
            main(args);
        }
    }
}