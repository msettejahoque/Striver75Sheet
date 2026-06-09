public class SearchInRotatedArray {
    public static int solution1(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }

    public static int solution2(int[] arr, int k){
        int low = 0;
        int high = arr.length -1;
        while(low<high){
            int mid = low + (high - low) /2;
            if(arr[mid]== k){
                return mid;
            }
            
            if(arr[low] <= arr[mid] ){
                if(arr[low] <= k && low <arr[mid]){
                    high = mid -1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid] < k && k <=arr[high]){
                    low= mid +1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int k=0;
        int p =7;
        System.out.println("At Index:"+solution1(arr, k));
        System.out.println("At index :"+solution2(arr, p));

    }
}
