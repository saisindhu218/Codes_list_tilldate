class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> answer= new ArrayList<>();
    for(int i=left; i<=right;i++){
        int temp = i;
        boolean isvalid= true;
        while(temp>0){
            int digit = temp % 10;
            if(digit == 0 || i % digit != 0){
                isvalid =false;
                break;
            }
            temp = temp / 10;
        }
        if(isvalid){
        answer.add(i);
        }
    }
    return answer;
    }
}