//kadane's algorithm
public class subarraymax3 {
    public static void kadane(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        int maxNegative = Integer.MIN_VALUE;
        boolean allnegative=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                allnegative=false;//kadane applicable 
            }
            maxNegative = Math.max(maxNegative, arr[i]); // Track the largest negative number
            curr_sum=curr_sum+arr[i];

            if(curr_sum<0){
                curr_sum=0;
            }else{
                max_sum=Math.max(curr_sum, max_sum);
            }if(allnegative){
                max_sum=maxNegative;
            }
            
        }System.out.println("Max Subarray sum is: "+max_sum);

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,1,2,1,-5,-3};
        int arr1[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadane(arr);
        kadane( arr1);
        
    }
}
