class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
       int ans=0;
       int mini=arr[0];
       int profit=0;

       for(int i=1;i<n;i++){
           profit=arr[i]-mini;
           ans=Math.max(ans,profit);
           mini=Math.min(mini,arr[i]);
       }
       return ans;
    }
}