public class User {
    private User(int id){
        this.id = id;
    }
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int id;

    public int getId() {
        return id;
    }
    public int getId(int add){
        return id+add;
    }

    public String getName() {
        return name;
    }

    public String name;
    private int age;
    public int wage;


    public User(int id, String name, int age, int wage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wage = wage;
    }


}
