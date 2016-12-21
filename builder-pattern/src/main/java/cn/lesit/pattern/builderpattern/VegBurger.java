package cn.lesit.pattern.builderpattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/21.
 */
public class VegBurger extends Burger {

    public String name() {
        return "VegBurger";
    }

    public float price() {
        return 25.0f;
    }
}
