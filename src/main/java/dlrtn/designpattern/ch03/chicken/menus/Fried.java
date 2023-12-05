package dlrtn.designpattern.ch03.chicken.menus;

import dlrtn.designpattern.ch03.chicken.Chicken;

public class Fried implements Chicken {

    public String description = "후라이드";
    public int price = 15000;

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
