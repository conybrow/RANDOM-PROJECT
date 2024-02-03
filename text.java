public static void hitungingSort(int[] array) {
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