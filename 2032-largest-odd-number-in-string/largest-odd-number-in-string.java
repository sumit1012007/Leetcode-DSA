class Solution {
    public String largestOddNumber(String num) {
        int right =num.length()-1;
        int left=0;

        while(left<=right){
            int a =num.charAt(right)-'0';
            
            if(a%2!=0){
               return num.substring(left,right+1);
            }
            else{right--;
            }
    } return "" ;
} 
}