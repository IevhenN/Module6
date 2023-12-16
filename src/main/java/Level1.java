class Level1 {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level1(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is "+levelInfo.name+", difficulty is "+levelInfo.difficulty+", point count is "+points.length;
    }

    public int calculateLevelHash(){
        int hash = 0;

        for (int i = 0; i < points.length; i++) {
            hash+=points[i].x*points[i].y;
        }

        return hash;
    }

    static class Point{
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class LevelInfo{
        private String name,difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty){
            this.name=name;
            this.difficulty = difficulty;
        }
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level1.Point p1 = new Level1.Point(3, 5);
        Level1.Point p2 = new Level1.Point(10, 100);
        Level1.Point p3 = new Level1.Point(50, 40);

        Level1.Point[] points = {p1, p2, p3};

        Level1.LevelInfo info = new Level1.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level1(info, points).calculateLevelHash());
    }
}