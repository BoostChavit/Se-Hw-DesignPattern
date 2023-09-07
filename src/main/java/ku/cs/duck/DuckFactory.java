package ku.cs.duck;

public class DuckFactory extends AbstractDuckFactory{
    public Quackable createMallardDuck(){
        return new MallardDuck();
    }
    public Quackable createRedheadDuck(){
        return new RedheadDuck();
    }
    public Quackable createDuckCall(){
        return new DuckCall();
    }
    public Quackable createRubberDuck(){
        return new RubberDuck();
    }

    public Quackable createQuackCounter(Quackable duck){
        return new QuackCounter(duck);
    }

    public Quackable createQuackEchoAndCounter(QuackCounter duck){
        return new QuackEcho(duck);
    }
}
