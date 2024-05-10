import java.util.Arrays;

public class Matriks_Balikan {
    public static double[] solve(double[][] A, double[] b) {
        // Mencari invers matriks A
        double[][] A_inv = inverseMatrix(A);
        // Mengalikan invers matriks A dengan vektor b
        return multiply(A_inv, b);
    }

    private static double[][] inverseMatrix(double[][] A) {
        // Implementasi untuk mencari invers matriks
        // ...
        return A;
    }

    private static double[] multiply(double[][] A, double[] b) {
        // Implementasi untuk perkalian matriks dan vektor
        // ...
        return b;
    }

    public static void main(String[] args) {
        double[][] A = {{2, 1}, {5, 3}};
        double[] b = {4, 10};
        double[] x = solve(A, b);
        System.out.println("Solusi dengan metode matriks balikan: " + Arrays.toString(x));
    }
}
