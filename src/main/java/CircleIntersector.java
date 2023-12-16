class CircleIntersector {
      private boolean intersects;

        public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {

            double dist = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

            this.intersects = (dist<=(double) r1+r2);
        }

        @Override
        public String toString() {
            return intersects ? "intersects" : "not intersects";
        }
    }

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}