import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    public int m;
    public int n;
    public int [][] matrix;
    static Random randomMatrix = new Random();

    public Matrix() {
        m = 0;
        n = 0;
        matrix = new int[m][n];
    }
    public Matrix(int m, int n){
        this.m = m;
        this.n = n;
        matrix = new int[m][n];
        RandomMatrix();
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    private static int GetRandomMatrix(int start, int end)
    {
        return randomMatrix.nextInt(start, end);
    }

    public void RandomMatrix()
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = GetRandomMatrix(0, 10);
            }
        }
    }
    public int FindMaxElement(){
        int maxEl = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > maxEl ) {
                    maxEl = matrix[i][j];
                }
            }
        }
        return maxEl;
    }
    public void SortMatrixByColumns(){
        int temp = 0;
        for (int t = 0; t < getN(); t++) {
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (j != getN() - 1) {
                        if (matrix[j + 1][i] < matrix[j][i]) {
                            temp = matrix[j][i];
                            matrix[j][i] = matrix[j + 1][i];
                            matrix[j + 1][i] = temp;
                        }
                    } else {
                        break;
                    }
                }

            }
        }
    }
    public List<Integer> FibonacciNumbers(int lastNumber)
    {
        List<Integer> fib = new ArrayList<>();
        int number = 1;
        int i = 0;
        while (number <= lastNumber)
        {
            fib.add(number);

            if (i == 0)
            {
                number = 1;
            }
            else
            {
                number = fib.get(i) + fib.get(i - 1);
            }
            i++;
        }
        return fib;
    }
    public List<Integer> MatchWithFibonacci() {
        var fibonacciNumbers = FibonacciNumbers(FindMaxElement());
        List<Integer> Vector = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            Task:
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < fibonacciNumbers.size() - 1; k++) {
                    if (matrix[j][i] == fibonacciNumbers.get(k)){
                        Vector.add(matrix[j][i]);
                        break Task;
                    } else if (matrix[j][i] == 0) {
                        Vector.add(0);
                        break Task;
                    }
                }
            }
        }
        return Vector;
    }
    @Override
    public String toString() {
        StringBuilder aString = new StringBuilder();
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                aString.append(matrix[i][j]).append("\t");
            }
            aString.append("\n");
        }
        return aString.toString();
    }
}
