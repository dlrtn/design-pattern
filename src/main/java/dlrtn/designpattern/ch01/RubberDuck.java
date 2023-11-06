package dlrtn.designpattern.ch01;

import dlrtn.designpattern.ch01.behavior.impl.FlyImpl.FlyNoWay;
import dlrtn.designpattern.ch01.behavior.impl.QuackImpl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new Squeak(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("저는 고무오리입니다.");
    }
}
