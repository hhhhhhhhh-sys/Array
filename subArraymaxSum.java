public class subArraymaxSum {
    public static void subarray(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int  i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr_sum=0;
                for(int k=start;k<end;k++){
                    curr_sum+=arr[k];
                }System.out.println(curr_sum);
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }

            } 
            
        }System.out.println("Max sum is: "+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        subarray(arr);

        
    }
}
