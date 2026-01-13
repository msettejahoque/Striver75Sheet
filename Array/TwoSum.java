package Array;

import java.util.HashMap;

public class TwoSum {
    //Solution 1: Brute Force
    public static int[] Solution1(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    //Solution 2: Using Hash Map 
    public static int[] Solution2(int []nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }  else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
    public static void main (String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 10;
        // Using Solution 1
        int[] result1 = Solution1(nums, target);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");      

        // Using Solution 2
        int[] result2 = Solution2(nums, target);  
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");
        
    }
}