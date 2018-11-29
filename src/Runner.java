import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        SortCompetition sortComp = new Team6SortCompetition();
        int[] challenge1Arr = Utilities.genIntArr(10000);
        int[] challenge3Arr = Utilities.mostlySortedArr(75000,25000);
        //Challenge 1
        //System.out.println(Arrays.toString(challenge1Arr));
        long startTime = System.currentTimeMillis();
        System.out.println("Challenge 1 Median: " + sortComp.challengeOne(challenge1Arr));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        //System.out.println(Arrays.toString(challenge1Arr));
        System.out.println("Challenge 1 time: " + duration + "ms.\n");
        //Challenge 3
        //System.out.println(Arrays.toString(challenge3Arr));
        startTime = System.currentTimeMillis();
        System.out.println("Challenge 3 Median: " + sortComp.challengeThree(challenge3Arr));
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        //System.out.println(Arrays.toString(challenge3Arr));
        System.out.println("Challenge 3 time: " + duration + "ms.\n");

    }
}