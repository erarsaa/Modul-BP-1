//prosedural
package modul_15;
 public class BelajarOOP {
    static String nama;
    static String npm;
    static double ipk;
    
    static void cetakJudul(){
        System.out.println("----------------------");
        System.out.println("PROGRAM DATA MAHASISWA");
        System.out.println("----------------------");
    }
    
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
    
     public static void main(String[] args) {
         cetakJudul();
         isiData("Ervina","21082010118",3.868);
         cetakData();
     }
}
