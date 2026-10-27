class Solution {
    public boolean checkPerfectNumber(int num) {
        int pSum =0;
        for(int i=1; i<num;i++){
            if(num%i==0){
                pSum +=i;
            }
        }
        if(pSum==num){
            return true;}
        else{
        return false;}
        
    }
}