package dlrtn.designpattern.ch01;

import dlrtn.designpattern.ch01.behavior.impl.FlyImpl.FlyWithWings;
import dlrtn.designpattern.ch01.behavior.impl.QuackImpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("저는 청둥오리입니다.");
    }
}
