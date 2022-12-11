class Solution {
    public double average(int[] salary) {
        double sum = 0d;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int s : salary){
            max = Math.max(max, s);
            min = Math.min(min, s);
            sum += s;
        }
        return (sum - max - min) / (salary.length - 2);
    }
}