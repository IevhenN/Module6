class Distance {

    private long distance;

    public Distance(int startX, int startY, int endX, int endY) {

        this.distance = Math.round(Math.sqrt((Math.pow((endX - startX), 2) + Math.pow((endY - startY), 2))));
    }

    public long getDistance() {
        return distance;
    }
}

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}