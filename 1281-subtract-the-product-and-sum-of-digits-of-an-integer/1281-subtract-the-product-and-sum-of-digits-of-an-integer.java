class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, pr=1;
        while(n>0){
            sum+=n%10;
            pr*=n%10;
            n/=10;
        }
        return pr-sum;
    }
}