class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;//Optimal approach TC:O(logn) SC:O(1)
        long nn = n;
        if(nn<0)nn=-1*nn;
        while (nn > 0) {
        if (nn % 2 == 1) {
            ans = ans * x;
            nn = nn - 1;
        } else {
            x = x * x;
            nn = nn / 2;
        }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
        }
}

/*    
        
        
        double ans=1.0;//Brute force approach not solved all test cases
        int posPower=n<0?-1*n:n;//TC:o(N)
        for(int i=1;i<=posPower;i++){
            ans*=x;//
        }
        if(n<0)ans=1/(double)ans;
        System.out.println(ans);
        return ans; */
