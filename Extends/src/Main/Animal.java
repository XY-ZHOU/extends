package Main;

public class Animal {
    protected int age;
    protected int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("跑跳");
    }

    public void eat() {
        System.out.println("吃东西");
    }
}
