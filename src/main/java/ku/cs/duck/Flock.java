package ku.cs.duck;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add (Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}