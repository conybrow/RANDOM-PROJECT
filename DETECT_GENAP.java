import java.util.Scanner;
import java.util.ArrayList;

public class DETECT_GENAP {
    Scanner input = new Scanner(System.in);
    int[] myarray = new int[10];

    public static void main(String[] args) {
        DETECT_GENAP run = new DETECT_GENAP();

        run.runthis();

    }

    public void runthis() {
        menu();
    }

    public void menu() {

        int isi;
        System.out.println("\nSelamat datang di tugas Pertemuan Ke-4");
        System.out.println("\nSaya membuat tugas ini interaktif");
        System.out.println("\nDalam program saya ada 1 array dengan panjang 10");
        System.out.println("\nMohon input kan : ");
        System.out.println("\n11, 23, 17, 20, 9, 16, 42, 13, 37, 10");
        System.out.println("\nSecara urut");

        System.out.println("\nPanjang array : " + myarray.length);
        isiarray();
        System.out.println("\nIsi array sebelum dideteksi angka genap");
        showarray();

        System.out.println("\nIsi array setelah dideteksi angka genap dan dirubah 0");
        for (int j = 0; j < myarray.length; j++) {
            if (detect_genap(myarray[j]) == true) {
                myarray[j] = 0;
            }
        }
        showarray();
    }

    public Boolean detect_genap(int no) {
        // variabel cek untuk menjadi sebuah return
        boolean cek = false;

        // if disini untuk mengecek apakah angka tersebut habis dibagi 2?
        if (no % 2 == 0) {
            // kalau habis, berarti dia genap
            cek = true;
        }

        // kalau tidak habis maka dia bukan genap dan value dari cek tidak akan berubah
        return (cek);
    }

    public void isiarray() {
        for (int i = 0; i < myarray.length; i++) {
            System.out.print("\nInput Number : ");
            int fill = input.nextInt();
            myarray[i] = fill;
        }
    }

    public void showarray() {
        System.out.println("\nisi My Array : ");
        int show = 0;
        for (int i = 0; i < myarray.length; i++) {
            System.out.print("|| " + myarray[show] + " ");
            show++;
        }
    }
}