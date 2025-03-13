//Prefix Sum Approach
public class subarraymax2 {
    public static void subarray(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];//to find prefix

        }
        for(int  i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr_sum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }

            } 
            
        }System.out.println("Max sum is: "+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subarray(arr);
    }
}
