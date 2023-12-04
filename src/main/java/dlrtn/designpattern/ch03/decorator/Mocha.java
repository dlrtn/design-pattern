package dlrtn.designpattern.ch03.decorator;

import dlrtn.designpattern.ch03.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .20 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
