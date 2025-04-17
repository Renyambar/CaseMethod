package CaseMethod;
public class Mahasiswa {
    String NIM[]={"22001", "22002", "22003"};
    String nama[]={"Ali Rahman", "Budi Santoso", "Citra Dewi"};
    String prodi[]={"Informatika", "Informatika", "Informatika"};

    public Mahasiswa(){

    }

    void tampilMahasiswa(){
        System.out.println("Daftar Mahasiswa: ");
        for (int i = 0; i < NIM.length; i++) {
            System.out.println("NIM: "+NIM[i]+"\t|\t"+ "Nama: " + nama[i]+"\t|\t"+"Prodi: "+prodi[i]);
        }
    }  
    
}
