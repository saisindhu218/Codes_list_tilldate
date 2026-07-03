class Solution {
    public int numberOfSteps(int num) {
        if (num == 0)
            return 0;
        int steps = 0;
        do {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            steps++;
        } while (num > 0);
        return steps;
    }
}