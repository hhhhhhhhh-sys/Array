import java.util.Scanner;

public class max_elemet_2d {
    public static void main(String[] args) {
        int n=3,m=3;
        int matrix[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter the value for index (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int MAX_VALUE=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>MAX_VALUE){
                    MAX_VALUE=matrix[i][j];
                }
            }
        }System.out.println("Max element is : "+MAX_VALUE);
        
    }
}
