package dlrtn.designpattern.ch03;

import dlrtn.designpattern.ch03.beverage.Beverage;
import dlrtn.designpattern.ch03.beverage.Espresso;
import dlrtn.designpattern.ch03.beverage.HouseBlend;
import dlrtn.designpattern.ch03.decorator.Mocha;
import dlrtn.designpattern.ch03.decorator.Soy;
import dlrtn.designpattern.ch03.decorator.Whip;

public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        // Espresso $1.99

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2); // Mocha 추가
        beverage2 = new Mocha(beverage2); // Mocha 추가
        beverage2 = new Whip(beverage2); // Whip 추가
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        // Dark Roast Coffee, Mocha, Mocha, Whip $1.49

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3); // Soy 추가
        beverage3 = new Mocha(beverage3); // Mocha 추가
        beverage3 = new Whip(beverage3); // Whip 추가
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        // House Blend Coffee, Soy, Mocha, Whip $1.34

    }
}
