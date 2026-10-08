class Solution {
    public static int hcf(int min,int max){
        if(min==0) return max;
        return hcf(max%min,min);
    }
    public int findGCD(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       for(int i=1;i<=nums.length-1;i++){
        if(nums[i]>max) {
            max=nums[i];
        }    
        if(nums[i]<min) {
            min=nums[i];
        }    
       }
       return hcf(max%min,min); 
    }
}