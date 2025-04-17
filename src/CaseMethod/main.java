package CaseMethod;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            int pilihMenu = sc.nextInt();  

            switch (pilihMenu) {
                case 1:
                    System.out.println("Daftar Mahasiswa : " );

                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah : ");
                    for (MataKuliah mk : MataKuliah.daftarMK) {
                        mk.tampilMatakuliah();
                    }
                    break;
                case 3:
                    System.out.println("Data Penilaian : ");

                    break;
                case 4:
                    System.out.println("Data Penilaian : ");

                    break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang ingin dicari : ");

                    break;
                case 0:

                default:
            }
        }
    }
}
