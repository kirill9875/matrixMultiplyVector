import java.util.Random;
import java.util.Scanner;

class MatrixSecond {

    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();
    private int rows;
    private int cols;


    MatrixSecond(int n) {
        if (n <= 0) {
            System.out.println("Не правильный ввод");
            return;
        }
        this.rows = n;
        this.cols = n;
    }

    MatrixSecond(int n, int m) {
        if (n <= 0 && m <= 0) {
            System.out.println("не правильный ввод");
            return;
        }
        this.cols = m;
        this.rows = n;
    }

    int getRows() {
        return rows;
    }


    int getCols() {
        return cols;
    }


    static int[][] choiceSec(int n, int m) {
        System.out.println("Как заполнять : 1 - случайными числами, 2 - с клавиатуры");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                return randomSquareMatrix(n, m);

            case 2:
                return keybourd(n, m);

            default:
                System.out.println("Error");
                return null;
        }

    }


    private static int[][] randomSquareMatrix(int n, int m) {
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        return arr;

    }

    private static int[][] keybourd(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Input matrix row " + i + " element no: " + j + " : ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("======= matrix =======");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + "\t");
            }
            System.out.println();
        }

        return matrix;
    }



    static void searchIndx(int[][] mass) {


        System.out.println("Введите элемент для поиска :");

        int res = input.nextInt();
        System.out.println("Внимание !Счет строк и столбцов идет с 0");


        for(int i=0; i<mass.length; i++){
            for(int j=0; j<mass[i].length; j++){
                if(res == mass[i][j]){
                    System.out.printf("%d строка %d столбец", i, j);
                    System.out.println();
                }
            }
        }

    }

}
