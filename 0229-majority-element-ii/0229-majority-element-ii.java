class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;

        List<Integer>ans=new ArrayList<>();
        int el1=0;
        int el2=0;
        int cnt1=0;
        int cnt2=0;

        for(int i=0;i<n;i++){
            if(cnt1==0 && arr[i]!=el2){
                el1=arr[i];
                cnt1=1;
            }else if(cnt2==0 && arr[i]!=el1){
                el2=arr[i];
                cnt2=1;
            }else if(el1==arr[i]){
                cnt1++;
            }else if(el2==arr[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }

           cnt1=0;
           cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1){
                cnt1++;
            }else if(arr[i]==el2){
                cnt2++;
            }
        }

        if(cnt1>n/3) ans.add(el1);
        if(cnt2>n/3) ans.add(el2);

        return ans;
    }
}