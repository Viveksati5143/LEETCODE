class Solution {
    public int fib(int n) {
        int a=0,b=1,c=0;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}