class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;       
        int arr[]=new int[2];
        int j=0;
        boolean res=false;
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                arr[j]=i;
                res=true;
                break;
            }
        }
        if(res==false){
            arr[0]=-1;
            arr[1]=-1;
        }
        j++;
        for(int i=n-1;i>=0;i--){
            if(target==nums[i]){
                arr[j]=i;
                break;
            }
        }
        return arr;
        
        
    }
}

/*
xample 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */
