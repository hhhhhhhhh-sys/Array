public class largestElement {
    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        int largest=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i][j]>largest){
                    largest=array[i][j];
                }
            }
        }System.out.println("Largest element is: "+largest);
    }
}
