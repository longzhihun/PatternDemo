package cn.lesit.pattern.builderpattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/21.
 */
public class Pepsi extends ColdDrink {
    public String name() {
        return "This is Pepsi.";
    }

    public float price() {
        return 80.0f;
    }
}
