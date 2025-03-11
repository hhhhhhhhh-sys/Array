public class binarySearch {
    public static int binarysearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) { 
                return mid;
            }
            
            if (arr[mid] > key) { 
                end = mid - 1;
            } else { 
                start = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int number[] = {8, 9, 9, 10, 90}; 
        int key = 10;
        int result = binarysearch(number, key); 
        
        if (result != -1) {
            System.out.println("Index for key is: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
