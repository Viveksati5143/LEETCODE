class Solution {
public:
    int op(int n){
        int ans = 0;
        while(n!=0){
            int temp = n%10;
            ans += (temp*temp);
            n/=10; 
        }
        return ans;
    }
    bool isHappy(int n){
        int slow=op(n), fast=op(op(n));
        while(slow!=fast){
            slow=op(slow);
            fast=op(op(fast));
        }
        return(slow==1);
    }
};