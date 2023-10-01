class Solution {
    public void sortColors(int[] arr) {
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt0+=1;
            }else if(arr[i]==1){
                cnt1+=1;
            }else{
                cnt2+=1;
            }
        }
        
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i]=1;
        }
        for(int i=cnt0+cnt1;i<arr.length;i++){
            arr[i]=2;
        }
    }
}