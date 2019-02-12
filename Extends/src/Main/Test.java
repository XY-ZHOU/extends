package Main;

public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(3, 18);
        System.out.println(tiger.age);
        System.out.println(tiger.weight);
        tiger.action();
    }
}
