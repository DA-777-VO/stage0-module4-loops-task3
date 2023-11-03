package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int sum = 0;
        String ttt = Integer.toString(t);

        for (int i = 0; i < ttt.length(); i++) {
            sum += (t % 10);
            t /=10;
        }


    }
}
