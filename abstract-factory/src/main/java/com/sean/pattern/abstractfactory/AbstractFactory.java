package com.sean.pattern.abstractfactory;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/19.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);
}
