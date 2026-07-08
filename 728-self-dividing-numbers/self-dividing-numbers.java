class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer= new ArrayList<>();
        for(int i = left; i<=right; i++){
            int temp = i;
            boolean isselfdiving = true;
            while(temp>0){
                int digit = temp % 10;
                if(digit==0 || i % digit != 0){
                    isselfdiving = false;
                    break;
                }
                temp = temp / 10;
            }
            if(isselfdiving){
             answer.add(i);
            }
        }
        return answer;
    }
}