package lessons.lessonone;

public class SecondApp {
    public static void main(String[] args) {
        System.out.print("\r\n");
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] == 1 ? 0 : 1;
            System.out.print(a[i] + " ");
        }
        System.out.print("\r\n");
        int[] a3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] < 6) a3[i] *= 2;
            System.out.print(a3[i] + " ");
        }
        System.out.print("\r\n");
        int[] a4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = a4[0], max = a4[0], indMax = 0, indMin = 0;
        for (int i = 0; i < a4.length; i++) {
            if (a4[i] > max) {
                max = a4[i];
                indMax = i;
            }
            if (a4[i] < min) {
                min = a4[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент  в массиве под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент  в массиве под индексом " + indMin + " со значением  = " + min);


        int[][] a5 = new int[7][7];
        for (int i = 0; i < a5.length; i++) {
            for (int j = 0, j2 = a5[i].length; j < a5[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) a5[i][j] = 1;
                System.out.print(a5[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }
}
