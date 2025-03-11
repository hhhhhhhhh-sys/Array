public class largestDigit {
    
    public static int findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i]; 
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,10,12};
        int largestNum=findLargest(arr);
        System.out.println("Largest element is the given array is: "+largestNum);

    }
}
