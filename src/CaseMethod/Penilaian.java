package CaseMethod;
public class Penilaian {
    // Mahasiswa mhs = new Mahasiswa();
    // MataKuliah mk = new MataKuliah();
    String namaMhs[] = {"Ali rahman", "Ali Rahman", "Budi Santoso", "Citra Dewi", "Citra Dewi"};
    String mk[] = {"Basis Data", "Struktur Data", "Struktur Data", "Basis Data", "Desain Web"};
    double nilaiTugas[] = {80, 60, 75, 85, 80};
    double nilaiUTS[]={85, 75, 70, 90, 90};
    double nilaiUAS[]={90, 70, 80, 95, 65};
    double nilaiAkhir[]= new double[5];
    Penilaian(){}

    void hitungNilaiAkhir(){
        for (int i = 0; i < nilaiAkhir.length; i++) {
            nilaiAkhir[i]=(nilaiTugas[i]*0.3)+(nilaiUTS[i]*0.3)+(nilaiUAS[i]*0.4);
        }
    }

    void tampilPenilaian(){
        hitungNilaiAkhir();
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println(namaMhs[i]+"\t|"+mk[i]+"\t|"+nilaiAkhir[i]);
        }
    }

    
}