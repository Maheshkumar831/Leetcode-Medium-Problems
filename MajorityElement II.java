class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<Integer>();
        int count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MAX_VALUE;
        for(int i:nums){
            if(count1==0 && ele2!=i){//Moore Voting algorithm  //TC:O(N)    SC:O(1)
                count1=1;
                ele1=i;
            }
            else if(count2==0 && ele1!=i){
                count2=1;
                ele2=i;
            }
            else if(ele1==i){
                count1++;
            }
            else if(ele2==i){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for (int i:nums) {
            if (i == ele1) count1++;
            if (i== ele2) count2++;
        }
        int min=(int)(n/3)+1;
        if(count1>=min){
            list.add(ele1);
        }
        if(count2>=min){
            list.add(ele2);
        }
        return list;
        
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Using Hash Map for Better Approach                            //TC:O(Nlogn)   SC:O(N)
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int min=(int)n/3+1;
        for(int i=0;i<n;i++){
            int val=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],val+1);
            if(mpp.get(nums[i])==min){
                list.add(nums[i]);
            }
            if(list.size()==2)
                break;

        }
        return list;
        
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
Using Brute force         

       List<Integer>list=new ArrayList<>();                  //TC:O(N^2)   SC:O(1)
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            if((list.size()==0)||(nums[i]!=list.get(0)))
            {
                int count=0;
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>n/3)
                    list.add(nums[i]);
            }
            if(list.size()==2){
                break;
            }
        }
        return list;
        
/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?
*/
