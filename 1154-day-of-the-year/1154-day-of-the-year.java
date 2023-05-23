class Solution {
    public int dayOfYear(String date) {
        
        int[] days=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        String[] da=date.split("-");
        int m=Integer.valueOf(da[1]);
        int d=Integer.valueOf(da[2]);
        int y=Integer.valueOf(da[0]);
        int day=0;
        
        for (int i = 0; i <m-1 ; i++) day=day+days[i];
        
        if((((y % 4 == 0) && (y% 100!= 0)) || (y%400 == 0)) && m > 2)
            day++;

        day=day+d;
        return day;
    }
}