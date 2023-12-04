package dlrtn.designpattern.ch03.decorator;

import dlrtn.designpattern.ch03.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
