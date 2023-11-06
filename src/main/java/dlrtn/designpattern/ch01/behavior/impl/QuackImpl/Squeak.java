package dlrtn.designpattern.ch01.behavior.impl.QuackImpl;

import dlrtn.designpattern.ch01.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
