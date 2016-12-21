package cn.lesit.pattern.builderpattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/21.
 */
public class Coke extends ColdDrink {
    public String name() {
        return "This is Coke";
    }

    public float price() {
        return 90.0f;
    }
}
