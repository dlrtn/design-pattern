package dlrtn.designpattern.ch03.chicken.menus;

import dlrtn.designpattern.ch03.chicken.Chicken;

public class Bburingcle implements Chicken {

    public String description = "뿌링클";
    public int price = 18000;

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
