package dlrtn.designpattern.ch03.decorator;

import dlrtn.designpattern.ch03.beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .15 + beverage.cost();
    }


    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
