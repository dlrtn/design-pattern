package dlrtn.designpattern.ch03.chicken;

import dlrtn.designpattern.ch03.chicken.menus.Bburingcle;
import dlrtn.designpattern.ch03.chicken.options.WithBone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String args[]) {
        Chicken bburingcle = new Bburingcle();

        bburingcle = new WithBone(bburingcle);

        System.out.println(bburingcle.getDescription());
        System.out.println(bburingcle.getPrice());


    }
}
