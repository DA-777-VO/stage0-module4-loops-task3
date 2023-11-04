package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        if (t < 0) {
            t = -t;
        }

        String tnum = Integer.toString(t);


        int sum = 0;


        for (int i = 0; i < tnum.length(); i++) {
            sum += (t % 10);
            t /= 10;
        }


        System.out.println(sum);


    }
}
