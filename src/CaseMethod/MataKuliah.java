package CaseMethod;
public class MataKuliah {
        String kodeMK;
        String namaMK;
        int sks;
    
        static MataKuliah[] daftarMK = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };
    
        public MataKuliah(String kodeMK, String namaMK, int sks) {
            this.kodeMK = kodeMK;
            this.namaMK = namaMK;
            this.sks = sks;
        }
    
        public void tampilMatakuliah() {
            System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK + " | SKS: " + sks);
        }
}
