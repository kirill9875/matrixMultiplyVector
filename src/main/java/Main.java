import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[][] massSec;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Заполнение вектора. Введите N:");
        int n = input.nextInt();
        MatrixFirst mx = new MatrixFirst(n);

        int[] sqm = MatrixFirst.choice(mx.getRows());
        mx.setArr(sqm);
        int[] array = mx.getArr();

        System.out.println();
        System.out.println(Arrays.toString(mx.getArr()));
        System.out.println("Введите элемент для поиска :");

        int res = input.nextInt();

        for(int i=0; i<array.length; i++)
            if(res == array[i])
                System.out.println("Элемент с индеком: " + i);



        // вторая часть. Матрица


        System.out.println("Какую матрицу заполнять 1- квадратную NxN, 2 - NxM ");
        int vybor = input.nextInt();
        switch (vybor){
            case 1 :
                System.out.println("Заполнение квадратной матрицы NxN. Введите N:");
                int nx = input.nextInt();
                MatrixSecond matrixSecond = new MatrixSecond(nx);
                int[][] sqmSec = MatrixSecond.choiceSec(matrixSecond.getRows(),matrixSecond.getCols());
                assert sqmSec != null;
                massSec = sqmSec;
                MatrixSecond.searchIndx(sqmSec);
                break;

            case 2:

                System.out.println("Заполнение матрицы NxM. Введите N - кол-во строк");
                int mNum = input.nextInt();
                System.out.println("Заполнение матрицы NxM. Введите M - кол-во столбцов");
                int x = input.nextInt();
                MatrixSecond matrix = new MatrixSecond(mNum,x);
                int[][] mtx = MatrixSecond.choiceSec(matrix.getRows(),matrix.getCols());
                assert mtx != null;
                massSec = mtx;
                MatrixSecond.searchIndx(mtx);
                break;

            default:
                System.out.println("Ошибка ввода");

        }

        //Умножение вектора на матрицу
        proizwedenie(array,massSec);

    }

    private static int[] proizwedenie(int[] vector, int[][] matrix2)
    {
        int dl = matrix2[0].length;
        int k = vector.length;
        System.out.println(matrix2[0].length);


        if (dl != k)
        {
            System.out.println (" умножить нельзя");
            return null;
        }
        int[] resultVector = new int[dl];

        for (int j = 0; j < dl; j++) {
            for (int i = 0; i < k; i++) {
                resultVector[j] += matrix2[i][j] * vector[i];
            }
        }
        System.out.println(
                "выводим результатирующий вектор который получился в результате перемножения вектора на матрицу");
        for (int i1 : resultVector) {
            System.out.print(i1 + " ");
        }

        return resultVector;
    }

}
