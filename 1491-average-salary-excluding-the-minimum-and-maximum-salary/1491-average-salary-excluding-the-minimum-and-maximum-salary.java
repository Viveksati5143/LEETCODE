class Solution {
    public double average(int[] salary) {
        double res=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            res+=salary[i];   
        }
        res/=salary.length-2;
        return res;
    }
}