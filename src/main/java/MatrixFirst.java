import java.util.Random;
import java.util.Scanner;

public class MatrixFirst {
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();
    private int rows;
    private int[] arr;


    void setArr(int[] arr) {
        this.arr = arr;
    }

    MatrixFirst(int n) {
        if (n <= 0 ) {
            System.out.println("не правильный ввод");
            return;
        }
        this.rows = n;
    }

    int getRows() {
        return rows;
    }

    int[] getArr() {
        return arr;
    }

    public MatrixFirst(int[] a, int n) {
        if (n <= 0 ) {
            System.out.println("не правильный ввод");
            return;
        }
        this.rows = n;
        this.arr = a;
    }

    static int[] choice(int n) {
        System.out.println("Как заполнять : 1 - случайными числами, 2 - с клавиатуры");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                return randomSquareMatrix(n);

            case 2:
                return keybourd(n);

            default:
                System.out.println("Error");
                return null;
        }

    }
    private static int[] randomSquareMatrix(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
        }

        return arr;

    }
    private static int[] keybourd(int n) {
        int[] matrix = new int[n];
        for (int i = 0; i < matrix.length; i++) {
                System.out.print("Input matrix row " + i + " : ");
                matrix[i] = input.nextInt();
        }
        System.out.println("======= matrix =======");
        for (int aMatrix : matrix) {
            System.out.print(aMatrix + "\t");
        }

        return matrix;
    }


}
