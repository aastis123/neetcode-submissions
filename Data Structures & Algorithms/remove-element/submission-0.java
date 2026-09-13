class Solution {
public int removeElement(int[] nums, int val) {

        int count = 0;
        int i = 0;
        while(i<nums.length-count)
        {
            if(nums[i] == val)
            {
                rearrange(nums, i, count);
                count++;
            }
            else{
                i++;
            }
            
           
        }
        
return nums.length-count;
        
    }

    private void rearrange(int[] nums, int index , int count)
    {
        int temp = nums[nums.length -count -1];
        nums[nums.length -count -1] = nums[index];
        nums[index]= temp;
    }
}