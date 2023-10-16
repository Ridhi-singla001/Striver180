class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int r=0; int s=0;
        while(x>0){
            r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        if(s==t){
            return true;
        }else{
            return false;
        }
    }
}