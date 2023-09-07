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

        System.out.println("Composite - Flocks");

        Flock flockDucks = new Flock();

        flockDucks.add(rubberDuck);
        flockDucks.add(redheadDuck);
        flockDucks.add(rubberDuckCounter);
        flockDucks.add(redheadDuckCounter);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);

        flockDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock simulation");
        simulate(flockDucks);

        System.out.println("\nDuck Simulator: Mallard Flock simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times.");
    }
}
