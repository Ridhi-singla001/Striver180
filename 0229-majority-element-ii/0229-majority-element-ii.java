class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=mp.getOrDefault(arr[i],0);
            mp.put(arr[i],val+1);
        }
        for (int key : mp.keySet()) {
            if (mp.get(key) > n / 3) {
                ans.add(key);
            }
        }
        return ans;
    }
}