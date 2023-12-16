class LevelLoader1 {
    private static LevelLoader1 instance = new LevelLoader1();

    static public LevelLoader1 getInstance(){
        return instance;
    }

    public String load(String levelName){
        return "Loading level "+levelName+" ...";
    }

    private LevelLoader1(){

    }
}

class LevelLoaderTest1 {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader1.getInstance().load("StartLevel"));
    }
}