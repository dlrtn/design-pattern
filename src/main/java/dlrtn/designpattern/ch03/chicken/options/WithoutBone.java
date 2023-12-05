package dlrtn.designpattern.ch03.chicken.options;

import dlrtn.designpattern.ch03.chicken.Chicken;

public class WithoutBone implements IsBone {

    public Chicken chicken;

    public WithoutBone(Chicken chicken) {
        this.chicken = chicken;
    }
    
    public String getDescription() {
        return chicken.getDescription() + ", 순살";
    }
    
    public int getPrice() {
        return chicken.getPrice() + 2000;
    }

}
