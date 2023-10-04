class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.size()==0 || arr[i]!=ans.get(0)){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>n/3){
            ans.add(arr[i]);
            }
        }
        if(ans.size()==2) break;
    }

    return ans;
    }
}