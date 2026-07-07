class Solution {
    public String convertToBase7(int num) {
        String answer = "";
        int temp = 0;
        if(num == 0){
            return "0";
        }
        if(num < 0){
           temp = -num;
        }else{
            temp = num;
        }
        while(temp>0){
            int digit = temp % 7;
            temp = temp / 7;
            answer = digit + answer;
        }

        if(num > 0){
        return answer;
        }else{
            return answer = "-" + answer;
        }
    }

}