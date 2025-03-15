import java.util.Scanner;

public class SpiralMatrix {
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int startRow=0,endRow=matrix.length-1,startCol=0,endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]);//for top

            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]);//right
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[startRow][j]);//bottom
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]);//left 
            }startRow++;
            endRow--;
            startCol++;
            endCol--;
        }System.out.println();

           }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        // Taking input for the matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix in spiral order
        printSpiral(matrix, rows, cols);
        sc.close();
    }
}
