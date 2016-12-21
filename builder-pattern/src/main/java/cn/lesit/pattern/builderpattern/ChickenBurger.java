package cn.lesit.pattern.builderpattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/21.
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "This is ChickenBurger";
    }

    public float price() {
        return 20.0f;
    }
}
