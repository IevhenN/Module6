class Hero {

    private String name;
    private int hp;

    public Hero(){
        this("Paratrooper",100);
    }

    public Hero(String name, int hp){
        if (hp > 200) hp=200;
        if (hp<0) hp=0;

        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}