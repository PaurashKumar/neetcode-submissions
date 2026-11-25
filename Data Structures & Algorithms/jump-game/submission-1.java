class Solution {
    public boolean canJump(int[] nums) {
        int goal=nums.length-1;


        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;
    }
}
/*
[1,2,1,0,1]

goal=4
1.
i=3
nums[i]=0
i + nums[i] >= goal. => 3+0 >= 4 
 

2.
i=2
nums[i]=1
i + nums[i] >= goal => 2+ 1 >=4
goal=4

3.
i=1
nums[i]=2
i +nums[i] >= goal => 1+ 2 >=3
goal=i => goal=4

4.
i=0;
nums[i]=1
i + nums[i]>= goal. =>0+1 >=1
goal=i => goal=4


final we check
goal==4. true then true */

