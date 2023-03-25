class Solution {
    public int garbageCollection(String[] gar, int[] travel) {
        int[] res = new int[gar.length];
        int m = 0, p = 0, g = 0, sum = 0;
        
        for(int i = 0; i < gar.length; i++){
            if(i > 0) res[i] = travel[i-1] + res[i-1];
            String house = gar[i];
            for (int j=0; j<house.length(); j++){
                sum++;
                char c = house.charAt(j);
                switch (c){
                    case 'G':
                        g = i;
                        break;
                    case 'M':
                        m = i;
                        break;
                    case 'P':
                        p = i;
                        break;
                }
            }
        }
        return sum + res[m] + res[p] + res[g];
    }
}