class Solution {
    public int fib(int n) {
        int p=0,q=1;
        if(n==0|n==1){
            return n;
        }
        else{
        for(int i=2;i<=n;i++){
            int temp=q;
            q=p+q;
            p=temp;
        }
        return q;
        }   
    }
}