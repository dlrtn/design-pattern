package dlrtn.designpattern.ch01;

import dlrtn.designpattern.ch01.behavior.impl.FlyImpl.FlyWithWings;
import dlrtn.designpattern.ch01.behavior.impl.QuackImpl.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("저는 빨간머리오리입니다.");
    }
}
