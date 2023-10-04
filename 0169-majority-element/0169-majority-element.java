class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=mp.getOrDefault(arr[i],0);
            mp.put(arr[i],val+1);
        }

        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(it.getValue()> (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}