import java.util.*;

public class urut {
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
        System.out.println("Menggunakan mergeshort : ");
        printArry(array);
        mergeShort(array);
        printArry(array);

        System.out.println("Menggunakan Counting Short : ");
        printArry(array);
        countingSort(array);
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

    public static void merge(int aray[], int left[], int right[]) {
        int x = 0;
        int y = 0;
        int z = 0;

        while (x < left.length && y < right.length) {
            // penukaran posisi
            if (left[x] <= right[y]) {
                aray[z] = left[x];
                x++;
            } else {
                aray[z] = right[y];
                y++;
            }
            z++;
        }

        // jika masih ada sisa
        while (x < left.length) {
            aray[z] = left[x];
            x++;
            z++;
        }

        while (y < right.length) {
            aray[z] = right[y];
            y++;
            z++;
        }
    }

    public static void mergeShort(int array[]) {
        int panjang = array.length;
        if (panjang > 1) {
            int tengah = panjang / 2;

            // pemecahan array
            int left[] = new int[tengah];
            int right[] = new int[panjang - tengah];

            System.arraycopy(array, 0, left, 0, tengah);
            System.arraycopy(array, tengah, right, 0, panjang - tengah);

            // rekursifkan fungsi
            mergeShort(left);
            mergeShort(right);

            // penukaran posisi
            merge(array, left, right);
        }
    }

    public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().orElse(0);
        int min = Arrays.stream(array).min().orElse(0);
        int rentang = max - min + 1;

        int[] hitung = new int[rentang];
        int[] go = new int[array.length];

        for (int i : array) {
            hitung[i - min]++;
        }

        for (int i = 1; i < hitung.length; i++) {
            hitung[i] += hitung[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            go[hitung[array[i] - min] - 1] = array[i];
            hitung[array[i] - min]--;
        }

        // Menyalin array go ke array asli
        System.arraycopy(go, 0, array, 0, array.length);
    }
}