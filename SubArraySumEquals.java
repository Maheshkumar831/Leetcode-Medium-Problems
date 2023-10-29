class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];//3,2,1...2,1...1......test case2->6,5,3...5,3...3
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
}

/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 */
