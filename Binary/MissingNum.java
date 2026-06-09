public class MissingNum {
    public static int  getMissingNum(int arr[]){
        int n = arr.length + 1;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum1 = sum1 ^ arr[i];
        }
        for(int i=1;i<=n;i++){
            sum2= sum2 ^ i;
        }
        int res = sum1 ^ sum2;
        return res;

    }
    public static void main(String[] args) {
        int arr []={3,1,5,2,4,8,7,9};
        System.out.println(getMissingNum(arr));

    }
}
