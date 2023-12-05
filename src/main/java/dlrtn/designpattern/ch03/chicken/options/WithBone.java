package dlrtn.designpattern.ch03.chicken.options;

import dlrtn.designpattern.ch03.chicken.Chicken;

public class WithBone implements IsBone {
    public Chicken chicken;

    public WithBone(Chicken chicken) {
        this.chicken = chicken;
    }

    public String getDescription() {
        double start = System.currentTimeMillis();
        String description = chicken.getDescription() + ", 뼈";
        double end = System.currentTimeMillis();

        System.out.println("WithBone.getDescription() took " + (end - start) + "ms");
        return description;
    }

    public int getPrice() {
        return chicken.getPrice() + 1000;
    }

}
