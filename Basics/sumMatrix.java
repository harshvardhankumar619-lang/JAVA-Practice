public class sumMatrix{
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Please provide the matrix order N as a command-line argument.");
            return;
        }
        int N = Integer.parseInt(args[0]);
        
        if(N<=0){
            System.out.println("Please provide matrix order N as a positive integer.");
            return;
        }

        int[][] matrix1 = GenerateRandomMatrix(N);
        int[][] matrix2 = GenerateRandomMatrix(N);

        System.out.println("Matrix1: ");
        printMatrix(matrix1);

        System.out.println("Matrix2: ");
        printMatrix(matrix2);
        
        int[][] sum;
        sum = MatrixSum(matrix1, matrix2);

        System.out.println("Sum of Matrix1 and Matrix2: ");
        printMatrix(sum);




    }
    static int[][] GenerateRandomMatrix(int N){
        int[][] matrix = new int[N][N];
        java.util.Random rand = new java.util.Random();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                matrix[i][j] = rand.nextInt(10); // Random integers between 0 and 9
            }
        }
        return matrix;
    }

    static int[][] MatrixSum(int[][] matrix1, int[][] matrix2){
        int N = matrix1.length;
        int[][] MatrixSum = new int[N][N];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                MatrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return MatrixSum;
    }
    static void printMatrix(int[][] matrix){
        int N = matrix.length;

        for(int i =0; i<N; i++){
            for(int j = 0; j<N; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}