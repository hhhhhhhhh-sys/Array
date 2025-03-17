public class largestDifference {
    public static int findLargestDifference(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num; 
            if (num > max) max = num; 
        }

        return max - min; 
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 6, 15, 2, 8};
        System.out.println("Largest Difference: " + findLargestDifference(arr));
        
    }
}
