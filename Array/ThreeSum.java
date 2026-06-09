import java.util.*;

public class ThreeSum {

    //Brute Force Approce
     public static List<List<Integer>> solution1(int[] arr, int n){
        Set<List<Integer>> st = new HashSet<>();

        // First loop for first element
        for (int i = 0; i < n; i++) {
            // Second loop for second element
            for (int j = i + 1; j < n; j++) {
                // Third loop for third element
                for (int k = j + 1; k < n; k++) {
                    // If triplet sum is zero
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        // Store sorted triplet to avoid duplicates
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        // Convert set to list
        return new ArrayList<>(st);
     }

     //Better Solution -
     public static List<List<Integer>> solution2(int arr[],int n){
        Set <List<Integer>> ans = new HashSet<>();

        for(int i=0;i<n;i++){
            Set <Integer> hs = new HashSet<>();
            for(int j= i+1;j<n;j++){
                int third = -(arr[i] + arr[j]);

                if(hs.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
            }
        }
        return new ArrayList<>(ans);
     }
    
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,4};

        int n = nums.length;

        List<List<Integer>> res = solution2(nums, n);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
    }
}
}
