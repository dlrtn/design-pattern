package dlrtn.designpattern.ch03.chicken.menus;

import dlrtn.designpattern.ch03.chicken.Chicken;

public class HotFried implements Chicken {

    public String description = "핫후라이드";
    public int price = 17000;

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
