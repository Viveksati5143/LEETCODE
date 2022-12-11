// class Solution {
//     public double average(int[] salary) {
//         double sum = 0d;
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for (int s : salary){
//             max = Math.max(max, s);
//             min = Math.min(min, s);
//             sum += s;
//         }
//         return (sum - max - min) / (salary.length - 2);
//     }
// }
class Solution {
    public double average(int[] salary){
        double res = 0;
        Arrays.sort(salary);
        for(int i=1; i<salary.length-1; i++) res += salary[i];
        return res/(salary.length-2);
    }
}
