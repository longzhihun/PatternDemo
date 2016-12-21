package cn.lesit.pattern.builderpattern;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/21.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
