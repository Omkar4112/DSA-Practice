
class Solution {
    public int[] sortedSquares(int[] nums) {
       int left=0;
        int n=nums.length;
       int right=n-1;
       int[] num=new int[n];
       int index=n-1;
       while(left<=right){
        int rightsquare=nums[right]*nums[right];
        int leftsquare=nums[left]*nums[left];
        if(rightsquare>leftsquare){
            num[index]=rightsquare;
            right--;
        }else{
            num[index]=leftsquare;
            left++;
        }
       index--;
       } 
    return num;
    }
}