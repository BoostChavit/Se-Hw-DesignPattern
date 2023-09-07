package ku.cs.duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate(Quackable duck){
        duck.quack();
    }

    void simulate(){
        DuckFactory duckFactory = new DuckFactory();

        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuckCounter = duckFactory.createQuackCounter(rubberDuck);
        Quackable redheadDuckCounter = duckFactory.createQuackCounter(redheadDuck);

        simulate(rubberDuck);
        simulate(redheadDuck);
        simulate(rubberDuckCounter);
        simulate(redheadDuckCounter);

        System.out.println("Counter quack : " + QuackCounter.getQuacks());
    }
}
