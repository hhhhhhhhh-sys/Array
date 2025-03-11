public class reverseArray {
    public static void ReverseArray(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        ReverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        
    }
}
