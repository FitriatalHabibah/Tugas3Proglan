import java.io.InputStream;
import java.util.Scanner;

/**
 *Berikut merupakan contoh dari Java Class yang mengimplementasikan pada PemebelianTiket
 */
public class PembelianTiket {
    /**
     * Memiliki 4 atribut diantaranya :
     * Name yang menggunakan tipe data String
     * Age, Set dan Grade menggunakan tipe data int
     */
    public String Name; //atribut nama
    public int Age; //atribut umur
    public int Set; //atribut banyak tiket
    public int Grade; //atribut kelas

    /**
     * Konstruktor untuk membuat objek PembelianTiket
     * @param Name  nama PembelianTiket
     * @param Age   umur PembelianTiket
     * @param Set   Banyak PembelianTiket
     * @param Grade kelas PembelianTiket
     */

    public PembelianTiket(String Name, int Age, int Set, int Grade) {
        this.Name = Name;
        this.Age = Age;
        this.Set = Set;
        this.Grade = Grade;
    }

    /**
     * Metode Penginputan
     * @param in
     */
    public PembelianTiket(InputStream in) {
    }

    /**
     * Metode untuk mengambil Total Keseluruhan dari harga Pembelian Tiket
     * Terdapat Rincian Pembelian Tiket
     * @return
     */
    public double Keseluruhan() {
        System.out.println("Kelas ");
        System.out.println("1. Ekonomi   : 40.000");
        System.out.println("2. Eksekutif : 80.000");

        Scanner inp = new Scanner(System.in);

        System.out.print("Nama   : "); //input nama
        String nama = inp.nextLine();
        System.out.print("Umur   : "); //input umur
        int umur = inp.nextInt();
        System.out.print("Banyak : "); //input jumlah tiket yang ingin dibeli
        int banyak = inp.nextInt();
        System.out.print("Kelas  : "); //input kelas
        int kelas = inp.nextInt();

        if (kelas == 1) { //kondisi
            kelas = 40000;
        } else {
            kelas = 80000;
        }

        double total = 0;
        total = banyak * kelas; //rumus dari total yang harus dibayarkan

        System.out.println("Total Keseluruhan : " + total);
        return total; //nilai kembalian
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        PembelianTiket obj = new PembelianTiket(System.in);
        obj.Keseluruhan(); //Pemanggilan Metode
    }
}
