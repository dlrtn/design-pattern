package dlrtn.designpattern.ch03.decorator;

import dlrtn.designpattern.ch03.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()  + ", 휘핑 크림";
    }
}
