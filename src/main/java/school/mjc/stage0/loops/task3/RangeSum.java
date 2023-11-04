package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {

//        int sum = 0;
//        for (int i = 0; i <= secondBoarder; i++){
//            sum =+ i;
//        }
//        System.out.println(sum);


        int sum = 0;
        int min = Math.min(firstBoarder, secondBoarder);
        int max = Math.max(firstBoarder, secondBoarder);
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);



    }
}
