package dlrtn.designpattern.ch01.behavior.impl.FlyImpl;

import dlrtn.designpattern.ch01.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
