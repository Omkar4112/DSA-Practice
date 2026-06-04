class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int i=n-1;i>=2;i--){
            int left=i-1;
            int right=0;
            while(right<left){
                int tar=arr[i]+arr[left]+arr[right];
                if(tar<sum){
                    count+=(left-right);
                    right++;
                }else{
                    left--;
                }
            }
        }return count;
    }
}