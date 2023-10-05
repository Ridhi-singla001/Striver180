class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        int n=arr.length;
        
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<n;i++){
            if(mp.containsKey(target-arr[i])){
                ans[0]=i;
                ans[1]=mp.get(target-arr[i]);
                return ans;
            }
            mp.put(arr[i],i);
        }
        return ans;
    }
}