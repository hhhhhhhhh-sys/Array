public class sumOfRor {
    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<array.length;i++){
            int rowSum=0;
            for(int j=0;j<array.length;j++){
                rowSum+=array[i][j];
            }System.out.println("Sum of row "+(i+1)+":"+rowSum);
        }
    }
}
