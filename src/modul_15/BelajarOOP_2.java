package modul_15;
class Mahasiswa{
    static String nama;
    static String npm;
    static double ipk;
    
    static void isiData(String nm,String np,double ip){
        //memiliki 3 argument
        nama = nm;
        npm = np;
        ipk = ip;
    }
    
    static void cetakData(){
        //tidak menggunakan argument
        //berfungsi sebagai prosedur saja
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : "+nama);
        System.out.println("NPM  : "+npm);
        System.out.println("IPK  : "+ipk);
    }
}

public class BelajarOOP_2 {
    static void cetakJudul(){
        System.out.println("----------------------");
        System.out.println("PROGRAM DATA MAHASISWA");
        System.out.println("----------------------");
    }
    
     public static void main(String[] args) {
         Mahasiswa mhs = new Mahasiswa();
         cetakJudul();
         mhs.isiData("Ervina","21082010118",3.868);
         mhs.cetakData();
     }
}
