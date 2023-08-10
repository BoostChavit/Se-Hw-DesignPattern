package ku.cs.duck;

public class PigeonAdapter implements Quackable{
    Pigeon pigeon;

    PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
