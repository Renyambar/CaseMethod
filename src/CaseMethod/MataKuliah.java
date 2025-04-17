package CaseMethod;
public class MataKuliah {
        String kodeMK[]= {"MK001", "MK002", "MK003"};
        String namaMK[]= {"Struktur Data", "Basis Data", "Desain Web"};
        int sks []={3, 3, 3};
        
        MataKuliah(){

        }
    
        void tampilMatakuliah() {
            System.out.println("Daftar Mata Kuliah: ");
            for (int i = 0; i < kodeMK.length; i++) {
            System.out.println("Kode MK: "+kodeMK[i]+"\t|"+ "Nama: " + namaMK[i]+"\t|"+"SKS: "+sks[i]);
            }
        }
}
