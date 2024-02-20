class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);//sorting the array for solve the remaining test cases
        }
        int sum=0;
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
              max=Math.max(max,nums[j][i]);  
            }
            sum+=max;
        }
        return sum;
        
    }
}
/*
Example 1:

Input: nums = [[7,2,1],[6,4,2],[6,5,3],[3,2,1]]
Output: 15
Explanation: In the first operation, we remove 7, 6, 6, and 3. We then add 7 to our score. Next, we remove 2, 4, 5, and 2. We add 5 to our score. Lastly, we remove 1, 2, 3, and 1. We add 3 to our score. Thus, our final score is 7 + 5 + 3 = 15.
Example 2:

Input: nums = [[1]]
Output: 1
Explanation: We remove 1 and add it to the answer. We return 1.
 
*/
