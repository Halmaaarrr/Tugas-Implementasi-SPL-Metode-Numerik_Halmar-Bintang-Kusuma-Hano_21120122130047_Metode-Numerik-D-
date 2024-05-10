import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

import java.util.Arrays;

public class Dekomposisi_LU_Gauss {
    public static double[] solve(double[][] A, double[] b) {
        // Mendekomposisi matriks A menjadi LU
        RealMatrix matrix = new LUDecomposition(MatrixUtils.createRealMatrix(A)).getSolver().getInverse();
        // Memecahkan sistem persamaan LUx = b
        RealVector vector = MatrixUtils.createRealVector(b);
        DecompositionSolver solver = new LUDecomposition(matrix).getSolver();
        return solver.solve(vector).toArray();
    }

    public static void main(String[] args) {
        double[][] A = {{2, 1}, {5, 3}};
        double[] b = {4, 10};
        double[] x = solve(A, b);
        System.out.println("Solusi dengan metode dekomposisi LU Gauss: " + Arrays.toString(x));
    }
}
