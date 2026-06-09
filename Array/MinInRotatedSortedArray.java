public class MinInRotatedSortedArray {

    //Brute force Approache - simple liniar search over the array
    public static int solution1(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }

    //Optimal solution
    public static int solution2(int arr[]){
        int n = arr.length;
        int low =0;
        int high = n-1;
        while(low <high){
            int mid = low + (high - low) /2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else{
                high= mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int arr []= {4,5,6,7,1,2,3};
        System.out.println("Minimum of the sorted rotated array: "+solution1(arr));
        System.out.println("Minimum of the sorted rotated array: "+solution2(arr));
    }
}
