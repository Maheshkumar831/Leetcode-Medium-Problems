class Solution {
    public int reverse(int x) {
       int sign=1;
       if(x<0)
            sign=0;
        long rev=0;
        x=Math.abs(x);
        while(x!=0){
            rev=(rev*10)+(x%10);
            x/=10;
            if(rev<Integer.MIN_VALUE ||rev>Integer.MAX_VALUE)
                return 0;
        }
        if(sign==0)
            return -1*(int)rev;
        
        else 
            return (int)rev;
    }
}
