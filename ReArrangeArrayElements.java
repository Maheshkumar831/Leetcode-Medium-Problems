class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                list1.add(nums[i]);
            else
                list2.add(nums[i]);
        
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=list1.get(i);
            nums[2*i+1]=list2.get(i);
        }
        return nums;
        
        
    }
}
/*
        
        int n=nums.length;
        ArrayList<Integer>res=new ArrayList<>(Collections.nCopies(n,0));//Nothing to 
        int posIndex=0;                                      improve time complexity TC:0
        int negIndex=1;                                       (2N),SC:o(n)
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res.set(posIndex,nums[i]);
                posIndex+=2;
            }
            else{
                res.set(negIndex,nums[i]);
                negIndex+=2;
            }
               
        }
        for(int i=0;i<n;i++){
            nums[i]=res.get(i);
        }
        return nums;
            
Example 1:
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
        
*/
