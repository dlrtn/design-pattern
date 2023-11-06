package dlrtn.designpattern.ch01;

import dlrtn.designpattern.ch01.behavior.FlyBehavior;
import dlrtn.designpattern.ch01.behavior.QuackBehavior;

public abstract class Duck {

    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void swim() {

    }

    public abstract void display();

    // other methods about duck

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
