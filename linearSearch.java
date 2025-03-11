public class linearSearch {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,20,15};
        int key=10;
        
        int index=linearSearch(number, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key found at index: "+index);
        }
        
    }
}
