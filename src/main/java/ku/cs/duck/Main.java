package ku.cs.duck;

public class Main {
    public static void main(String[] args) {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();

        mallardDuck.quack();
        redheadDuck.quack();
    }
}
