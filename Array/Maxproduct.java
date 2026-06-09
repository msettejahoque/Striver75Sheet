public class Maxproduct{
    //Brute force Approch
    public static int solution1(int[] nums){
        int mp=nums[0];

        for(int i=0;i<nums.length;i++){
            int cp=1;
            for(int j=i;j<nums.length;j++){
                cp *= nums[j];

                mp= Math.max(mp,cp);
            }
        }
        return mp;
    }
    
    //optimal solution 1
    public static int solution2(int nums[]){
        int n  = nums.length;
        int pree=1;
        int suff= 1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(pree==0){
                pree=1;
            }
            if(suff==0){
                suff=1;
            }

            pree *= nums[i];

            suff *=nums[n-1-i];

            ans = Math.max(ans,Math.max(pree,suff));
        }
        return ans;
        }

        //optimal solution 3
        public static int solution3(int[]nums){
            int res = nums[0];
            int maxp= nums[0];
            int minp=nums[0];

            for(int i=1;i<nums.length;i++){
                int curr=nums[i];
                if(curr <0){
                    int temp = maxp;
                    maxp=minp;
                    minp=temp;
                }

                maxp = Math.max(curr, curr*maxp);
                minp = Math.min(curr, curr*minp);

                res= Math.max(res,maxp);
            }
            return res;
        }

    
    public static void main(String[] args) {
        int [] nums = {1,2,-3,0,-4,-5};

        //calling solution 1
        System.out.println(solution1(nums));

        //calling solution 2
        System.out.println(solution2(nums));

        //calling solution 3

        System.out.println(solution3(nums));
        
    }
}