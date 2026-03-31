class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if(x<0){
            flag = true;
            x *=-1;
        }
        int n = x;
        int rev=0;
        while(n>0){
            int lastn = n%10;
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0;
            }
            rev = rev*10 + lastn;
            n/=10;
        }
        
        if(flag){
            rev*=-1;
        }
        return (int)rev;
    }
}