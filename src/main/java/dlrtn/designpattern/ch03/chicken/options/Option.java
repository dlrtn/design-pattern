package dlrtn.designpattern.ch03.chicken.options;

import dlrtn.designpattern.ch03.chicken.Chicken;

public interface Option extends Chicken {

        String getDescription();

        int getPrice();

}
