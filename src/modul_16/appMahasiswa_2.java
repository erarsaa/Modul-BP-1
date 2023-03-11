package modul_16;
class cMAHASISWA{
    //data member
    private String nama,npm,alamat;
    private double ipk;
    private int SKS;
    cMAHASISWA(){
        SKS=18;
        System.out.println("Object mhs dibuat...");
    }
    cMAHASISWA(int s){
        SKS=s;
        System.out.println("Object mhs dibuat...");
    }
    cMAHASISWA(double m,int n){
        ipk=m;
        SKS=n;
        System.out.println("Object mhs dibuat...");
    }
    public void setNama(String nm){
        nama=nm;
    }
    public void setNPM(String np){
        npm=np;
    }
    public void setIPK(double ip){
        ipk=ip;
    }
    public void setSKS(int sks){
        SKS=sks;
    }
    public void setAlamat(String al){
        alamat=al;
    }
    public String getNama(){
        return nama;
    }
    public String getNPM(){
        return npm;
    }
    public double getIPK(){
        return ipk;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getSKS(){
        return(SKS);
    }
    public String ToString(){
        return "IPK Mahasiswa NPM "+npm+" : "+ipk;
    }
}

class cMATAKULIAH{
    public String namaMK,kodeMK;
    public int sks;
    cMATAKULIAH(String k){
        kodeMK="SI";
        System.out.println("Object mata kuliah dibuat...");
    }
    public void setNamaMK(String nm){
        namaMK=nm;
    }
    public void setKodeMK(String kd){
        kodeMK=kodeMK.concat(kd);
    }
    public void setSKS(int s){
        sks = s;
    }
    public String getNamaMK(){
        return namaMK;
    }
    public String getKodeMK(){
        return kodeMK;
    }
    public int getSKS(){
        return sks;
    }
    public String ToString(){
        return "Bobot MK "+namaMK+" : "+sks;
    }
}

class cRUANGUJIAN{
    private cMAHASISWA MHS;
    private cMATAKULIAH MK;
    private String NAMARUANG;
    private int KAPASITAS;
    private int TOTALPESERTA;
    cRUANGUJIAN(int k){
        KAPASITAS=k;
        System.out.println("Object ruang ujian dibuat...");
    }
    public void tambahPeserta(cMAHASISWA m){
        MHS =m;
        TOTALPESERTA++;
    }
    public void hapusPeserta(){
        TOTALPESERTA--;
    }
    public String getMahasiswa(){
        return MHS.getNama();
    }
    public String getNamaRuang(){
        return NAMARUANG;
    }
    public int getKapasistas(){
        return KAPASITAS;
    }
    public int getTotalPeserta(){
        return TOTALPESERTA;
    }
    public void setMK(cMATAKULIAH m){
        MK=m;
    }
    public void setKapasitas(int k){
        KAPASITAS=k;
    }
    public void setTotalPeserta(int t){
        TOTALPESERTA=t;
    }
    public void setNamaRuang(String nm){
        NAMARUANG=nm;
    }
    public String ToSstring(){
        return "Kapasitas Ruang "+NAMARUANG+" : "+KAPASITAS;
    }
    
}
public class appMahasiswa_2 {
    public static void main(String[] args) {
        cMAHASISWA MHS1 = new cMAHASISWA();
        cMATAKULIAH BP2 = new cMATAKULIAH("SI");
        cRUANGUJIAN R202 = new cRUANGUJIAN(30);
        
        MHS1.setNPM("21082010118");
        MHS1.setNama("Ervina Rosa Aulia");
        MHS1.setIPK(38.68);
        MHS1.setAlamat("Depok");
        
        System.out.println("Nama Mhs : "+MHS1.getNama());
        System.out.println("NPM : "+MHS1.getNPM());
        System.out.println("Alamat Asal : "+MHS1.getAlamat());
        System.out.println(MHS1.ToString());
        
        BP2.setNamaMK("Bahasa Pemrograman 2");
        BP2.setKodeMK("2022");
        BP2.setSKS(3);
        
        R202.setNamaRuang("202");
        R202.setKapasitas(30);
        
        //passing object sebagai argument method
        R202.setMK(BP2);
        R202.tambahPeserta(MHS1);
        
        System.out.print("Peserta Ujian Ruang ");
        System.out.print(R202.getNamaRuang());
        System.out.println(" : "+R202.getMahasiswa());
        System.out.println(R202.ToSstring());
    }
}
