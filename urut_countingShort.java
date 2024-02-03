import java.util.Scanner;
import java.util.*;

public class urut_countingShort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;

        System.out.println("masukkan angkat untuk a1 : ");
        a1 = input.nextInt();
        System.out.println("masukkan angkat untuk a2 : ");
        a2 = input.nextInt();
        System.out.println("masukkan angkat untuk a3 : ");
        a3 = input.nextInt();
        System.out.println("masukkan angkat untuk a4 : ");
        a4 = input.nextInt();
        System.out.println("masukkan angkat untuk a5 : ");
        a5 = input.nextInt();
        System.out.println("masukkan angkat untuk a6 : ");
        a6 = input.nextInt();

        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);
        // input ke array
        int array[] = { a1, a2, a3, a4, a5, a6 };
        // kita tes array work?
        printArry(array);
        countingSort(array);
        // kita tes apakah fungsi work?
        printArry(array);
    }

    public static void printArry(int array[]) {
        // fungsi untuk print array
        System.out.println("array : ");
        int hitung = 0;
        for (int i = 0; i <= 5; i++) {
            hitung++;
            if (hitung < 6) {
                System.out.print(array[i] + "||");
            } else {
                System.out.println(array[i]);
            }

        }
    }

    
}