package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int number = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            number = number * 10 + 9;
        }
        System.out.println(9 + 99 + 999 + 9999 + number);

    }
}
