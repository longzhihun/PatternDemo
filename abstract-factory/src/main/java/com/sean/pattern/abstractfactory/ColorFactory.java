package com.sean.pattern.abstractfactory;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/19.
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shapeType) {
        return null;
    }
}
