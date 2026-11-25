class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     
    int l=1;
    int r=Arrays.stream(piles).max().getAsInt();
    int speed=r;
     while(l<=r){
        int k= (l+r)/2;
        long timetaken=0;
        for(int p:piles){
            timetaken+=(int)Math.ceil((double) p / k);
        }
        if(timetaken <=h){
            speed=k;
            r= k-1;
        }else{
            l=k+1;
        }
     }
    return speed;
    }
}
