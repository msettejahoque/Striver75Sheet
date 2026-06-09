import java.util.*;

public class ContainsDuplicate {
    //Bootforce Solution
    public static  boolean solution1(int[]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Optimal Solution
    public static boolean solution2(int[]nums){
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[]= {1,2,3,1};

        if(solution1(nums)){
            System.out.println("True");
            }else{
                System.out.println("False");
            }
    }
}
