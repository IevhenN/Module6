import java.util.Arrays;
class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets){
       double distance = -1.0;
       double currentDistance;
       int index=-1;

        for (int i = 0; i < targets.length; i++) {
            currentDistance=Math.round(Math.sqrt((Math.pow((targets[i][0] - aiCoords[0]), 2) + Math.pow((targets[i][1] - aiCoords[1]), 2))));

            if (i==0) {
                distance = currentDistance;
                index = i;
            }
            else if (currentDistance<distance){
                distance=currentDistance;
                index=i;
            }


        };

        if (index!=-1)
            return new int[] {targets[index][0],targets[index][1]};

        return new int[] {0,0};
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
