package modul_16;
class cMahasiswa{
    private String nama,npm,alamat;
    private double ipk;
    private int SKS;
    //member function
    public void setNama(String nm){
        nama=nm;
    }
    public void setNPM(String np){
        npm=np;
    }
    public void hitungIPK(){
        //skip
    }
    public void updateAlamat(String a){
        alamat=a;
    }
    public int cekSKS(){
        return(SKS);
    }
    
    //CONSTRUCTOR
    cMahasiswa(){
        SKS = 18;
        System.out.println("constructor default");
    }
    cMahasiswa(int s){
        SKS=s;
        System.out.println("constructor 1 argumen...");
    }
    cMahasiswa(double m,int n){
        ipk=m;
        SKS=n;
        System.out.println("constructor 2 argumen...");
    }
}

class cMataKuliah{
    public String namaMK,kodeMK;
    public int sks;
    public void setNamaMK(String nm){
        namaMK=nm;
    }
    public void ubahKodeMK(String nm){
        namaMK=nm;
    }
    public void ubahSKS(int s){
        sks=s;
    }
}

class cRuangUjian{
    private cMahasiswa mhs;
    private cMataKuliah mk;
    private String namaRuang;
    private int kapasitas;
    private int totalpeserta;
    
    void tambahPeserta(cMahasiswa m){
        mhs=m;
        totalpeserta++;
    }
    void hapusPeserta(cMahasiswa m){
        totalpeserta--;
    }
    int lihatTotalPeserta(){
        return totalpeserta;
    }
    void updateKapasitas(int k){
        kapasitas=k;
    }
    void updateNamaRuang(String nm){
        namaRuang=nm;
    }
}
public class appMahasiswa {
    public static void main(String[] args) {
        cMahasiswa mhs1 = new cMahasiswa();
        cMahasiswa mhs2 = new cMahasiswa();
        cMahasiswa mhs3 = new cMahasiswa();
        cMataKuliah BP2 = new cMataKuliah();
        cRuangUjian R202 = new cRuangUjian();
        
        mhs1.setNama("Ervina Rosa Aulia");
        mhs1.setNPM("21082010118");
        mhs1.updateAlamat("Surabaya");
        
        BP2.setNamaMK("Bahasa Pemrograman 2");
        BP2.ubahKodeMK("SI2022");
        BP2.ubahSKS(3);
        
        R202.updateKapasitas(30);
        R202.tambahPeserta(mhs1);
        System.out.println("Peserta : ");
        System.out.println(R202.lihatTotalPeserta());
        
        
        //CONSTRUCTOR
        System.out.println("\n===CONSTRUCTOR===");
        cMahasiswa MHS1 = new cMahasiswa();
        cMahasiswa MHS2 = new cMahasiswa(20);
        cMahasiswa MHS3 = new cMahasiswa(3.5,24);
    }
}
