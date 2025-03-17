public class sumOfCol {
    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<array[0].length;i++){
            int colSum=0;
            for(int j=0;j<array.length;j++){
                colSum+=array[j][i];
            }System.out.println("Sum of row "+(i+1)+":"+colSum);
        }
    }
}
