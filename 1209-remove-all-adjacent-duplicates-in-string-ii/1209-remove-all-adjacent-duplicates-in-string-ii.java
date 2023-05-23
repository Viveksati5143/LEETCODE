class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int []> res = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!res.isEmpty() && res.peek()[0] == ch){
                res.peek()[1]++;
            }
            else res.push(new int[]{ch, 1});
            if(res.peek()[1] == k) res.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()){
            int top[] = res.pop();
            while(top[1] --> 0) sb.append((char)top[0]);
        }
        return sb.reverse().toString();
    }
}