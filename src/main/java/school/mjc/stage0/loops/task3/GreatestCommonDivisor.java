package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

//        int gcd = 1;
//        for (int i = 1; i <= first && i <= second; i++) {
//            if (first % i == 0 && second % i == 0) {
//                gcd = i;
//            }
//        }
//
//        System.out.println(gcd);




        if (first <= 0 || second <= 0) {
            System.out.println("Числа должны быть положительными");
            return;
        }
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        System.out.println(first);



    }
}
