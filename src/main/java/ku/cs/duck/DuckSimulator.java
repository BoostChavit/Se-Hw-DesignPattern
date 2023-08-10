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
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
//        Goose goose = new Goose();
//        Pigeon pigeon = new Pigeon();

        // System.out.println("Duck Simulator");
        System.out.println("Duck Simulator: with Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
//        simulate(new GooseAdapter(goose));
//        simulate(new PigeonAdapter(pigeon));

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }
}
