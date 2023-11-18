class User {
    private boolean admin;
    private String name;

    public User(String name) {
        this(name, false);
    }

    public User(String name, boolean admin) {
        this.name = name;
        this.admin = admin;

        System.out.println("Name is " + name + ", is admin: " + admin);
    }
}

class Launcher {
    public static void main(String[] args) {
        new User("Max");
        new User("Johny", true);
    }
}